package com.small.o2o.comp.sql;

import cn.hutool.core.io.FileUtil;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;

public class PkgRenameTest {
    static HashMap<String, String> pkgMap = new HashMap<String, String>();

    public void initMap(){
        pkgMap.put("AMS_APPLYMATCH_PKG", "zhu-40-");
        pkgMap.put("AMS_BACKUPDATA_PKG", "zhu-41-");
        pkgMap.put("AMS_BADDEBTS_0918_PKG", "zhu-42-");
        pkgMap.put("AMS_BADDEBTS_OTHER_PKG", "zhu-43-");
        pkgMap.put("AMS_BADDEBTS_PKG", "zhu-44-");
        pkgMap.put("AMS_BASE_DB_ACCT_PKG", "zhu-45-");
        pkgMap.put("AMS_CONFIRM_THE_PAYMENT", "zhu-46-");
        pkgMap.put("AMS_DATALANDING_PKG", "zhu-47-");
        pkgMap.put("AMS_DATA_REPAIR_PKG_TMP", "zhu-48-");
        pkgMap.put("AMS_DATEBADDEBTS_OTHERNEW_PKG", "zhu-49-");
        pkgMap.put("AMS_DATEBADDEBTS_OTHER_PKG", "zhu-50-");
        pkgMap.put("AMS_DATEMODIFIED_PKG", "zhu-51-");
        pkgMap.put("AMS_DEALBACKDATA_PKG", "zhu-52-");
        pkgMap.put("AMS_EMPLOYEE_PKG", "zhu-53-");
        pkgMap.put("AMS_EXECCUT_PKG", "zhu-54-");
        pkgMap.put("AMS_HANDLESYSTEMDATA_PKG", "zhu-55-");
        pkgMap.put("AMS_HANDLETASK_PKG", "zhu-56-");
        pkgMap.put("AMS_HQ_CS", "zhu-57-");
        pkgMap.put("AMS_OVERSEASREINSURANCE_PKG", "zhu-58-");
        pkgMap.put("AMS_PAPERATTACHMENTS_PKG", "zhu-59-");
        pkgMap.put("AMS_POLICYMIRROR_GATHER_TD_PKG", "zhu-60-");
        pkgMap.put("AMS_POLICYMIRROR_RULES", "zhu-61-");
        pkgMap.put("AMS_POLICYRECEIVABLE_PKG", "zhu-62-");
        pkgMap.put("AMS_POM_GATHER_TD_NEW_PKG", "zhu-63-");
        pkgMap.put("AMS_PREMATCH_PKG", "zhu-64-");
        pkgMap.put("AMS_VOUCHERINIT_PKG", "zhu-65-");
        pkgMap.put("MM_MIRROR_PKG", "zhu-66-");
        pkgMap.put("MM_MIRROR_PKG_LOOPTOSUB", "zhu-67-");
        pkgMap.put("MM_MIRROR_PKG_PLAN", "zhu-68-");
        pkgMap.put("MM_MIRROR_PKG_POLICYMIRROR", "zhu-69-");
        pkgMap.put("MM_MIRROR_PKG_QUERYDAILYREPORT", "zhu-70-");
        pkgMap.put("MM_MIRROR_PKG_SS", "zhu-71-");
        pkgMap.put("MM_MIRROR_PKG_SSJK", "zhu-72-");
        pkgMap.put("MM_MIRROR_PKG_SUMFIELCUT", "zhu-73-");
        pkgMap.put("MM_MIRROR_PKG_USABNOGROUP", "zhu-74-");
        pkgMap.put("MM_MIRROR_PKG_YH", "zhu-75-");
        pkgMap.put("MM_MIRROR_PKG_YH_BAK", "zhu-76-");

    }

    @Test
    public void rename(){
        initMap();

        //File fabu = new File("E:\\test\\Fabu\\fabu0113");
        //File fabuTarget = new File("E:\\test\\Fabu\\fabu0113_target\\");

        File fabu = new File("E:\\test\\Fabu\\prodbak");
        File fabuTarget = new File("E:\\test\\Fabu\\prodbak_target\\");

        File[] files = fabu.listFiles();
        for (File f : files){

            String fileName = f.getName();
            String targetPath = fabuTarget+ File.separator + fileName;
            if (fileName.startsWith("zhu-")) {
                String newFileName = fileName.substring(7);
                System.out.println("old : " + fileName + " new : " + newFileName);
                targetPath = fabuTarget+File.separator + newFileName;
            }
            //FileUtil.rename(f.getAbsoluteFile(), fabuTarget+"test-01.txt", false);
            FileUtil.copy(f, new File(targetPath), true);
        }

        System.out.println("-------------------------结果----------------");
        File[] fabuTargetList = fabuTarget.listFiles();
        String tmpName = "";
        String orderName = "";
        for (File file : fabuTargetList) {

            tmpName = file.getName().replace(".pck", "");
            orderName = pkgMap.get(tmpName.toUpperCase());
            FileUtil.rename(file, orderName+file.getName(), true);

        }
        File[] resultList = fabuTarget.listFiles();
        Arrays.stream(resultList).forEach(f->System.out.println(f.getAbsolutePath()));
    }


}
