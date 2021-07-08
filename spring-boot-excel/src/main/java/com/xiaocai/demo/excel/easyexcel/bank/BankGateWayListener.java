package com.xiaocai.demo.excel.easyexcel.bank;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.sun.istack.internal.NotNull;
import com.xiaocai.demo.excel.common.DBType;
import com.xiaocai.demo.excel.common.FileUtils;
import lombok.Setter;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-30 15:44
 **/
public class BankGateWayListener extends AnalysisEventListener<BankGateWay> {

    private List<BankGateWay> list = new ArrayList<>();

    private String insertSQL = "INSERT INTO D_BANKGATEWAY ( SEQID, ORDER_BANKCODE, ORDER_BANKNAME, BANKCODE, BANKNAME, GROUPTYPE, REQUEST_ID, REQUEST_URL, SIGNKEY, SIGNTYPE, INSU_MIDNO, ACCOUNTNO, CURRENCYCODE, PAYTYPE, CHARSET, SHOW_URL, NOTIFY_URL, RETURN_URL, VERYFY_URL, TRANSPORT, IFVALID, PAYMETHOD, DEFAULT_LOGIN, TIMESTAMP, LASTOPDATE, HIBERNATEVERSION, MODIFYDESC, POSID, MOBILE_REQUEST_URL, CONTRACTID, TYPENAME, USER_ID, PASSWORD, CUST_ID, TYPE, ACCOUNTNAME, SINGLE_MAXAMOUNT, PACKET_MAXAMOUNT, PACKET_MAXCOUNT, IFCHECKRESULT) values ";

    private DBType dbType ;

    private String sqlPath = "F:" + File.separator + "bankgateway.sql" ;

    public void setDbType(DBType dbType) {
        this.dbType = dbType;
    }

    public void setSqlPath(String sqlPath) {
        if (dbType==null){
            throw new RuntimeException("please sure to set DbType before set SqlPath");
        }
        String tmp = sqlPath;
        tmp = tmp.substring(0, tmp.length()-4);
        tmp = tmp.concat("_").concat(this.dbType.name().toLowerCase()).concat(".sql") ;
        System.out.println(tmp);
        this.sqlPath = tmp;
    }

    @Override
    public void invoke(BankGateWay data, AnalysisContext context) {
        System.out.println(data);
        list.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // FileUtils.Write(sqlPath, insertSQL);
        StringBuilder sb = new StringBuilder("");
        String tmpVal = "";
        for (BankGateWay bankGateWay : list){
            sb.append(insertSQL);
            sb.append("(");
            sb.append("'").append(bankGateWay.getSEQID()).append("',");
            sb.append("'").append(bankGateWay.getORDER_BANKCODE()).append("',");
            sb.append("'").append(bankGateWay.getORDER_BANKNAME()).append("',");
            sb.append("'").append(bankGateWay.getBANKCODE()).append("',");
            sb.append("'").append(bankGateWay.getBANKNAME()).append("',");
            sb.append("'").append(bankGateWay.getGROUPTYPE()).append("',");
            sb.append("'").append(bankGateWay.getREQUEST_ID()).append("',");
            sb.append("'").append(bankGateWay.getREQUEST_URL()).append("',");
            sb.append("'").append(bankGateWay.getSIGNKEY()).append("',");
            sb.append("'").append(bankGateWay.getSIGNTYPE()).append("',");
            sb.append("'").append(bankGateWay.getINSU_MIDNO()).append("',");

            if (bankGateWay.getACCOUNTNO() != null) {
                sb.append("'").append(bankGateWay.getACCOUNTNO()).append("',");
            } else {
                sb.append(bankGateWay.getACCOUNTNO()).append(",");
            }
            if (bankGateWay.getCURRENCYCODE() != null) {
                sb.append("'").append(bankGateWay.getCURRENCYCODE()).append("',");
            } else {
                sb.append(bankGateWay.getCURRENCYCODE()).append(",");
            }
            if (bankGateWay.getPAYTYPE() != null) {
                sb.append("'").append(bankGateWay.getPAYTYPE()).append("',");
            } else {
                sb.append(bankGateWay.getPAYTYPE()).append(",");
            }

            sb.append("'").append(bankGateWay.getCHARSET()).append("',");
            sb.append("'").append(bankGateWay.getSHOW_URL()).append("',");
            sb.append("'").append(bankGateWay.getNOTIFY_URL()).append("',");
            sb.append("'").append(bankGateWay.getRETURN_URL()).append("',");
            sb.append("'").append(bankGateWay.getVERYFY_URL()).append("',");
            sb.append("'").append(bankGateWay.getTRANSPORT()).append("',");
            sb.append("'").append(bankGateWay.getIFVALID()).append("',");
            sb.append("'").append(bankGateWay.getPAYMETHOD()).append("',");
            sb.append("'").append(bankGateWay.getDEFAULT_LOGIN()).append("',");
            if (bankGateWay.getTIMESTAMP()==null){
                sb.append(bankGateWay.getDEFAULT_LOGIN()).append(",");
            }
            if (bankGateWay.getLASTOPDATE()==null){
                sb.append(bankGateWay.getDEFAULT_LOGIN()).append(",");
            }

            if (DBType.MYSQL == dbType  && bankGateWay.getTIMESTAMP()!=null){
                sb.append("'").append(bankGateWay.getTIMESTAMP()).append("',");
                sb.append("'").append(bankGateWay.getLASTOPDATE()).append("',");
            }else if (DBType.ORACLE == dbType && bankGateWay.getTIMESTAMP()!=null) {
                sb.append("to_date('").append(bankGateWay.getTIMESTAMP()).append("','yyyy-MM-dd HH24:MI:SS'),");
                sb.append("to_date('").append(bankGateWay.getLASTOPDATE()).append("','yyyy-MM-dd HH24:MI:SS'),");
            }

            sb.append("").append(bankGateWay.getHIBERNATEVERSION()).append(",");
            sb.append("'").append(bankGateWay.getMODIFYDESC()).append("',");
            sb.append("'").append(bankGateWay.getPOSID()).append("',");
            sb.append("'").append(bankGateWay.getMOBILE_REQUEST_URL()).append("',");
            sb.append("'").append(bankGateWay.getCONTRACTID()).append("',");
            sb.append("'").append(bankGateWay.getTYPENAME()).append("',");
            sb.append("'").append(bankGateWay.getUSER_ID()).append("',");
            sb.append("'").append(bankGateWay.getPASSWORD()).append("',");
            sb.append("'").append(bankGateWay.getCUST_ID()).append("',");
            sb.append("'").append(bankGateWay.getTYPE()).append("',");
            sb.append("'").append(bankGateWay.getACCOUNTNAME()).append("',");
            sb.append("'").append(bankGateWay.getSINGLE_MAXAMOUNT()).append("',");
            sb.append("'").append(bankGateWay.getPACKET_MAXAMOUNT()).append("',");
            sb.append("'").append(bankGateWay.getPACKET_MAXCOUNT()).append("',");
            sb.append("'").append(bankGateWay.getIFCHECKRESULT()).append("'");

            sb.append(");");
            tmpVal = sb.toString().replaceAll("'null'", "null");
            FileUtils.Write(sqlPath, tmpVal);
            sb.setLength(0);
        }
        FileUtils.Write(sqlPath, "");
        System.out.println("=====Game Over=====");

    }
}
