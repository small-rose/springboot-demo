package com.small.o2o.comp.sql;

import cn.hutool.core.io.file.FileReader;
import cn.hutool.core.io.file.FileWriter;
import org.junit.jupiter.api.Test;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class ReplacePrefixTest {

    public static String PREFIX = "\"AMS\".";
    public static String NEW_PREFIX = "\"AMSDB01\".";

    public static String PACKAGE_BODY = "PACKAGE BODY ";
    public static String PROCEDURE = "PROCEDURE ";
    public static String PLSQL_UNIT = "$$PLSQL_UNIT";
    public static String plsql_unit = "$$plsql_unit";

    @Test
    public void replaceSQLPrefix() throws IOException {
        String sourcepath = "E:\\test\\AMS";
        String tagetPath = "E:\\test\\AMSDB01\\";
        handleFile(sourcepath, tagetPath);

    }

    @Test
    public void newSQLTest() throws IOException {
        String sourcepath = "E:\\test\\AMSDB01\\";
        String tagetPath = "";
        handleFile(sourcepath, tagetPath);

    }

    private void handleFile(String sourcepath, String tagetPath) throws IOException {
        File[] files = new File(sourcepath).listFiles();
        FileReader reader = null;
        AtomicInteger count = new AtomicInteger();

        AtomicInteger countProcedure = new AtomicInteger(0);

        AtomicInteger countView = new AtomicInteger(0);
        AtomicInteger countTypes = new AtomicInteger(0);
        AtomicInteger countTables = new AtomicInteger(0);
        AtomicInteger countIndex = new AtomicInteger(0);
        AtomicInteger countSeq = new AtomicInteger(0);
        AtomicInteger countBody = new AtomicInteger(0);

        AtomicInteger buchong = new AtomicInteger(0);

        for (File file : files) {
            reader = new FileReader(file);
            List<String> allLines = reader.readLines();

            System.out.println("F.path = " + file.getAbsolutePath());
            String fileName = file.getName();

            /*if (fileName.contains(PROCEDURE.trim())){
                continue;
            }*/
            AtomicInteger indexNo = new AtomicInteger(1);

            final List<String> finalResultList = new ArrayList<>(allLines.size());;
            AtomicReference<String> packageName = new AtomicReference<>("");
            allLines.forEach(l->{

                if (fileName.contains("buchong") && l.toUpperCase().contains("CREATE TABLE")){
                    buchong.incrementAndGet();
                }
                if (fileName.contains("VIEW") && l.toUpperCase().contains("CREATE OR REPLACE VIEW")){
                    countView.incrementAndGet();
                }
                if (fileName.contains("TYPE") && l.toUpperCase().contains("CREATE OR REPLACE TYPE")){
                    countTypes.incrementAndGet();
                }
                if (fileName.contains(PROCEDURE.trim()) && l.toUpperCase().contains("CREATE OR REPLACE PROCEDURE")){
                    countProcedure.incrementAndGet();
                }

                if (fileName.contains("TABLE") && l.toUpperCase().contains("CREATE TABLE")){
                    countTables.incrementAndGet();
                }
                if (fileName.contains("TABLE") && l.toUpperCase().startsWith("CREATE INDEX")){
                    countIndex.incrementAndGet();
                }

                if (fileName.contains("SEQUENCE") && l.toUpperCase().contains("CREATE SEQUENCE")){
                    countSeq.incrementAndGet();
                }
                if (fileName.contains(PACKAGE_BODY.trim()) && l.toUpperCase().contains(PACKAGE_BODY)){
                    countBody.incrementAndGet();
                }

                if (l.contains(PREFIX)){
                    //System.out.println("lineNo = " +indexNo.get() + " ,content = " + l);
                    l = l.replaceAll(PREFIX, NEW_PREFIX);
                }

                if (fileName.contains(PACKAGE_BODY.trim()) && l.toUpperCase().contains(PACKAGE_BODY)){
                    packageName.set(l.toUpperCase().substring(l.toUpperCase().indexOf(PACKAGE_BODY) + PACKAGE_BODY.length(), l.toUpperCase().indexOf(" IS")));
                    System.out.println(l);
                    System.out.println("packageName = " +packageName);
                }

               /* if (fileName.contains(PROCEDURE.trim()) && l.toUpperCase().contains(PROCEDURE)){
                    System.out.println(l);
                    String procedureName = l.toUpperCase().substring(l.toUpperCase().indexOf(PROCEDURE)+PROCEDURE.length(), l.toUpperCase().indexOf(" IS"));
                    System.out.println("procedureName = " +procedureName);
                }*/
                if (fileName.contains(PACKAGE_BODY.trim()) && l.toUpperCase().contains(PLSQL_UNIT)){
                    count.getAndIncrement();
                    System.out.println("修改前 " + l);
                    l= l.replace(PLSQL_UNIT, "'".concat(packageName.get()).concat("'"));
                    l= l.replace(plsql_unit, "'".concat(packageName.get()).concat("'"));
                    System.out.println("修改后 " + l);
                }

                indexNo.getAndIncrement();
                finalResultList.add(l);


            });

            if (StringUtils.hasText(tagetPath)) {
                File file1 = new File(tagetPath + fileName);
                if (file1.exists()) {
                    file1.delete();
                } else {
                    file1.createNewFile();
                }
                FileWriter fileWriter = new FileWriter(file1);
                fileWriter.appendLines(finalResultList);

            }
        }

        System.out.println("SQL脚本合计表数量 :" +countTables.get());
        System.out.println("SQL脚本合计索引数量 :" +countIndex.get());
        System.out.println("SQL脚本合计序列数量 :" +countSeq.get());
        System.out.println("SQL脚本合计包体数量 :" +countBody.get());
        System.out.println("SQL脚本合计存過数量 :" +countProcedure.get());
        System.out.println("SQL脚本合计视图数量 :" +countView.get());
        System.out.println("SQL脚本合计集合数量 :" +countTypes.get());
        System.out.println("缺失表 :" +buchong.get());

        // 合计 225 = 220 package body  + procedure 5个
        System.out.println("count = $$PLSQL_UNIT " + count.get());
        // procedure
        // 861 AMS_KEMUHEXIAO
        // 1836 AMS_DAILYREPORTTITOTD
        // 2064 UPDATE_POLICYMIRROR_BY_RULES
        // 2157 UPDATE_POLICYMIRROR_BY_RULES
        // 2299 UPDATE_POLICYMIRROR_BY_RULES


    }
}
