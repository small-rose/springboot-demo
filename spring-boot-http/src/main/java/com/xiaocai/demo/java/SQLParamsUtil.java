package com.xiaocai.demo.java;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ SQLParamsUtil ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/19 16:10
 * @Version ： 1.0
 **/
public class SQLParamsUtil {

    private String preparing;//对应带?的jdbc sql语句
    private String parameters;//对应所有的参数字符串
    private Integer updates;//对应受影响的行数
    private List<String> params;//对应所有的参数集合
    private String resultSql;//对应输出的sql

    @Test
    public void test_27(){
        String sql = "==>  Preparing: update KT_DIVISOR set code = ?, name = ?, type = ?, content = ?, module_id = ?, update_user = ?, update_time = ? where id = ? ; update KT_DIVISOR set code = ?, name = ?, type = ?, content = ?, module_id = ?, update_user = ?, update_time = ? where id = ?\n" +
                "\n" +
                "==> Parameters: PFJE(String), 赔付金额(String), decimal(String), <Property><code>PFJE</code><name>赔付金额</name><type>decimal</type></Property>(String), 11(String), '', 2022-07-20 18:11:25.183(Timestamp), 1005(String), DYFLimitAmount(String), 垫预付配置金额(String), decimal(String), <Property><code>DYFLimitAmount</code><name>垫预付配置金额</name><type>decimal</type></Property>(String), 11(String), '', 2022-07-20 18:11:25.188(Timestamp), 1006(String)";
        SQLParamsUtil sqlLog = new SQLParamsUtil();
        String resultSql = sqlLog.parseSql(sql);
        System.out.println(resultSql);
    }

    @Test
    public void test_15(){
        String sql = "==>  Preparing: select p.payableno as settlementno,p.exchangecurrencycode,p.exchangeamount,p.hascoins ,p.coinsurno,'12' as businesstype, (select IFNULL(sum(t.baserealamount), null) from mm_policy_td t where t.policyno = p.policyno and t.amount > 0 and t.businessattr = '1') as baserealamount, '' as contractcode,p.agentcode,p.amount,p.bankname,p.baseamount,p.basecurrencycode ,p.baseusedamount,p.businessattr,p.canceldate,p.cancelflag,p.claimno,p.classescode ,p.currencycode,p.custaccountno,p.custbankno,p.customercode,p.customername ,p.customernameen,p.customerpartyno,p.custseq,p.datasource,p.datatype,p.departmentcode ,p.remark as description,p.endorseno,p.fatherno,p.inpaymentbatchno,p.lastopdate ,p.opcode,p.opdate,p.opstatus,p.policyno,p.risktype,p.subcompany,p.summaryno,p.timestamp ,p.unitcode,p.usedamount, (CASE p.datatype WHEN '575' THEN p.amount - p.usedamount + p.taxesamount ELSE p.amount - p.usedamount - IFNULL(p.confirmamount,0) END) handledamount,(CASE P.DATATYPE WHEN '575' THEN P.BASEAMOUNT - P.BASEUSEDAMOUNT + P.BASETAXESAMOUNT ELSE P.BASEAMOUNT - P.BASEUSEDAMOUNT - IFNULL(p.confirmamount,0) END) AS HandLEDBASEAMOUNT,'' as departmentname, p.paycode, p.certitype,(select distinct DATE_FORMAT(startdate,'%Y%m%d') from mm_policy_td where policyno=p.policyno and amount > 0 and businessattr = '1' limit 1) startdate, p.proportionamount,null as transactorname,p.taxesamount,p.basetaxesamount, p.payableseq,p.returnno,p.serialno,p.paytype ,(select IFNULL(sum(d.baseamount-d.baserealamount),0) from mm_policy_td d where policyno=p.policyno and Opstatus in('0','1','2') and amount>0 and businessattr in('1','51')) as baseleftamount , 0 as seqinvply, p.checkstatus,p.checkcode,p.checkdate,p.checkcontent,p.fastflag,p.smsflag ,p.custagentbankname,p.custagentbankaddr,p.custaddress,p.custcountryname ,p.custcountrycode,p.custagentaccountno ,'' batchId,'' batchSummaryno,0 batchAmount,'' AS actualcurrencycode,0 AS actualexchangerate ,p.confirmsequenceno,p.ifupload ,(case when p.datatype in ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ) then (IFNULL((select authorizedstate from mm_settlementcancel_td s where s.listno = p.payableno and s.authorizedtype='2'),'0')) else '' end) as authorizedstate,IF(p.paymentmethod='0','52',p.paymentmethod) as paymentmethod ,p.reportcaseno AS reportcaseno,p.totalserialno AS totalserialno ,null AS ifagentbusiness,null as isjointinsurance, null AS jointinsuranceno ,(case when p.currencycode = 'CNY' and (p.exchangecurrencycode = 'CNY' or (p.exchangecurrencycode is null or p.exchangecurrencycode = '')) then 1.00000000 else p.exchangerate end) as exchangerate ,'' as seqhandover,p.insuredcode as insuredcode,p.insuredname as insuredname ,p.ISSPLITTED as ISSPLITTED, certificatetype, certificateno, ispaypublic from mm_payablemoney_td p where 1 = 1 and p.FASTFLAG != '1' and (not exists (select 1 from mm_centralizationlist_td cen where cen.custseq = p.custseq and cen.opstatus != '3')) and p.paymentmethod != '52' and p.opstatus in ('0','1') and (p.ifbillback = '0' or p.ifbillback is null ) and (p.subcompany = ? or p.datatype = '3L1') and NOT EXISTS (SELECT 1 FROM mm_payablemoney_td pm WHERE pm.payableno = p.payableno and pm.paymentmethod = '57') and p.basecurrencycode = ? and p.opdate >= ? and p.opdate <= ? and not exists ( select 1 from mm_payablemoney_td pe where pe.payableno = p.payableno and pe.datatype in('302','575','311','315','356') and pe.fastflag = '1' ) and not exists(select he.seqpolicy from mm_handover_events_td he where he.seqpolicy = p.fatherno and he.opstatus != '3') and p.opstatus in('0','1') and p.amount>0 and p.datatype in ( ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? ) union all select cast(mh.seqhandover as decimal(30,0)) as settlementno,mh.exchangecurrencycode as exchangecurrencycode,mh.exchangeamount as exchangeamount,null as hascoins,null as coinsurno,'13' as businesstype, -(select IFNULL(sum(h.baserealamount),0) from mm_handover_events_td h where h.handoverno = mh.handoverno) as baserealamount,null as contractcode,mh.agentcode, -(select IFNULL(sum(h.baseamount),0) from mm_handover_events_td h where h.handoverno = mh.handoverno) as amount,mh.bankname as bankname, -(select IFNULL(sum(h.baseamount),0) from mm_handover_events_td h where h.handoverno = mh.handoverno) as baseamount,mh.basecurrencycode, -(select IFNULL(sum(h.baserealamount),0) from mm_handover_events_td h where h.handoverno = mh.handoverno) as baseusedamount,null as businessattr, mh.canceldate,'0' as cancelflag,null as claimno,mh.classescode,mh.basecurrencycode as currencycode,mh.custaccountno as custaccountno,mh.custbankno as custbankno, mh.customercode,mh.customername,null as customernameen,null as customerpartyno,null as custseq,null datasource,'171' as datatype, mh.departmentcode,null as description,null as endorseno,cast(mh.seqhandover as decimal(30,0)) as fatherno,null as inpaymentbatchno,mh.timestamp as lastopdate,mh.opcode, mh.opdate,mh.opstatus,null as policyno,null as risktype,mh.subcompany,mh.handoverno as summaryno,mh.timestamp, (SELECT app.unitcode FROM mm_unitmapping_tc app WHERE app.departmentcode = mh.departmentcode limit 1) as unitcode, -(select IFNULL(sum(h.baserealamount),0) from mm_handover_events_td h where h.handoverno = mh.handoverno) as usedamount, -(select IFNULL(sum(h.baseamount-h.baserealamount),0) from mm_handover_events_td h where h.handoverno = mh.handoverno) as handledamount, -(select IFNULL(sum(h.baseamount-h.baserealamount),0) from mm_handover_events_td h where h.handoverno = mh.handoverno) as handledbaseamount, (select dep.departmentname from mm_department_tc dep where dep.departmentcode = mh.departmentcode) as departmentname, null as paycode,null as certitype,'0' as startdate,null as proportionamount,null as transactorname,null as taxesamount,null as basetaxesamount, null as payableseq,null as returnno,'1' as serialno,'3' as paytype,0 as baseleftamount,0 as seqinvply,null as checkstatus,null as checkcode, null as checkdate,null as checkcontent,null as fastflag,null as smsflag,null as custagentbankname,null as custagentbankaddr,null as custaddress, null as custcountryname,null as custcountrycode,null as custagentaccountno,null as batchId,null as batchSummaryno,0 as batchAmount,mh.exchangecurrencycode as actualcurrencycode, 0 as actualexchangerate,null as confirmsequenceno,null as ifupload,'0' as authorizedstate,mh.paymentmethod as paymentmethod,null as reportcaseno,null totalserialno, null ifagentbusiness,null isjointinsurance,null jointinsuranceno,mh.custaccountname as custaccountname, (case when mh.basecurrencycode = 'CNY' and (mh.exchangecurrencycode = 'CNY' or (mh.exchangecurrencycode is null or mh.exchangecurrencycode = '')) then 1.00000000 else mh.exchangerate end) as exchangerate,mh.seqhandover,'' as insuredcode,'' as insuredname ,'' as ISSPLITTED, null as certificatetype, null as certificateno, null as ispaypublic from mm_handover_td mh where 1 = 1 and mh.paymentmethod != '52' and mh.opstatus in ('0', '1') and mh.baseamount <= 0 and (mh.subcompany = ?) and mh.basecurrencycode = ? and mh.opdate >= ? and mh.opdate <= ?\n" +
                "==> Parameters: 304(String), 313(String), 316(String), 323(String), 321(String), 351(String), 353(String), 355(String), 358(String), 364(String), 35A(String), 35C(String), 326(String), 390(String), 385(String), 359(String), 302(String), 307(String), 311(String), 314(String), 319(String), 325(String), 328(String), 332(String), 336(String), 340(String), 344(String), 348(String), 352(String), 354(String), 356(String), 357(String), 360(String), 361(String), 363(String), 366(String), 35B(String), 35D(String), 35F(String), 384(String), 391(String), 3J0(String), 3J1(String), 3J2(String), 3J3(String), 306(String), 315(String), 311(String), 3J8(String), 3K2(String), 375(String), 3K6(String), 502(String), 504(String), 506(String), 508(String), 512(String), 514(String), 522(String), 526(String), 534(String), 536(String), 537(String), 516(String), 518(String), 524(String), 528(String), 532(String), 535(String), 538(String), 539(String), 540(String), 541(String), 542(String), 505(String), 517(String), 519(String), 520(String), 539(String), 540(String), 541(String), 542(String), 511(String), 598(String), 586(String), 596(String), 582(String), 0000000000(String), CNY(String), 2022-01-20 00:00:00.0(Timestamp), 2022-07-19 00:00:00.0(Timestamp), 302(String), 311(String), 314(String), 319(String), 325(String), 352(String), 354(String), 356(String), 357(String), 363(String), 366(String), 35B(String), 35D(String), 384(String), 391(String), 315(String), 311(String), 107(String), 137(String), 112(String), 117(String), 152(String), Y03(String), 575(String), 576(String), 551(String), 552(String), 577(String), 578(String), (String), 305(String), 306(String), 307(String), 327(String), 328(String), 332(String), 335(String), 336(String), 340(String), 344(String), 348(String), 360(String), 361(String), 374(String), 3J0(String), 3J1(String), 3J2(String), 3J3(String), 3J8(String), 3K2(String), 35F(String), 375(String), 3K6(String), 307(String), 330(String), 334(String), 338(String), 342(String), 346(String), 350(String), 359(String), 362(String), 365(String), 3J4(String), 3J5(String), 3J6(String), 3J7(String), (String), (String), 402(String), 107(String), 137(String), 112(String), 117(String), 167(String), 152(String), Y03(String), 304(String), 313(String), 316(String), 323(String), 321(String), 351(String), 353(String), 355(String), 358(String), 364(String), 35A(String), 35C(String), 326(String), 390(String), 385(String), 359(String), 109(String), 512(String), 514(String), 526(String), 564(String), 528(String), 530(String), 544(String), 546(String), 548(String), 550(String), RG1(String), RG2(String), 392(String), 393(String), 167(String), (String), 131(String), 356(String), 360(String), 366(String), 536(String), 540(String), 122(String), 357(String), 361(String), 363(String), 537(String), 541(String), 522(String), 534(String), 532(String), 132(String), 355(String), 358(String), 359(String), 362(String), 3K7(String), 3K8(String), 535(String), 539(String), 532(String), 524(String), 0000000000(String), CNY(String), 2022-01-20 00:00:00.0(Timestamp), 2022-07-19 00:00:00.0(Timestamp)\n";
        SQLParamsUtil sqlLog = new SQLParamsUtil();
        String resultSql = sqlLog.parseSql(sql);
        System.out.println(resultSql);
    }
    public String getSQL(String sql){
        if (sql==null){
            return "";
        }
        sql = sql.replaceAll("\\?", "1");
        return sql ;
    }


    /**
     * 解析sql
     * @param content mybatis日志sql打印部分
     * @return 输出的sql
     */
    public String parseSql(String content){
        String preParingPn = "==>  Preparing: (.*?)\n";
        Pattern r = Pattern.compile(preParingPn);
        Matcher m = r.matcher(content);
        if(m.find()){
            preparing = m.group(1);
        }
        String parametersPn = "==> Parameters: (.*?)\n";
        r = Pattern.compile(parametersPn);
        m = r.matcher(content);
        if(m.find()){
            parameters = m.group(1);
        }
        String updatesPn = "<==    Updates: (\\d+)\n";
        r = Pattern.compile(updatesPn);
        m = r.matcher(content);
        if(m.find()){
            updates = Integer.valueOf(m.group(1));
        }
        parseParameters();
        return resultSql;
    }


    /**
     * 正则匹配所有的参数
     */
    private void parseParameters(){
        parameters = parameters+ ",";
        String pattern = "([^,]*?)\\((.*?)\\),|null,";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(parameters);
        params = new ArrayList<>();
        while(m.find()){
            String param = m.group(1);
            System.out.println(" param == " +param);
            String type = m.group(2);
            System.out.println(" type == " +type);

            if("String".equals(type)){
                params.add("\'"+param.trim()+"\'");
            }else if("Timestamp".equals(type) ){
                params.add("TIMESTAMP'"+param.trim()+"'");
            }else if(param == null) {
                params.add("null");
            }else{
                params.add(param.trim());
            }
        }
        resultSql = preparing;
        for (String param : params) {
            resultSql = resultSql.replaceFirst("\\?", param);
        }
    }
}
