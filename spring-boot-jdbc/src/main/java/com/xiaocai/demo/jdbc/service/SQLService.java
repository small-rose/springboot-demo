package com.xiaocai.demo.jdbc.service;

import com.mysql.jdbc.exceptions.MySQLSyntaxErrorException;
import com.xiaocai.demo.jdbc.common.FileUtils;
import com.xiaocai.demo.jdbc.core.JdbcUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-13 14:10
 **/
@Service
@Slf4j
public class SQLService {
    @Autowired
    private JdbcTemplate jdbcTemplate ;
    @Resource
    private JdbcUtils jdbcUtils;

    private static String PathDir = "F:"+ File.separator+ "onlyTest" +File.separator ;

    private static String errorFile = PathDir + "error.txt";

    private static String sqlFile = PathDir + "db_comment_all.sql";

    public boolean exec(String sql){
        Connection connection = null;
        boolean execute = false ;
        try {
            connection = jdbcTemplate.getDataSource().getConnection();

            Statement statement = connection.createStatement();
            int res = statement.executeUpdate(sql);
            System.out.println(res);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return execute;
    }


    public void execJdbc(String sql){
        Connection connection = null;
        boolean execute = false ;
        try {
            connection = jdbcUtils.getConnection();
            Statement statement = connection.createStatement();
            int res = statement.executeUpdate(sql);

        } catch (MySQLSyntaxErrorException m) {
            FileUtils.Write(errorFile, sql);
            FileUtils.Write(errorFile, m.getMessage());
            m.printStackTrace();
        } catch (SQLException e) {
            FileUtils.Write(errorFile, sql);
            FileUtils.Write(errorFile, e.getMessage());
            e.printStackTrace();
        }finally {
            try {
                if (connection!=null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void execAndCheckSql(){

        BufferedReader br = null;
        File file = new File(sqlFile);
        if (!file.exists()){
             log.info("File not exists : "+sqlFile);
             return;
        }
        try {
            br = new BufferedReader(new FileReader(new File(sqlFile))) ;

            String str = null;
            while((str = br.readLine()) != null){

                if (str!=null && StringUtils.hasText(str.trim())){
                    System.out.println(str);
                    this.execJdbc(str);
                }

            }


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭资源
                if (br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            log.info("---execute and check over ---");
        }
    }
}
