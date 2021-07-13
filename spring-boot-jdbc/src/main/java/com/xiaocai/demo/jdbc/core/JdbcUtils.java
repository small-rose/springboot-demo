package com.xiaocai.demo.jdbc.core;



import org.apache.commons.beanutils.BeanUtils;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-13 15:38
 **/
@Service
public class JdbcUtils {

    private static String URL = "jdbc:mysql://192.168.10.184:3306/bp_dev?serverTimezone=UTC&characterEncoding=utf-8&useSSL=false";
    private static String USERNAME = "sf_dev_01";
    private static String PASSWORD = "Sf@123321";

    //1.加载驱动\
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //2.获取连接
    public Connection getConnection() {

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    //3.关闭连接
    public  void close(Connection conn, Statement st, ResultSet rs) {
        //关闭连接
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //关闭statement
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        //关闭结果集
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    //-------------------------------封装sql操作------------------------------
    //查询返回List集合
    public  <T> List<T> getList(Class<T> cls, String sql, Object... obj) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //1.获取连接
            conn = getConnection();
            //2.获取预处理对象
            ps = conn.prepareStatement(sql);
            //循环参数，如果没有就不走这里
            for (int i = 1; i <= obj.length; i++) {
                //注意：数组下标从0开始，预处理参数设置从1开始
                ps.setObject(i, obj[i - 1]);
            }
            //3.执行SQL语句
            System.out.println(sql);
            rs = ps.executeQuery();
            //4.遍历结果集
            //遍历之前准备：因为封装不知道未来会查询多少列，所以我们需要指定有多少列
            ResultSetMetaData date = rs.getMetaData();//获取ResultSet对象的列编号、类型和属性

            int column = date.getColumnCount();//获取列数

            Field[] fields = cls.getDeclaredFields();//获取本类所有的属性

            //创建一个list集合对象来存储查询数据
            List<T> list = new ArrayList<T>();

            //开始遍历结果集
            while (rs.next()) {

                //创建类类型实例
                T t = cls.newInstance();

                for (int i = 1; i <= column; i++) {

                    Object value = rs.getObject(i);//每一列的值

                    /**
                     *String columnName = date.getColumnName(i);//获取每一列名称
                     * 关于获取每一列名称，如果列取了别名的话，则不能用上面的方法取列的名称
                     * 用下面的方法
                     */
                    String columnName = date.getColumnLabel(i);//获取每一列名称（别名）

                    //遍历所有属性对象
                    for (Field field : fields) {
                        //获取属性名
                        String name = field.getName();

                        field.setAccessible(true);//打破封装，忽略对封装修饰符的检测

    						/*if (name.equals(columnName)) {

    							String string = date.getColumnTypeName(i);//获取列类型名称

    							//如果列类型是Date类型，转换成字符串表现形式
    							SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    							String d = sdf.format(value);
    							//赋值：将数据库中查询的字段赋值给对应名称的属性
    							field.set(t, d);
    						}else{
    							field.set(t, value);
    						}*/

                        if (name.equals(columnName)) {
                            BeanUtils.copyProperty(t, name, value);
                            break;//增加效率，避免不必要的循环
                        }
                    }
                }
                list.add(t);
            }
            return list;
            //5.关闭连接
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, ps, rs);
        }
        return null;
    }

    /**
     * 增加、删除、修改
     *
     * @param sql sql语句
     * @param obj 参数
     * @return
     */
    public  boolean getDML(String sql, Object... obj) {

        Connection conn = null;
        PreparedStatement ps = null;

        try {
            conn = getConnection();
            ps = conn.prepareStatement(sql);

            for (int i = 1; i <= obj.length; i++) {
                ps.setObject(i, obj[i - 1]);
            }
            System.out.println(sql);
            int update = ps.executeUpdate();

            if (update > 0) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, ps, null);
        }
        return false;
    }

    //查询返回单个对象
    public <T> T getOneObject(Class<T> cls, String sql, Object... obj) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //1.获取连接
            conn = getConnection();
            //2.获取预处理对象
            ps = conn.prepareStatement(sql);
            //循环参数，如果没有就不走这里
            for (int i = 1; i <= obj.length; i++) {
                //注意：数组下标从0开始，预处理参数设置从1开始
                ps.setObject(i, obj[i - 1]);
            }
            //3.执行SQL语句
            System.out.println(sql);
            rs = ps.executeQuery();
            //4.遍历结果集
            //遍历之前准备：因为封装不知道未来会查询多少列，所以我们需要指定有多少列
            ResultSetMetaData date = rs.getMetaData();//获取ResultSet对象的列编号、类型和属性

            int column = date.getColumnCount();//获取列数

            Field[] fields = cls.getDeclaredFields();//获取本类所有的属性

            //开始遍历结果集
            if (rs.next()) {

                //创建类类型实例
                T t = cls.newInstance();

                for (int i = 1; i <= column; i++) {

                    Object value = rs.getObject(i);//每一列的值

                    String columnName = date.getColumnName(i);//获取每一列名称

                    //遍历所有属性对象
                    for (Field field : fields) {
                        //获取属性名
                        String name = field.getName();

                        field.setAccessible(true);//打破封装，忽略对封装修饰符的检测

                        if (name.equals(columnName)) {
                            BeanUtils.copyProperty(t, name, value);
                        }
                    }
                }
                return t;
            }
            //5.关闭连接
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, ps, rs);
        }
        return null;
    }

    //查询总记录数
    public  Integer getCount(String sql, Object... obj) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            //1.获取连接
            conn = getConnection();
            //2.获取预处理对象
            ps = conn.prepareStatement(sql);
            //循环参数，如果没有就不走这里
            for (int i = 1; i <= obj.length; i++) {
                //注意：数组下标从0开始，预处理参数设置从1开始
                ps.setObject(i, obj[i - 1]);
            }
            //3.执行SQL语句
            System.out.println(sql);
            rs = ps.executeQuery();

            //开始遍历结果集
            if (rs.next()) {

                return rs.getInt(1);
            }
            //5.关闭连接
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, ps, rs);
        }
        return null;
    }
}
