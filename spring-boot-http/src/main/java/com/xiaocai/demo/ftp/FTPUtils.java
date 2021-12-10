package com.xiaocai.demo.ftp;

import it.sauronsoftware.ftp4j.FTPClient;
import it.sauronsoftware.ftp4j.FTPException;
import it.sauronsoftware.ftp4j.FTPFile;
import lombok.extern.log4j.Log4j;
import org.springframework.util.StringUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * 支持FTP和FTPS方式,进行下载,上传,删除文件和目录等操作
 *
 * ftp4j-1.7.2.jar
 * @author wxf
 * @since 2015.4.10
 */
@Log4j
public class FTPUtils {

	/**
	 * FTP服务地址
	 */
	private String ADDRESS;

	/**
	 * FTP登录用户名
	 */
	private String USERNAME;
	/**
	 * FTP登录密码
	 */
	private String PASSWORD;

	/**
	 * 构造方法
	 */
	protected FTPUtils(String address, String userName, String passWord ) {
		ADDRESS = address;
		USERNAME = userName;
		PASSWORD = passWord;
	}
	
	public static FTPUtils getInstance(String address, String userName, String passWord){
		return new FTPUtils(address, userName, passWord);
	}

	/**
	 * 获取FTP客户端对象
	 * 
	 * @return FTPClient
	 */
	private FTPClient getClient() {
		return getFTPClient();
	}

	/**
	 * 获取FTPS客户端对象
	 * 
	 * @return FTPClient
	 * @throws Exception
	 */
	private FTPClient getFTPSClient() {
		try {
			TrustManager[] trustManager = new TrustManager[] { new X509TrustManager() {
				public X509Certificate[] getAcceptedIssuers() {
					return null;
				}

				public void checkClientTrusted(X509Certificate[] certs, String authType) {
				}

				public void checkServerTrusted(X509Certificate[] certs, String authType) {
				}
			} };

			SSLContext sslContext = null;
			sslContext = SSLContext.getInstance("SSL");
			sslContext.init(null, trustManager, new SecureRandom());
			SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
			FTPClient client = new FTPClient();
			client.setSSLSocketFactory(sslSocketFactory);
			client.setSecurity(FTPClient.SECURITY_FTPS);

			client.setType(FTPClient.TYPE_BINARY);
			client.setCharset("utf-8");

			URL url = new URL(ADDRESS);
			int port = url.getPort() < 1 ? 21 : url.getPort();
			client.connect(url.getHost(), port);
			client.login(USERNAME, PASSWORD);

			log.info("Success to login ftp server:" + ADDRESS);

			return client;
		} catch (Exception e) {
			log.error("[FTPUtils].[getFTPSClient]-->Exception", e);
		}
		return null;
	}
	
	/**
	 * 获取FTPS客户端对象
	 * 
	 * @return FTPClient
	 * @throws Exception
	 */
	private FTPClient getFTPClient() {
		try {
			FTPClient client = new FTPClient();

			client.setType(FTPClient.TYPE_BINARY);
			client.setCharset("utf-8");

			URL url = new URL(ADDRESS);
			int port = url.getPort() < 1 ? 21 : url.getPort();
			client.connect(url.getHost(), port);
			client.login(USERNAME, PASSWORD);

			log.info("Success to login ftp server:" + ADDRESS);

			return client;
		} catch (Exception e) {
			log.error("[FTPUtils].[getFTPSClient]-->Exception", e);
		}
		return null;
	}
	
	/**
	 * 注销客户端连接
	 * 
	 * @param client
	 *            FTP客户端对象
	 * @throws Exception
	 */
	private void logout(FTPClient client) throws Exception {
		if (client != null) {
			try {
				// 有些FTP服务器未实现此功能，若未实现则会出错
				client.logout(); // 退出登录
			} catch (FTPException fe) {
			} catch (Exception e) {
				throw e;
			} finally {
				if (client.isConnected()) { // 断开连接
					client.disconnect(true);
				}
			}
		}
	}

	/**
	 * 创建目录
	 * 
	 * @param client
	 *            FTP客户端对象
	 * @param dir
	 *            目录
	 * @throws Exception
	 */
	private void mkdirs(FTPClient client, String dir) throws Exception {
		if (dir == null) {
			return;
		}
		dir = dir.replace("//", "/");
		dir = dir.replace("\\", "/");
		String[] dirs = dir.split("/");
		for (int i = 0; i < dirs.length; i++) {
			dir = dirs[i];
			if (dir != null && dir.length() > 0) {
				if (!exists(client, dir)) {
					client.createDirectory(dir);
				}
				client.changeDirectory(dir);
			}
		}
	}

	/**
	 * 获取FTP目录
	 * 
	 * @param url
	 *            原FTP目录
	 * @param dir
	 *            目录
	 * @return
	 * @throws Exception
	 */
	private URL getURL(URL url, String dir) throws Exception {
		String path = url.getPath();
		if (!path.endsWith("/") && !path.endsWith("//")) {
			path += "/";
		}
		dir = dir.replace("//", "/");
		if (dir.startsWith("/")) {
			dir = dir.substring(1);
		}
		path += dir;
		return new URL(url, path);
	}

	/**
	 * 获取FTP目录
	 * 
	 * @param dir
	 *            目录
	 * @return
	 * @throws Exception
	 */
	private URL getURL(String dir) throws Exception {
		return getURL(new URL(ADDRESS), dir);
	}

	/**
	 * 判断文件或目录是否存在
	 * 
	 * @param client
	 *            FTP客户端对象
	 * @param dir
	 *            文件或目录
	 * @return
	 * @throws Exception
	 */
	private boolean exists(FTPClient client, String dir) throws Exception {
		return getFileType(client, dir) != -1;
	}

	/**
	 * 判断当前为文件还是目录
	 * 
	 * @param client
	 *            FTP客户端对象
	 * @param dir
	 *            文件或目录
	 * @return -1、文件或目录不存在 0、文件 1、目录
	 * @throws Exception
	 */
	private int getFileType(FTPClient client, String dir) throws Exception {
		FTPFile[] files = null;
		try {
			files = client.list(getURL(dir).getPath());
		} catch (Exception e) {
			return -1;
		}
		if (files.length > 1) {
			return FTPFile.TYPE_DIRECTORY;
		} else if (files.length == 1) {
			FTPFile f = files[0];
			if (f.getType() == FTPFile.TYPE_DIRECTORY) {
				return FTPFile.TYPE_DIRECTORY;
			}
			String path = dir + "/" + f.getName();
			try {
				int len = client.list(path).length;
				if (len == 1) {
					return FTPFile.TYPE_DIRECTORY;
				} else {
					return FTPFile.TYPE_FILE;
				}
			} catch (Exception e) {
				return FTPFile.TYPE_FILE;
			}
		} else {
			try {
				client.changeDirectory(dir);
				client.changeDirectoryUp();
				return FTPFile.TYPE_DIRECTORY;
			} catch (Exception e) {
				return -1;
			}
		}
	}

	/**
	 * 上传文件或目录
	 * 
	 * @param dir
	 *            FTP 路径
	 * @param del
	 *            是否删除源文件，默认为false
	 * @ param file
	 *            上传的文件或目录对象数组
	 * @throws Exception
	 */
	public void upload(String dir, boolean del, File[] files) throws Exception {
		if (dir == null || dir.length() <= 0 || files == null) {
			return;
		}
		FTPClient client = null;
		try {
			client = getClient();
			mkdirs(client, getURL(dir).getPath()); // 创建文件

			for (File file : files) {
				if (file == null || !file.exists()) {
					continue;
				}
				if (file.isDirectory()) { // 上传目录
					uploadFolder(client, getURL(dir), file, del);
				} else {

					client.changeDirectory(getURL(dir).getPath()); // 转此目录下
					client.upload(file); // 上传文件
					if (del) { // 删除源文件
						file.delete();
					}
				}
			}
		} catch (Exception e) {
			throw e;
		} finally {
			logout(client);
		}
	}

	/**
	 * 上传文件或目录
	 * 
	 * @param dir
	 *            目标文件
	 * @param files
	 *            文件或目录对象数组
	 * @throws Exception
	 */
	public void upload(String dir, File[] files) throws Exception {
		upload(dir, false, files);
	}

	/**
	 * 上传文件或目录
	 * 
	 * @param dir
	 *            目标文件
	 * @param del
	 *            是否删除源文件，默认为false
	 * @ param paths
	 *            文件或目录路径数组
	 * @throws Exception
	 */
	public void upload(String dir, boolean del, String[] paths) throws Exception {
		if (dir == null || dir.length() <= 0 || paths == null || paths.length <= 0) {
			return;
		}
		File[] files = new File[paths.length];
		for (int i = 0; i < paths.length; i++) {
			files[i] = new File(paths[i]);
		}
		upload(dir, del, files);
	}

	/**
	 * 上传文件或目录
	 * 
	 * @param dir
	 *            FTP上的目录（相对路径）
	 * @param paths
	 *            上传的文件或目录路径数组
	 * @throws Exception
	 */
	public void upload(String dir, String[] paths) throws Exception {
		upload(dir, false, paths);
	}

	/**
	 * 上传文件或目录
	 * 
	 * @param dir
	 *            FTP上的目录（相对路径）
	 * @param paths
	 *            上传的文件或目录路径列表
	 * @throws Exception
	 */
	public void upload(String dir, List<String> paths) throws Exception {

		if (paths != null && paths.size() >= 0) {
			String[] filePaths = new String[paths.size()];
			for (int i = 0; i < paths.size(); i++) {
				filePaths[i] = paths.get(i);
			}
			upload(dir, false, filePaths);
		}
	}

	/**
	 * 上传目录
	 * 
	 * @param client
	 *            FTP客户端对象
	 * @param parentUrl
	 *            父节点URL
	 * @param file
	 *            目录
	 * @throws Exception
	 */
	private void uploadFolder(FTPClient client, URL parentUrl, File file, boolean del) throws Exception {
		client.changeDirectory(parentUrl.getPath());
		File[] files = file.listFiles(); // 获取当前文件夹所有文件及目录
		for (int i = 0; i < files.length; i++) {
			file = files[i];
			if (file.isDirectory()) { // 如果是目录，则递归上传
				// uploadFolder(client, url, file, del);
			} else { // 如果是文件，直接上传
				client.upload(file);
				if (del) { // 删除源文件
					file.delete();
				}
			}
		}
	}

	/**
	 * 删除文件或整个目录,
	 * 
	 * @param dirs
	 *            要删除的文件或目录数组(FTP主目录的相对路径)
	 * @throws Exception
	 */
	public void delete(String[] dirs) throws Exception {
		if (dirs == null || dirs.length == 0) {
			return;
		}
		FTPClient client = null;
		try {
			client = getClient();
			int type = -1;
			for (String dir : dirs) {
				client.changeDirectory("/"); // 切换至根目录
				type = getFileType(client, dir); // 获取当前类型
				if (type == 0) { // 删除文件
					client.deleteFile(getURL(dir).getPath());
				} else if (type == 1) { // 删除目录
					deleteFolder(client, getURL(dir));
				}
			}
		} finally {
			logout(client);
		}
	}

	/**
	 * 删除整个目录
	 * 
	 * @param client
	 *            FTP客户端对象
	 * @param url
	 *            FTP URL
	 * @throws Exception
	 */
	private void deleteFolder(FTPClient client, URL url) throws Exception {
		String path = url.getPath();
		client.changeDirectory(path);
		FTPFile[] files = client.list();
		String name = null;
		for (FTPFile file : files) {
			name = file.getName();
			// 排除隐藏目录
			if (".".equals(name) || "..".equals(name)) {
				continue;
			}
			if (file.getType() == FTPFile.TYPE_DIRECTORY) { // 递归删除子目录
				deleteFolder(client, getURL(url, file.getName()));
			} else if (file.getType() == FTPFile.TYPE_FILE) { // 删除文件
				client.deleteFile(file.getName());
			}
		}
		client.changeDirectoryUp();
		client.deleteDirectory(url.getPath()); // 删除当前目录
	}

	/**
	 * 下载文件或整个目录(下载目录下所有文件及子目录)
	 * 
	 * @param localDir
	 *            本地存储目录,配置全路径
	 * @param dirs
	 *            下载的FTP文件或者目录
	 * @throws Exception
	 */
	public void download(String localDir, String[] dirs, int flag) throws Exception {
		if (dirs == null || dirs.length == 0) {
			return;
		}
		FTPClient client = null;
		try {
			client = getClient();
			File folder = new File(localDir);
			if (!folder.exists()) { // 如果本地文件夹不存在，则创建
				folder.mkdirs();
			}
			int type = -1;
			for (String dir : dirs) {
				client.changeDirectory("/"); // 切换至根目录
				type = getFileType(client, dir); // 获取当前类型
				if (type == 1) { // 目录
					downloadFolder(client, getURL(dir), localDir, flag);
				}
			}
		} catch (Exception e) {
			throw e;
		} finally {
			logout(client);
		}
	}

	/**
	 * 下载文件夹下所有的文件（不包括子目录）
	 * 
	 * @param client
	 *            FTP客户端对象
	 * @param url
	 *            FTP URL
	 * @param localDir
	 *            本地存储目录
	 * @throws Exception
	 */
	private void downloadFolder(FTPClient client, URL url, String localDir, int flag) throws Exception {
		String path = url.getPath();
		client.changeDirectory(path);
		FTPFile[] files = client.list();
		String name = null;
		for (FTPFile file : files) {
			name = file.getName();
			// 排除隐藏目录
			if (name == null || ".".equals(name) || "..".equals(name)) {
				continue;
			}

			if (file.getType() == FTPFile.TYPE_FILE) {

				if (flag == 0) {
					// 下载当天的正常文件
					if (name.endsWith(".txt")) {
						client.download(name, new File(localDir + "/" + name));
						log.info("Success to download file: " + name);
						// 生成backup目录
						/*
						 * add by wsq 20190712
						 
						if (!exists(client, path+"bakup")) {
							client.createDirectory("bakup");
						}*/
						client.rename(name, "bakup/" + name);
					}
				} 
			}
		}
		client.changeDirectoryUp();
	}

	/**
	 * 获取目录下所有文件
	 * 
	 * @param dir
	 *            目录
	 * @return
	 * @throws Exception
	 */
	public String[] list(String dir) throws Exception {
		FTPClient client = null;
		try {
			client = getClient();
			client.changeDirectory(dir);
			String[] values = client.listNames();
			if (values != null) {
				// 将文件排序(忽略大小写)
				Arrays.sort(values, new Comparator<String>() {
					public int compare(String val1, String val2) {
						return val1.compareToIgnoreCase(val2);
					}
				});
			}
			return values;
		} catch (FTPException fe) {
			// 忽略文件夹不存在的情况
			String mark = "code=550";
			if (fe.toString().indexOf(mark) == -1) {
				throw fe;
			}
		} finally {
			logout(client);
		}
		return new String[0];
	}

    /**
     * zzy  自己写的FTP下载
	 * @param dzLocalDir
     * @param dzRemoteDir
     * @param pattern
     * @param dzRemoteBakDir
     * @throws Exception
	 */
	public void downloadFiles(String dzLocalDir, String dzRemoteDir, String pattern, String dzRemoteBakDir) throws Exception {
		FTPClient client = null;
		try {

			if (!dzLocalDir.endsWith("/")){
				dzLocalDir += File.separator;
			}

			client = getClient();
			client.changeDirectory(dzRemoteDir);

			// 查看有哪些文件夹 以确定切换的ftp路径正确
			FTPFile[] values = client.list();

			for (FTPFile file : values) {
				String fileName = file.getName();
				if (fileName.equals(".") || fileName.equals("..")) {
					continue;
				}
				if (file.getType() != FTPFile.TYPE_FILE) {
					continue;
				}
				if (fileName.contains(pattern)){
					client.download(fileName, new File(dzLocalDir + fileName));
					log.info("download success dz file : " + dzLocalDir + fileName);
					if (StringUtils.hasText(dzRemoteBakDir)){
						if (!dzRemoteBakDir.endsWith("/")){
							dzRemoteBakDir += "/";
						}
						client.rename(dzRemoteDir+fileName, dzRemoteBakDir+fileName);
						log.info("backup success dz file : " + dzRemoteBakDir + fileName);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		} finally {
			logout(client);
		}
	}

	public static void main(String[] args) {

		String address = "";
		String userName = "";
		String passWord = "";

		FTPUtils ftpUtils = FTPUtils.getInstance(address,userName,passWord);

		String dzLocalDir = "";
		String dzRemoteDir= "";

		String pattern = "";
		try {
			ftpUtils.downloadFiles(dzLocalDir,dzRemoteDir,pattern, "");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}