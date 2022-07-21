package com.xiaocai.demo.java;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String sql = "select c.seqpayment, c.seqclaim, c.subcompany, c.claimno, c.caseno, c.policyno, c.endorseno, c.startdate, c.enddate, c.businessattr, c.transactorcode, c.businesschannel, c.risktype, c.classescode, c.classeskind, c.auditdate, c.basecurrencycode, c.baseamount, c.baseaccountamount, c.basereceivableamount, c.baserealamount, c.currencycode, c.amount, c.accountamount, c.receivableamount, c.realamount, c.agiotageamount, c.departmentcode, c.agentcode, c.claimtype, c.custaccountno, c.bankname, c.custbankno, c.customercode, c.customername, c.opstatus, c.datasource, c.lastopdate, c.description, c.timestamp, c.inputdate, c.hibernateversion, c.paysubcompany, c.ifcorsspay, c.advancesequence, c.serialno, c.custseq, c.modifydesc, c.summaryno, c.inpaymentbatchno, c.iscoinsurance, c.insuredcode, c.insuredname, c.insurednameen, c.insuredpartyno, c.applicantcode, c.applicantnamecn, c.applicantnameen, c.applicantionpartyno, c.appisjapan, c.domestic, c.porttype, c.billno, c.offsetno, c.plandate, c.customernameen, c.customerpartyno, c.custisjapan, c.agentnameen, c.agentpartyno, c.contracttype, c.custaccountname, c.custaccountnameen, c.chargedescription, c.insuranceterm, c.recoverycode, c.exstatus, c.exceptioncause, c.banks, c.ifpublic, c.payeecity, c.payeeprovince, c.defraymode, c.claimflag, c.bankremark, c.reportcaseno, c.pairno, c.ifcoinsurance, c.ifinside, c.mainclaimno, c.seqpaymentcopy, c.gdunitcode, c.gdunitname, c.vehicleno, c.taxorgtally, c.taxesamountout, c.taxesamount, c.vehkind, (select p.ifbillback from mm_payablemoney_td p where p.fatherno = c.seqpayment and p.amount = c.amount LIMIT 1) as ifbillback,(select u.unitname from mm_unit_tc u, mm_unitmapping_tc p where p.subcompany = c.subcompany and p.departmentcode = c.departmentcode and p.unitcode = u.unitcode LIMIT 1 ) as unitname,(select cl.classescodename from mm_classescode_tc cl where cl.classescode=c.classescode) as classescodename,(select v.agentname from mm_agentcode_tc v where v.agentcode=c.agentcode LIMIT 1) as agentnamecn,(SELECT m.sap_code FROM sap_code_mapping m WHERE m.typename = 'orgCode' and m.tmnch_code = c.departmentcode) as centercode,(SELECT m.codedesc FROM sap_code_mapping m WHERE m.typename = 'orgCode' and m.tmnch_code = c.departmentcode) as centername,(select e.departmentname from mm_department_tc e where e.departmentcode=c.departmentcode )as departmentname,(select p.paymentmethod from mm_payablemoney_td p where p.fatherno = c.seqpayment and p.amount = c.amount LIMIT 1)as inpaymentmethod,IFNULL((case when p.paymentmethod='52' then DATE_FORMAT(pdt.PAYMADEDATE, '%Y-%m-%d') else DATE_FORMAT(pe.TIMESTAMP, '%Y-%m-%d') end),'') as PAYMADEDATE from mm_claim_td c ,mm_deposit_td d LEFT JOIN mm_payablemoney_td p on c.SEQPAYMENT = p.FATHERNO LEFT JOIN mm_paymentin_events_td pe on p.PAYABLENO = pe.OLDNO LEFT JOIN mm_platformfile_detail_td pdt on pe.NEWNO = pdt.INPAYMENTID WHERE DATE_FORMAT(c.auditdate, '%Y-%m-%d') >= STR_TO_DATE(?,'%Y-%m-%d') and DATE_FORMAT(c.auditdate, '%Y-%m-%d') <= STR_TO_DATE(?,'%Y-%m-%d') AND case when p.paymentmethod = '52' then DATE_FORMAT(pdt.PAYMADEDATE, '%Y-%m-%d') >= STR_TO_DATE(?,'%Y-%m-%d') else DATE_FORMAT(pe.TIMESTAMP, '%Y-%m-%d') >= STR_TO_DATE(?,'%Y-%m-%d') end AND case when p.paymentmethod = '52' then DATE_FORMAT(pdt.PAYMADEDATE, '%Y-%m-%d') <= STR_TO_DATE(?,'%Y-%m-%d') else DATE_FORMAT(pe.TIMESTAMP, '%Y-%m-%d') <= STR_TO_DATE(?,'%Y-%m-%d') end and c.subcompany in ( ? ) and exists ( select 1 from mm_unitmapping_tc m where m.subcompany = c.subcompany and m.departmentcode =c.departmentcode and m.unitcode in ('1') ) and vehicleno in ( ? ) and c.policyno in ( 1 ) and c.claimno in (1) and c.reportcaseno in ( ? ) and c.endorseno in (1) and c.agentcode = ? and c.applicantcode in ('1') and c.currencycode in ('1') and c.classescode in ( ? ) and c.departmentcode in ('1') and c.claimtype in ('1') and c.opstatus in('0', '1', '2') and c.insuredcode in ('1') and c.customercode in ('1') and d.rcptno = ? and IFNULL(c.policyno,'1') = IFNULL(d.column_1,IFNULL(c.policyno,'1')) and IFNULL(c.endorseno,'1') = IFNULL(d.column_2,IFNULL(c.endorseno,'1')) and IFNULL(c.claimno,'1') = IFNULL(d.column_3,IFNULL(c.claimno,'1')) and IFNULL(c.caseno,'1') = IFNULL(d.column_4,IFNULL(c.caseno,'1')) order by c.claimno";
        String sqlParams =  "1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String), 1(String)";
        SQLParamsUtil sqlLog = new SQLParamsUtil();
        sqlLog.setPreparing(sql);
        sqlLog.setParameters(sqlParams);
        String resultSql = sqlLog.fill();
        System.out.println("=====");
        System.out.println(resultSql);
        System.out.println("=====");

    }
}
