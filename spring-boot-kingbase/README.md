## KingBase ES V8R6 实例

##

安装教程


## 本实例结果

| mysql   | KINGBASE  |   jdbcType     |    JavaType |
|--------|------------|---------------|-------------|
|bigint  | bigint       | long        |  long       |
|VARCHAR | VARCHAR      | VARCHAR     |  String     |
|        | DECIMAL      | NUMERIC      |  LONG       |
|DECIMAL |              | DECIMAL     |  BigDecimal  |  
|TIMESTAMP  | TIMESTAMP | TIMESTAMP   |  DATE        |
|        | DATE         | timestamp   |  DATE        |
|TEXT    |              | LONGVARCHAR   |  String    |
|        | TEXT         | VARCHAR   |  String        |



## mybatis 的 JdbcType 和 Java Type 

MyBatis包含的JdbcType类型，主要有下面这些，大致了解一下即可：

BIT、FLOAT、CHAR 、TIMESTAMP 、 OTHER 、UNDEFINEDTINYINT 、REAL 、VARCHAR 、BINARY 、BLOB NVARCHAR、SMALLINT 、DOUBLE 、LONGVARCHAR 、VARBINARY 、CLOB、NCHAR、INTEGER、 NUMERIC、DATE 、LONGVARBINARY 、BOOLEAN 、NCLOB、BIGINT 、DECIMAL 、TIME 、NULL、CURSOR


mybatis 支持映射对应关系

```txt
JDBC Type           Java Type  
CHAR                String  
VARCHAR             String  
LONGVARCHAR         String  
NUMERIC             java.math.BigDecimal  
DECIMAL             java.math.BigDecimal  
BIT                 boolean  
BOOLEAN             boolean  
TINYINT             byte  
SMALLINT            short  
INTEGER             INTEGER  
BIGINT              long  
REAL                float  
FLOAT               double  
DOUBLE              double  
BINARY              byte[]  
VARBINARY           byte[]  
LONGVARBINARY       byte[]  
DATE                java.sql.Date  
TIME                java.sql.Time  
TIMESTAMP           java.sql.Timestamp  
CLOB                Clob  
BLOB                Blob  
ARRAY               Array  
DISTINCT            mapping of underlying type  
STRUCT              Struct  
REF                 Ref  
DATALINK            java.net.URL
```
Mybatis JdbcType与Oracle、MySql数据类型对应列表
```Text
Mybatis    JdbcType    Oracle    MySql
JdbcType    ARRAY        
JdbcType    BIGINT               BIGINT
JdbcType    BINARY        
JdbcType    BIT        BIT
JdbcType    BLOB       BLOB      BLOB
JdbcType    BOOLEAN        
JdbcType    CHAR       CHAR      CHAR
JdbcType    CLOB       CLOB      CLOB
JdbcType    CURSOR        
JdbcType    DATE       DATE      DATE
JdbcType    DECIMAL    DECIMAL   DECIMAL
JdbcType    DOUBLE     NUMBER    DOUBLE
JdbcType    FLOAT      FLOAT     FLOAT
JdbcType    INTEGER    INTEGER   INTEGER
JdbcType    LONGVARBINARY        
JdbcType    LONGVARCHAR  LONG    VARCHAR    
JdbcType    NCHAR      NCHAR    
JdbcType    NCLOB      NCLOB    
JdbcType    NULL        
JdbcType    NUMERIC   NUMERIC/NUMBER  NUMERIC/
JdbcType    NVARCHAR        
JdbcType    OTHER        
JdbcType    REAL       REAL       REAL
JdbcType    SMALLINT   SMALLINT   SMALLINT
JdbcType    STRUCT        
JdbcType    TIME       TIME
JdbcType    TIMESTAMP  TIMESTAMP  TIMESTAMP/DATETIME
JdbcType    TINYINT    TINYINT
JdbcType    UNDEFINED        
JdbcType    VARBINARY        
JdbcType    VARCHAR    VARCHAR    VARCHAR
```



 