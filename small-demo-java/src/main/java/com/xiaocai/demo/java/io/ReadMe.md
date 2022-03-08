io操作demo 

本文件夹是示例代码


各IO类关系梳理

    InputStream: Java IO中的顶级的字节输入流的抽象类，定义了最基础的输入、读取的相关方法。实现了Closeable接口。
    
        FileInputStream: 继承自InputStream的文件输入流类，用于从本地文件中读取字节数据。
        ByteArrayInputStream: 继承自InputStream的字节数组输入流类，它包含一个内部缓冲区，该缓冲区包含从流中读取的字节；通俗点说，它的内部缓冲区就是一个字节数组，而 ByteArrayInputStream 本质就是通过字节数组来实现的。InputStream通过read()向外提供接口，供它们来读取字节数据；而 ByteArrayInputStream 的内部额外的定义了一个计数器，它被用来跟踪read()方法要读取的下一个字节。
        StringBufferInputStream: 继承自InputStream的字节输入流类，其中读取的字节由字符串的内容提供的输入流。该类已过时，不推荐使用，由 StringReader 代替。
        PipedInputStream: 继承自InputStream的管道输入流类，在使用管道通信时，必须与 PipedOutputStream 配合使用。让多线程可以通过管道进行线程间的通讯。
        ObjectInputStream: 继承自InputStream的对象输入流类，实现了 ObjectInput 和 ObjectStreamConstants 接口。作用是从输入流中读取Java对象和基本数据。只有支持 Serializable 或 Externalizable 接口的对象才能被ObjectInputStream/ObjectOutputStream所操作！
        SequenceInputStream: 继承自InputStream的输入合并流类。SequenceInputStream 会将与之相连接的流集组合成一个输入流并从第一个输入流开始读取，直到到达文件末尾，接着从第二个输入流读取，依次类推，直到到达包含的最后一个输入流的文件末 尾为止。合并流的作用是将多个源合并合一个源。
        AudioInputStream: 继承自InputStream的音频输入流类。音频输入流是具有指定音频格式和长度的输入流。长度用示例帧表示，不用字节表示。提供几种方法，用于从流读取一定数量的字节，或未指定数量的字节。音频输入流跟踪所读取的最后一个字节。可以跳过任意数量的字节以到达稍后的读取位置。音频输入流可支持标记。设置标记时，会记住当前位置，以便可以稍后返回到该位置。
        FilterInputStream: 继承自InputStream的过滤输入流类（装饰器超类），是用来“封装其它的输入流，并为它们提供额外的功能”。
            BufferedInputStream: 继承自FilterInputStream的带缓冲区功能的输入流类（装饰器子类），默认缓冲区大小是8K，能够减少访问磁盘的次数，提高文件读取性能。
            DataInputStream: 继承自FilterInputStream的数据输入流类，实现了 DataInput 接口。它允许应用程序以与机器无关方式从底层输入流中读取基本 Java 数据类型。
            PushbackInputStream: 继承自FilterInputStream的回退输入流类。允许试探性的读取数据流，如果不是我们想要的则返还回去。
            LineNumberInputStream: 继承自FilterInputStream的行号输入流类。可以获取当前的行号或设置当前行号，已过时，已经被 LineNumberReader 替代。
            CheckedInputStream: 继承自FilterInputStream的校验输入流类。
            CipherInputStream: 继承自FilterInputStream的密钥输入流类。
            DigestInputStream: 继承自FilterInputStream的摘要处理输入流类。
            InflaterInputStream: 继承自FilterInputStream的解压缩处理输入流类。
                GZIPInputStream: 继承自InflaterInputStream的gzip文件处理输入流类。
                ZipInputStream: 继承自InflaterInputStream的解压缩处理输入流类。
                    JarInputStream: 继承自ZipInputStream的解压缩处理输入流类。
            DeflaterInputStream: 继承自FilterInputStream的压缩数据输入流类。
            ProgressMonitorInputStream: 继承自FilterInputStream的进度监控输入流类。
            
    OutputStream: JavaIO中的顶级的字节输出流的抽象类，定义了最基础的输出、写入的相关方法。实现了Closeable和Flushable接口。
    
        FileOutputStream: 继承自OutputStream的文件输出流类，用于向本地文件中写入字节数据。
        ByteArrayOutputStream: 继承自OutputStream的字节数组输出流类，ByteArrayOutputStream 中的数据会被写入一个 byte 数组。缓冲区会随着数据的不断写入而自动增长。可使用 toByteArray() 和 toString() 获取数据。
        PipedOutputStream: 继承自OutputStream的管道输出流类，在使用管道通信时，必须与 PipedInputStream 配合使用。让多线程可以通过管道进行线程间的通讯。
        ObjectOutputStream: 继承自OutputStream的对象输出流类，实现了 ObjectOutput 和 ObjectStreamConstants 接口。作用是把Java对象和基本数据写入到对象输出流中。只有支持 Serializable 或 Externalizable 接口的对象才能被ObjectInputStream/ObjectOutputStream所操作！
        FilterOutputStream: 继承自OutputStream的过滤输出流类，是用来“封装其它的输出流，并为它们提供额外的功能”。
            BufferedOutputStream: 继承自FilterOutputStream的带缓冲区功能的输出流类，默认缓冲区大小是8K，能够提高文件的写入效率。
            DataOutputStream: 继承自FilterOutputStream的数据输出流类，实现了 DataOutput 接口。它允许应用程序以与机器无关方式向底层输入流中写入基本 Java 数据类型。
            PrintStream: 继承自FilterOutputStream的打印输出流类，实现了 Appendable 和 Closeable 接口。使它们能够方便地打印各种数据值表示形式。PrintStream 永远不会抛出 IOException。PrintStream 提供了自动flush 和 字符集设置功能。所谓自动flush，就是往PrintStream写入的数据会立刻调用flush()函数。
            CheckedOutputStream: 继承自FilterOutputStream的校验输出流类。
            CipherOutputStream: 继承自FilterOutputStream的密钥输出流类。
            DigestOutputStream: 继承自FilterOutputStream的摘要处理输出流类。
            InflaterOutputStream: 继承自FilterOutputStream的解压缩处理输出流类。
            DeflaterOutputStream: 继承自FilterOutputStream的解压缩数据输出流类。
                GZIPOutputStream: 继承自DeflaterOutputStream的gzip文件解压缩输出流类。
                ZipOutputStream: 继承自DeflaterOutputStream的zip文件解压缩输出流类。
                    JarOutputStream: 继承自ZipOutputStream的zip文件解压缩输出流类。
                    
    Reader: JavaIO中的顶级的字符读取的抽象类，定义了最基础的读取方法。实现了 Readable 和 Closeable 接口。
    
        BufferedReader: 继承自Reader的带缓冲功能的字符流类，默认缓冲区大小是8K，从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。创建 BufferReader 时，我们会通过它的构造函数指定某个 Reader 为参数。BufferReader 会将该 Reader 中的数据分批读取，每次读取一部分到缓冲中；操作完缓冲中的这部分数据之后，再从 Reader 中读取下一部分的数据。
            LineNumberReader: 继承自BufferedReader，可以获取当前的行号或设置当前行号。
        InputStreamReader: 继承自Reader，用于将从字节流转换成字符流的 Reader。是字节流通向字符流的桥梁。如果不指定字符集编码，该解码过程将使用平台默认的字符编码。
            FileReader: 继承自InputStreamReader，用来读取字符文件的便捷类。
        StringReader: 继承自Reader，用于字符串读取的字符流。
        CharArrayReader: 继承自Reader的字符数组输入流类。
        FilterReader: 继承自Reader的字符过滤输入流抽象类。
            PushbackReader: 继承自FilterReader的字符回退输入流类。
        PipedReader: 继承自Reader的字符管道输入流类。作用是可以通过管道进行线程间的通讯。必须和 PipedWriter 配合使用。
        
    Writer: JavaIO中的顶级的字符写入的抽象类，定义了最基础的写入方法。实现了 Appendable 、 Closeable 和 Flushable 接口。
    
        BufferedWriter: 继承自Writer的带缓冲功能的字符流类，默认缓冲区大小是8K，从字符输出流中写入字符到文本中，缓冲各个字符，从而实现字符、数组和行的高效写入。
        OutputStreamWriter: 继承自Reader，用于将从字节流转换成字符流的 Writer。是字节流通向字符流的桥梁。如果不指定字符集编码，该解码过程将使用平台默认的字符编码。
            FileWriter: 继承自OutputStreamWriter，用来向文件中写入字符的便捷类。
        FilterWriter: 继承自Writer的字符过滤输出流抽象类。与 FilterOutputStream 功能一样、只是简单重写了父类的方法、目的是为所有装饰类提供标准和基本的方法、要求子类必须实现核心方法、和拥有自己的特色。这里 FilterWriter 没有子类、可能其意义只是提供一个接口、留着以后的扩展，本身是一个抽象类。
        StringWriter: 继承自Writer，用于字符串写入的字符流。
        PipedWriter: 继承自Writer的字符管道输出流类。作用是可以通过管道进行线程间的通讯。必须和 PipedReader 配合使用。
        CharArrayWriter: 继承自Writer的字符数组输出流类。
        PrintWriter: 继承自Writer的打印写入类，提供了PrintStream的所有打印方法，其方法也从不抛出IOException。与PrintStream的区别：作为处理流使用时，PrintStream只能封装OutputStream类型的字节流，而PrintWriter既可以封装OutputStream类型的字节流，还能够封装Writer类型的字符输出流并增强其功能。

[Java IO Mind](https://cdn.jsdelivr.net/gh/mall-rose/springboot-demo/small-demo-java/images/io/Javaio_mind_all.png)

IO UML 类图

[Java_inputstream_uml](https://cdn.jsdelivr.net/gh/small-rose/springboot-demo/small-demo-java/images/io/java_inputstream_uml.png)

[Java_outputstream_uml](https://cdn.jsdelivr.net/gh/small-rose/springboot-demo/small-demo-java/images/io/java_outputstream_uml.png)

[Java_reader_uml](https://cdn.jsdelivr.net/gh/small-rose/springboot-demo/small-demo-java/images/io/java_reader_uml.png)

[Java_writer_uml](https://cdn.jsdelivr.net/gh/small-rose/springboot-demo/small-demo-java/images/io/java_writer_uml.png)


流的分类

    字节流和字符流：
        字节流：以字节为单位，每次次读入或读出是8位数据。可以读任何类型数据。
        字符流：以字符为单位，每次次读入或读出是16位数据。其只能读取字符类型数据。
    输出流和输入流：
        输入流：从文件读入到内存。只能进行读操作。
        输出流：从内存读出到文件。只能进行写操作。
    节点流和处理流：
        节点流：直接与数据源相连，读入或读出。
        处理流：与节点流一块使用，在节点流的基础上，再套接一层，套接在节点流上的就是处理流。处理流的构造方法总是要带一个其他的流对象做参数。一个流对象经过其他流的多次包装，称为流的链接。

    注：输入输出流中的入和出，都是相对于系统内存而言的。为什么要有处理流？直接使用节点流，读写不方便，为了更快的读写文件，才有了处理流。


[流按类型分类](https://cdn.jsdelivr.net/gh/small-rose/springboot-demo/small-demo-java/images/io/javaio_mind_optype.png)

[流按用途分类](https://cdn.jsdelivr.net/gh/small-rose/springboot-demo/small-demo-java/images/io/javaio_mind_object.png)



流中主要方法梳理

InputStream中的主要方法

    abstract int read(): 从流中读取数据，读取一个字节，返回值为所读得字节
    int read(byte b[]): 从流中读取数据，读取多个字节，放置到字节数组 b 中，通常读取的字节数量为 b 的长度，返回值为实际独取的字节的数量。
    int read(byte b[], int off, int len): 从流中读取数据，读取 len 个字节，放置到以下标 off 开始字节数组 b 中，返回值为实际读取的字节的数量。
    long skip(long n): 读指针跳过n个字节不读，返回值为实际跳过的字节数量。
    int available(): 返回值为流中尚未读取的字节的数量。
    void close(): 关闭输入流。
    synchronized void mark(int readlimit): 记录当前指针的所在位置，readlimit表示读指针读出的readlimit个字节后，所标记的指针位置才实效。
    synchronized void reset(): 把读指针重新指向用 mark 方法所记录的位置。
    boolean markSupported(): 当前的流是否支持读指针的记录功能。

    注：其中read()返回的是读入的一个字节所对应的 int 值(0-255),而read(byte[] b)和read(byte[] b, int off, int len)返回的是读入的字节数。

OutputStream中的主要方法

    abstract void write(int b): 输出数据，往流中写一个字节 b。
    void write(byte b[]): 输出数据，往流中写一个字节数组 b。
    void write(byte b[], int off, int len): 输出数据，把字节数组 b 中从下标 off 开始，长度为 len 的字节写入到流中。
    void flush(): 刷空输出流，并输出所有被缓存的字节。由于某些流支持缓存功能，该方法将把缓存中所有内容强制输出到流中。
    void close(): 关闭输出流。

Reader中的主要方法

    int read(java.nio.CharBuffer target): 试图读取字符入指定的字符缓冲区。
    int read(): 读取单个字符。
    int read(char cbuf[]): 读取字符到一个数组中。
    int read(char cbuf[], int off, int len): 读取字符到一个数组中的一部分。
    long skip(long n): 跳过n个字符。
    boolean ready(): 通知此流是否已准备好被读取。
    boolean markSupported(): 告诉此流是否支持mark()操作。
    void mark(int readAheadLimit): 标记流中的当前位置。
    void reset(): 重置流。
    void close(): 关闭该流并释放与之关联的所有系统资源。

Writer中的主要方法

    void write(int c): 写入单个字符。
    void write(char cbuf[]): 写入字符数组。
    abstract void write(char cbuf[], int off, int len): 写入字符数组的一部分。
    void write(String str): 写入一个字符串。
    void write(String str, int off, int len): 写入一个字符串的一部分。
    Writer append(CharSequence csq): 将指定的字符序列追加写到writer中。
    Writer append(CharSequence csq, int start, int end): 将指定的字符序列的子序列追加写入此writer。
    Writer append(char c): 将指定字符追加到这个writer。
    abstract void flush(): 刷新流。
    abstract void close(): 关闭流，但要先刷新它。


遵循的设计原则

    单一职责原则：每一个IO类的都具有单独的功能和职责，需要对某种类型的流做修改时，只需要修改具体对应的IO流类即可。
    里氏替换原则：子类完全实现了父类的方法，且有自己的个性，子类覆盖或实现父类的方法时输入参数和返回结果的范围没有变化。
    接口隔离原则：输入输出流所实现的接口有所不同，而且接口比较细化，接口中的方法少。
    依赖倒置原则：Java IO中的各个具体的功能类，都继承或聚合了InputStream/OutputStream的抽象类，都共同依赖了抽象，而不是依赖了某个具体的功能的IO类。
    开闭原则：当用户需要新增一种新特征、新方式的IO流时，可以直接新增一种类的流，让其继承或聚合InputStream/OutputStream/FilterInputStream/FilterOutputStream等类，从而来书写其特有的功能，减少。
    聚合/组合复用原则：就比如FileInputStream中对FileDescriptor和FileChannel的使用，都是采用了聚合的方式，而非继承的方式，从而使类之间的耦合度降低，提高了灵活性。





使用到的设计模式

装饰器模式

由于java I/O库需要很多性能的各种组合，如果这些性能都是用继承来实现，那么每一种组合都需要一个类，这样就会造成大量行重复的类出现。如果采用装饰模式，那么类的数目就会大大减少，性能的重复也可以减至最少。因此装饰模式是java I/O库基本模式。装饰模式的引进，造成灵活性和复杂性的提高。因此在使用java IO库时，必须理解java IO库是由一些基本的原始流处理器和围绕它们的装饰流处理器所组成的。

以字节输入流为例。InputStream是需要被装饰的抽象构件，而其下的FileInputStream、ByteArrayInputStream等是被装饰的具体构件；FilterInputStream是装饰器的父类，BufferedInputStream、DataInputStream则是具体的装饰器类。
适配器模式

适配器模式是java IO库中第二个重要的设计模式。如：StringBufferInputStream就是一个适配器类。它继承了InputStream类型，同时持有一个对String类型的引用。这是将String对象适配成InputStream类型的对象形式的适配器模式。PipedOutputStream也是一个适配器类。PipedOutputStream总是和PipedInputStream一起使用，它接收一个类型为PipedInputStream的输入类型，并将之转换成OutputStream类型的输出流，这是一个对象形式的适配器模式应用。


设计的优缺点

优点

    功能全面、强大和灵活，同时还防止了过多的类膨胀
    符合开闭原则，开发可以通过各种装配能实现各种功能

缺点

    复杂难记，API使用繁琐。如：Jdk1.6中，从文本文件中读取数据转换为字符串，就得至少10行代码。
    IO流中的绝大多数方法都有IOException的检查异常，导致开发人员不得不在各个使用到的地方捕捉或再抛出异常，代码繁琐，不符合当前的主流设计思路。
