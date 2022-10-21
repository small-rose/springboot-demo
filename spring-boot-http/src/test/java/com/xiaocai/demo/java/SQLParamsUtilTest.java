package com.xiaocai.demo.java;

import org.junit.Test;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SQLParamsUtilTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/21 15:51
 * @Version ： 1.0
 **/
public class SQLParamsUtilTest {

    @Test
    public void test_01(){
        String sql = "==> Parameters: 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String)";
        String pattern = "([^,]*?)\\((.*?)\\),|null,";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(sql);
        while(m.find()){
            String param = m.group(1);
            System.out.println(" param == " +param);
            String type = m.group(2);
            System.out.println(" type == " +type);
        }
    }

    @Test
    public void test_27(){
        String sql = "==>  Preparing: update KT_DIVISOR set code = ?, name = ?, type = ?, content = ?, module_id = ?, update_user = ?, update_time = ? where id = ? ; update KT_DIVISOR set code = ?, name = ?, type = ?, content = ?, module_id = ?, update_user = ?, update_time = ? where id = ?\n" +
                "==> Parameters: PFJE(String), 赔付金额(String), decimal(String), <Property><code>PFJE</code><name>赔付金额</name><type>decimal</type></Property>(String), 11(String), null, 2022-07-20 18:11:25.183(Timestamp), 1005(String), DYFLimitAmount(String), 垫预付配置金额(String), decimal(String), <Property><code>DYFLimitAmount</code><name>垫预付配置金额</name><type>decimal</type></Property>(String), 11(String), null, 2022-07-20 18:11:25.188(Timestamp), 1006(String)\n";
        SQLParamsUtil sqlLog = new SQLParamsUtil();
        String resultSql = sqlLog.parseSql(sql);
        System.out.println(resultSql);
    }

    @Test
    public void test_15(){
        String sql = "==>  Preparing: select * from ( select pt.seqpolicy as seqpolicy, pt.subcompany as subcompany, pt.policyno as policyno, pt.endorseno as endorseno, pt.amount as policyamout, pt.customercode as customercode, pt.customername as customername, pt.applicantcode as applicantcode, pt.applicantnamecn as applicantnamecn, pt.applicantnameen as applicantnameen, pt.classescode as classescode, pt.taxesamount as taxesamount, pt.taxesrate as taxesrate, pt.departmentcode as departmentcode, pt.opdate as opdate, (select dpt.departmentname from mm_department_tc dpt where dpt.departmentcode = pt.departmentcode) as departmentname, pt.unitcode as unitcode, (select ut.unitname from mm_unit_tc ut where ut.unitcode = pt.unitcode) as unitname, '已补录' as issupplement, GROUP_CONCAT(ivt.invoiceno, ',') as invoiceno, pt.invoicetype as invoicetype, GROUP_CONCAT(ivt.invoicecode, ',') as invoicecode, IFNULL(sum(ivt.sumamount), 0) as invoamout, IFNULL(sum(ivt.sumpriceamount), 0) as exclusivetaxamount, IFNULL(sum(sumtaxesamount), 0) as invoicetaxamount, pt.opstatus as opstatus, pt.transactorname, pt.transactorcode, pt.serialno, pt.invoicetype as kplx, '1' as businesstype, pt.custseq, null as exchangecurrencycode, null as exchangeamount, null as exchangerate, pt.datasource from mm_policy_td pt, mm_invoicevatin_td ivt where pt.custseq = ivt.custseq and pt.businessattr = 'G' and IFNULL(pt.amount, 0.00) != IFNULL(pt.invoiceamount, 0.00) and ivt.invoiceno is not null and pt.subcompany = ? and pt.unitcode in ( ? ) and pt.customercode in ( ? ) and pt.classescode in ( ? ) and pt.transactorcode in ( ? ) and pt.policyno in ( ? ) and pt.endorseno in ( ? ) and pt.serialno in ( ? ) and to_char(pt.opdate, 'yyyy-mm-dd') >= to_char( ?, 'yyyy-mm-dd') and to_char(pt.opdate, 'yyyy-mm-dd') <= to_char( ?, 'yyyy-mm-dd') and pt.applicantcode in ( ? ) group by pt.seqpolicy, pt.taxesrate, pt.custseq, pt.transactorname, pt.invoicetype, pt.subcompany, pt.policyno, pt.endorseno, pt.amount, pt.customercode, pt.customername, pt.applicantcode, pt.applicantnamecn, pt.applicantnameen, pt.classescode, pt.taxesamount, pt.departmentcode, pt.opdate, pt.departmentcode, pt.unitcode, pt.amount, pt.opstatus, pt.transactorcode, pt.datasource, pt.serialno union all select p.seqpolicy as seqpolicy, p.subcompany as subcompany, p.policyno as policyno, p.endorseno as endorseno, p.amount as policyamout, p.customercode as customercode, p.customername as customername, p.applicantcode as applicantcode, p.applicantnamecn as applicantnamecn, p.applicantnameen as applicantnameen, p.classescode as classescode, p.taxesamount as taxesamount, p.taxesrate as taxesrate, p.departmentcode as departmentcode, p.opdate as opdate, (select dpt.departmentname from mm_department_tc dpt where dpt.departmentcode = p.departmentcode) as departmentname, p.unitcode as unitcode, (select ut.unitname from mm_unit_tc ut where ut.unitcode = p.unitcode) as unitname, '未补录' as issupplement, null as invoiceno, p.invoicetype, null as invoicecode, null as invoamout, null as exclusivetaxamount, null as invoicetaxamount, null as opstatus, p.transactorname, p.transactorcode, p.serialno, null as kplx, '1' as businesstype , p.custseq , null as exchangecurrencycode, null as exchangeamount, null as exchangerate, p.datasource from mm_policy_td p where 1 = 1 and p.businessattr = 'G' and IFNULL(p.amount, 0.00) != IFNULL(p.invoiceamount, 0.00) and not exists(select 1 from mm_invatinvoicedetail_td d where d.reserve2 = p.seqpolicy ) and p.subcompany = ? and p.unitcode in ( ? ) and p.customercode in ( ? ) and p.classescode in ( ? ) and p.transactorcode in ( ? ) and p.policyno in ( ? ) and p.endorseno in ( ? ) and p.serialno in ( ? ) and to_char(p.opdate, 'yyyy-mm-dd') >= to_char( ?, 'yyyy-mm-dd') and to_char(p.opdate, 'yyyy-mm-dd') <= to_char( ?, 'yyyy-mm-dd') and p.applicantcode in ( ? ) ) temp where 1=1 and exists(select 1 from mm_deposit_td d where 1=1 and IFNULL(temp.policyno,'1') = IFNULL( d.column_1,IFNULL(temp.policyno,'1')) and IFNULL(temp.endorseno,'1') = IFNULL( d.column_2,IFNULL(temp.endorseno,'1')) and d.rcptno = ? )\n" +
                "==> Parameters: 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String)";
        SQLParamsUtil sqlLog = new SQLParamsUtil();
        String resultSql = sqlLog.parseSql(sql);
        System.out.println(resultSql);
    }
    @Test
    public void test_fill2(){
        String sql = "update KT_DIVISOR set code = ?, name = ?, type = ?, content = ?, module_id = ?, update_user = ?, update_time = ? where id = ? ; update KT_DIVISOR set code = ?, name = ?, type = ?, content = ?, module_id = ?, update_user = ?, update_time = ? where id = ?";
        String sqlParams =  "PFJE(String), 赔付金额(String), decimal(String), <Property><code>PFJE</code><name>赔付金额</name><type>decimal</type></Property>(String), 11(String), null, 2022-07-20 18:11:25.183(Timestamp), 1005(String), DYFLimitAmount(String), 垫预付配置金额(String), decimal(String), <Property><code>DYFLimitAmount</code><name>垫预付配置金额</name><type>decimal</type></Property>(String), 11(String), null, 2022-07-20 18:11:25.188(Timestamp), 1006(String)";
        SQLParamsUtil sqlLog = new SQLParamsUtil();
        sqlLog.setPreparing(sql);
        sqlLog.setParameters(sqlParams);
        String resultSql = sqlLog.fill();
        System.out.println("=====");
        System.out.println(resultSql);
        System.out.println("=====");

    }

    @Test
    public void test_fill(){
        String sql = "select * from (select ( SELECT g.switchinfo FROM mm_switchcontrol_tc g WHERE g.subcompany = 'ALL' and g.switchedsys = ?) as sign,'1' as star,accountno, (select concat(c.agentname, '/', c.agentnameen) from mm_agentcode_tc c where c.agentcode=u.agentcode) as agentcode, mmaccountid,amount,baseamount,basecurrencycode,baseusedamount,canceldate, currencycode,customercode,customername,customernameen,customerpartyno,datatype, departmentcode,(select departmentname from mm_department_tc where departmentcode=u.departmentcode) departmentname, description,fatherno,u.feeamount,(amount - usedamount - u.feeamount) as handledamount,lastopdate, opcode,opdate,opstatus,subcompany,unitcode,usableno,useableseq,usedamount,customertype, IFNULL ((select authorizedstate from mm_settlementcancel_td s where s.listno = u.usableno), 0) as authorizedstate , inpaymentno,protocoltno,bankabstract, (SELECT opname FROM mm_user_tc q WHERE q.opcode = u.processor) AS processor from mm_usablemoney_td u where u.IFCLAIM != 'S') j where opstatus in ('0','1') and j.handledamount > 0 and (amount - usedamount -ifnull((select sum(d1.amount) from mm_inpayment_ti d1 where d1.useableno = j.usableno and d1.status = '1'),'0.00')) > 0 and baseamount>0 and exists( select 1 from MM_BIZPRIVILEGE_COVER_TD biz where biz.opcode = ? and biz.powermark=5 and biz.subcompany = j.subcompany) and NOT exists(SELECT 1 FROM mm_bankflowauthorization_td d WHERE d.usableno = j.usableno) and j.currencycode in (?) and j.subcompany = ? and DATE_FORMAT(j.opdate, '%Y-%m-%d') >= DATE_FORMAT(?,'%Y-%m-%d') and DATE_FORMAT(j.opdate, '%Y-%m-%d') <= DATE_FORMAT(?,'%Y-%m-%d') union all SELECT (SELECT g.switchinfo FROM mm_switchcontrol_tc g WHERE g.subcompany = 'ALL' and g.switchedsys = ?) as sign,'2' as star,T.ACCOUNTNO,T.AGENTCODE, T.mmaccountid,T.AMOUNT,T.AMOUNT AS BASEAMOUNT,T.BASECURRENCYCODE, T.USEDAMOUNT AS BASEUSEDAMOUNT,T.CANCELDATE,T.CURRENCYCODE,T.CUSTOMERCODE, T.CUSTOMERNAME,T.CUSTOMERNAMEEN,T.CUSTOMERPARTYNO,T.DATATYPE,T.DEPARTMENTCODE, (SELECT DEPARTMENTNAME FROM MM_DEPARTMENT_TC WHERE DEPARTMENTCODE = T.DEPARTMENTCODE) AS DEPARTMENTNAME,B.MODIFYDESC AS DESCRIPTION, T.FATHERNO,IFNULL((SELECT SUM(D.AMOUNT) FROM MM_INPAYMENT_TI D WHERE D.USEABLENO = T.USABLENO and D.STATUS = '1'),'0.00') AS FEEAMOUNT, T.AMOUNT - IFNULL((SELECT SUM(D.AMOUNT) FROM MM_INPAYMENT_TI D WHERE D.USEABLENO = T.USABLENO and D.STATUS = '1'),'0.00') - T.USEDAMOUNT AS HandLEDAMOUNT, T.LASTOPDATE,T.OPCODE,T.OPDATE,T.OPSTATUS,T.SUBCOMPANY,T.UNITCODE, T.USABLENO, T.USEABLESEQ,T.USEDAMOUNT,T.CUSTOMERTYPE, IFNULL((SELECT AUTHORIZEDSTATE FROM MM_SETTLEMENTCANCEL_TD S WHERE S.LISTNO = T.USABLENO),0) AS AUTHORIZEDSTATE, T.INPAYMENTNO,T.PROTOCOLTNO,T.BANKABSTRACT, (SELECT opname FROM mm_user_tc q WHERE q.opcode = T.processor) AS processor FROM MM_BANKFLOWAUTHORIZATION_TD B, MM_USABLEMONEY_TD T WHERE T.USABLENO = B.USABLENO and T.IFCLAIM != 'S' and t.opstatus in ('0', '1') and B.AMOUNT != T.USEDAMOUNT and B.unitcode = ? and T.currencycode in (?) and B.subcompany = ? and DATE_FORMAT(t.opdate, '%Y-%m-%d') >= DATE_FORMAT(?,'%Y-%m-%d') and DATE_FORMAT(t.opdate, '%Y-%m-%d') <= DATE_FORMAT(?,'%Y-%m-%d')";
        String sqlParams =  " 0000000000(String), SYSTEM(String), (String), 0000000000(String), 2022-07-03 00:00:00.0(Timestamp), 2022-08-02 00:00:00.0(Timestamp), 0000000000(String), 00000000(String), (String), 0000000000(String), 2022-07-03 00:00:00.0(Timestamp), 2022-08-02 00:00:00.0(Timestamp)";
        SQLParamsUtil sqlLog = new SQLParamsUtil();
        sqlLog.setPreparing(sql);
        sqlLog.setParameters(sqlParams);
        String resultSql = sqlLog.fill();
        System.out.println("=====");
        System.out.println(resultSql);
        System.out.println("=====");

    }

    @Test
    public void test_78(){

        List<String> collect = Stream.of("CNY".split(",")).collect(Collectors.toList());
        collect.stream().forEach(System.out::println);
    }
}
