package com.xiaocai.demo.java.mapper.loader;

import java.io.*;
import java.util.*;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CustomerLoadJarClassLoader ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/27 15:07
 * @Version ： 1.0
 **/
public class CustomerLoadJarClassLoader extends ClassLoader implements Closeable {
    /**
     * META-INF.MF定义的链码基础扫描路径
     */
    private static final String CHAINCODE_BASE_PACKAGE = "Chaincode-Base-Package";
    /**
     * 解压的临时包名
     */
    private static final String JAR_TMP_PACKAGE = "chaincode";

    private static final int BUFFER_SIZE = 1024;

    private Map<String, byte[]> map;
    /**
     * 如果用户不配置,那么默认扫描com.xxx包下面的注解包
     */
    private List<String> packageScanList = Arrays.asList("com.jd.icity");

    private List<String> classNameList = new ArrayList<>(256);
    /**
     * 由顶级加载器和扩展加载器的列表信息
     */
    private List<String> bootAndExtLoaderList = Arrays.asList("sun", "java", "javax", "jdk", "javassist");

    public CustomerLoadJarClassLoader(String jarPath) throws FileNotFoundException {
        /**
         * 设置当前类加载器的父类为当前线程的类加载器,因为默认是使用的是appclassloader,
         * 但是springboot项目的classloader是springboot自定义的classloader(具体可看打包好后的jar文件的META-INF.MF文件,指定的启动类为springboot的loader),
         * 这就会导致加载对应文件不直接属于classloader,相关校验就会失败
         */
        super(Thread.currentThread().getContextClassLoader());
        if (!jarPath.endsWith(".jar")) {
            throw new IllegalArgumentException("jarFile is not a jar" + jarPath);
        }
        dealChaincodeScanList(jarPath);
        map = new HashMap<>(64);
        unzipJarAndRead(jarPath);
        dealLibJar(jarPath);
    }

    /**
     * 获取jar名称路径,以及对应的需要扫描的类路径信息
     *
     * @param jarPath 包含jar名称的文件
     * @return
     * @throws FileNotFoundException
     */
    private void dealChaincodeScanList(String jarPath) throws FileNotFoundException {
        try {
            JarFile jarFile = new JarFile(jarPath);
            Manifest manifest = jarFile.getManifest();

            Attributes mainAttributes = manifest.getMainAttributes();
            //得到需要进行扫描的类信息
            String mainPackage = mainAttributes.getValue(CHAINCODE_BASE_PACKAGE);
            if (null != mainPackage) {
                this.packageScanList = Arrays.asList(mainPackage.split(","));
            }
        } catch (IOException e) {
            throw new FileNotFoundException("jar:" + jarPath + " not exist");
        }
    }

    /**
     * 解压jar文件,并且进行读取加载,
     * 如果读取到类信息了,那么则进行读取,
     * 如果读取到的是jar内容,那么则进行解压,然后进行文件处理,并读取相应的类文件进行然后进行加载
     *
     * @param jarPath
     */
    private void unzipJarAndRead(String jarPath) {
        //直接解压jar文件,然后递归查询class文件,以及对应的.jar文件,并加载jar文件进行读取
        try {
            /**
             * 直接在对应的jarPath路径下进行解压即可,因为本来路径就是唯一的,而且清理的时候也比较方便
             */
            File tmpFolder = new File(jarPath);
            String folderParent = tmpFolder.getParent();
            File folder = new File(folderParent, JAR_TMP_PACKAGE);
            if (!folder.exists()) {
                folder.mkdir();
            }
            // 设置jvm关闭的时候自动删除
            folder.deleteOnExit();

            JarFile jarFile = new JarFile(jarPath);
            Enumeration<JarEntry> entries = jarFile.entries();
            while (entries.hasMoreElements()) {
                JarEntry jarEntry = entries.nextElement();
                String name = jarEntry.getName();
                if (name.endsWith(".jar")) {
                    dealJarFile(name, folder, jarFile, jarEntry);
                } else if (name.endsWith(".class")) {
                    dealClass(name, jarFile, jarEntry);
                }
                //其他类型的暂时不关心,忽略即可
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 对文件是jar的类进行处理
     *
     * @param name
     * @param libJarPath 依赖的jar包解压路径
     */
    private static void dealJarFile(String name, File libJarPath, JarFile jarFile, JarEntry jarEntry) {
        System.out.println("unzip jar file:" + name);

        //对jar文件进行解压
        String[] split = name.split("/");
        if (split.length > 1) {
            File file = new File(libJarPath, split[split.length - 1]);
            try {
                if (!file.exists()) {
                    boolean success = file.createNewFile();
                    if (!success) {
                        throw new RuntimeException("create file:" + file.getPath() + " exception");
                    }
                }
                unpack(jarFile, jarEntry, file);
                file.deleteOnExit();
            } catch (IOException e) {
                System.out.println("unzip jar exception:" + e.getMessage());
            }

        }
    }

    /**
     * 对jar包进行解压
     *
     * @param jarFile
     * @param entry
     * @param file
     * @throws IOException
     */
    private static void unpack(JarFile jarFile, JarEntry entry, File file) throws IOException {
        try (InputStream inputStream = jarFile.getInputStream(entry)) {
            try (OutputStream outputStream = new FileOutputStream(file)) {
                byte[] buffer = new byte[BUFFER_SIZE];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
                outputStream.flush();
            }
        }
    }

    /**
     * 处理加载类信息的逻辑
     * 如果在map中已经存在了,那么则直接不进行处理,
     * 如果不存在,那么则进行读取类文件,然后放入map中,并将扫描包列表信息进行判断,是否是设置的开头参数,如果有才放入类列表中
     *
     * @param name
     * @param jarFile
     * @param jarEntry
     */
    private void dealClass(String name, JarFile jarFile, JarEntry jarEntry) {
        String className = name.replace(".class", "").replaceAll("/", ".");
        if (!map.containsKey(className)) {
            byte[] b = getClassByte(jarFile, jarEntry);
            if (null != b) {
                map.put(className, b);
                //需要判断是否是需要进行扫描的包路径,然后进行添加
                packageScanList.stream().forEach(v -> {
                    if (className.startsWith(v)) {
                        classNameList.add(className);
                    }
                });
            }
        }
    }

    /**
     * 对有依赖的jar包进行处理,加载到内存中
     */
    private void dealLibJar(String jarPath) {
        File tmpFolder = new File(jarPath);
        String folderParent = tmpFolder.getParent();
        File folder = new File(folderParent, JAR_TMP_PACKAGE);
        if (!folder.exists()) {
            System.out.println("no lib jar exist,will be return");
            return;
        }

        File[] files = folder.listFiles();
        if (files.length == 0) {
//            System.out.println("jar list is empty,will be return");
            return;
        }
        for (File file : files) {
            JarFile jarFile = null;
            try {
                jarFile = new JarFile(file);
                Enumeration<JarEntry> entries = jarFile.entries();
                while (entries.hasMoreElements()) {
                    JarEntry jarEntry = entries.nextElement();
                    String name = jarEntry.getName();
                    /**
                     * 针对lib里面的jar包,只会解析.class文件,对其他不关心
                     */
                    if (name.endsWith(".class")) {
                        dealClass(name, jarFile, jarEntry);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<String> getClassNameList() {
        return classNameList;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] b;
        if (map.containsKey(name)) {
            b = map.get(name);
        } else {
            throw new ClassNotFoundException(name);
        }
        return defineClass(name, b, 0, b.length);
    }

    /**
     * 获取某个jar里面的信息
     *
     * @param jarFile
     * @param jarEntry
     * @return
     */
    private byte[] getClassByte(JarFile jarFile, JarEntry jarEntry) {
        try (InputStream input = jarFile.getInputStream(jarEntry)) {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            int bufferSize = 4096;
            byte[] buffer = new byte[bufferSize];
            int bytesNumRead = 0;
            while ((bytesNumRead = input.read(buffer)) != -1) {
                baos.write(buffer, 0, bytesNumRead);
            }
            return baos.toByteArray();
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
        }
        return null;
    }

    @Override
    public void close() throws IOException {
        if (!map.isEmpty()) {
            map.clear();
        }
        if (!classNameList.isEmpty()) {
            classNameList.clear();
        }
    }
}
