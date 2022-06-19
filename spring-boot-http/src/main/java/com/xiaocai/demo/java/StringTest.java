package com.xiaocai.demo.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.junit.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ StringTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/17 10:16
 * @Version ： 1.0
 **/
public class StringTest {

    public static void main(String[] args) throws ParseException {

        String str = "00000000131401314620";
        String newStr = str.replaceAll("^(0+)", "");
        System.out.println(newStr);


        long a = 0 ;
        long b = Long.parseLong("0");
        System.out.println(a==0);
        System.out.println(a==b);



        String data = "Data=abcd" ;
        if (data.startsWith("Data=")){
            data = data.substring(4);
        }
        System.out.println("---"+data);


    }


    @Test
    public void test(){
        String   paySuccessDate = "2021-11-25 10:02:18";
        System.out.println("---"+paySuccessDate.substring(0,10).replaceAll("-",""));
        System.out.println("---"+paySuccessDate.substring(11).replaceAll(":",""));
    }

    @Test
    public void test02(){
        String alipayResult = "000000|<form action='' />";
        String[] results = alipayResult.split("\\|");
        System.out.println("--results[0]-"+results[0]);
        System.out.println("--results[1]-"+results[1]);

        int i = alipayResult.lastIndexOf("|");
        String ms = alipayResult.substring(i+1,alipayResult.length());
        String mm = alipayResult.substring(0, i);
        System.out.println("--------------------");
        System.out.println("--ms-"+ms);
        System.out.println("--mm-"+mm);

    }


    @Test
    public void substring() {
        String aliForm = "<form action='' ></form><script>alert('test')</script>";
        String form = aliForm.substring(0, aliForm.indexOf("<script>"));
        System.out.println(form);
        form = form.concat("<script>document.forms[0].submit();</script>");
        System.out.println(form);

    }

    @Test
    public void substring02() {
        String aliForm = "https://qr.alipay.com/bax08692juhdbtp1bzki0087ALIPAYFTF";
        String form = aliForm.substring(0, aliForm.indexOf("ALIPAYFTF"));
        System.out.println(form);


    }


    @Test
    public void typeTest() {
        List<Student> studentList = new ArrayList<>();

        Student s1 = new Student("zz", 13);
        Student s2 = new Student("aa", 18);
        studentList.add(s1);
        studentList.add(s2);
        studentList.sort(Comparator.comparingInt(Student::getAge));

    }

    @Test
    public void contains11Test() {
        System.out.println("='5'".contains("'"));
        System.out.println("='5'".length());;

    }

    @Test
    public void test_sb01(){
        StringBuilder tempstring = new StringBuilder();
        tempstring.append("SELECT i.seqpolicy, i.seqcharge, i.subcompany, i.policyno, i.endorseno,i.mainpolicyno,i.businessno \n");
        tempstring.append(",i.basecurrencycode, i.baseamount, i.baseaccountamount, i.basereceivableamount \n");
        tempstring.append(",i.baserealamount, i.invoiceamount, i.invoicepaidamount, i.currencycode, i.amount,(i.amount-i.realamount) as policyAmount \n");
        tempstring.append(",i.accountamount, i.receivableamount, i.realamount, i.premium, i.agiotageamount \n");
        tempstring.append(",i.incurrencycode, i.businessattr, i.ifstart, i.operatedtimes, i.unitcode \n");
        tempstring.append(",i.departmentcode, (select DEPARTMENTNAME from mm_department_tc where i.departmentcode=departmentcode) DEPARTMENTNAME \n");
        tempstring.append(",i.signdate, i.signdate auditdate, i.startdate, i.enddate, i.customercode \n");
        tempstring.append(",(select c.CUSTOMERNAMECN from mm_customer_tc c where c.CUSTOMERCODE= i.customercode LIMIT 1) customername \n");
        tempstring.append(", i.transactorcode,  i.transactorname,i.underwritercode, i.businesschannel \n");
        tempstring.append(",(select businname from mm_dictcontent_td where busintypeid='BUSINESSCHANNEL' and i.businesschannel=businid ) businesschannelname ,i.classescode \n");
        tempstring.append(",i.risktype, i.classeskind, i.agentcode,(select trim(agentname) from mm_agentcode_tc where i.agentcode=agentcode) agentname \n");
        tempstring.append(", i.endorsetype, i.hasplan, i.iscoinsurance \n");
        tempstring.append(",i.masterprotocolno, i.cardpolicyno, i.totalprotocoltno, i.lastopdate, i.opstatus,i.taxesamount,i.taxesrate,i.equalsale,i.customertype,i.ifagentbusiness \n");
        tempstring.append(",i.datasource, i.polandinv, i.description, i.handoverno, i.summaryno, i.settlementno,i.inpaymentdepartment \n");
        tempstring.append(",i.feeflag,i.protocolFlag,i.confirmsequenceno,i.custseq,(i.amount - i.taxesamount) as minustaxamount \n");
        tempstring.append(",IFNULL(i.baseamount - i.baserealamount - IFNULL((select ex.handleamount from mm_policyextension_td ex where ex.seqpolicy = i.seqpolicy),0),0) as tempamount \n");
        tempstring.append(",'0' as tempstatus,'' as  shhandoverno,i.businesssource,i.characteristics,i.grouptype \n");
        tempstring.append(",i.premiumsource,i.farmflag,i.vehkind,i.useporperty,i.farpolicytype \n");
        tempstring.append(" ,(select GROUP_CONCAT(p.invoiceno,',') invoiceno from mm_invply_td p where p.seqpolicy=i.seqpolicy) invoiceno  \n");
        tempstring.append(" ,(SELECT m.sap_code FROM  sap_code_mapping m WHERE m.typename = 'orgCode' and m.tmnch_code = i.departmentcode LIMIT 1) sap_code  \n");
        tempstring.append(" ,(SELECT m.codedesc FROM  sap_code_mapping m WHERE m.typename = 'orgCode' and m.tmnch_code = i.departmentcode LIMIT 1) codedesc  \n");
        tempstring.append(",(select s.subcompanyname from mm_subcompany_tc s where s.subcompany=i.subcompany) subcompanyname \n");
        tempstring.append(",(select u.unitname from mm_unit_tc u where u.unitcode=i.unitcode) unitname  \n");
        tempstring.append(",(select c.classescodename from mm_classescode_tc c where c.classescode=i.classescode) classesname  \n");

        tempstring.append(",(select d.businname from mm_dictcontent_td d where d.busintypeid='EQUALSALE' and d.businid=i.equalsale) equalsalename \n");
        tempstring.append(",(select d.businname from mm_dictcontent_td d where d.busintypeid='CUSTOMERTYPE' and d.businid=i.customertype) customertypename \n");
        tempstring.append(",(select d.businname from mm_dictcontent_td d where d.busintypeid='IFCHECK' and d.businid=i.ifagentbusiness) ifagentbusinessname \n");
        tempstring.append(",(select d.businname from mm_dictcontent_td d where d.busintypeid='BUSINESSSOURCE' and d.businid=i.businesssource) businesssourcename, t.paybktranchnl \n");

        tempstring.append(" <!-- ,(select t.paybktranchnl from t_applications t where t.APPLYNO = i.INPAYMENTNO) paybktranchnl -->");
        tempstring.append(",i.masterno, i.mastername \n");
        tempstring.append(" , i.insuredname,i.applicantnamecn,m.businname paywayname,t.payway\n");
        tempstring.append(",(select pe.OPDATE from mm_policy_events_td pe where i.SEQPOLICY = pe.NEWNO and pe.BUSINESSTWO='992' GROUP by pe.newno) opdate \n");
        tempstring.append(" FROM mm_policy_td i LEFT JOIN t_applications t ON i.inpaymentno=t.APPLYNO LEFT JOIN mm_dictcontent_td m on m.BUSINTYPEID = 'PAYWAY' \n");
        tempstring.append(" AND m.IFVALID = '1' AND substr(m.BUSINID, 1, 2) = t.PAYWAY and case when t.PAYWAY='07' then  t.PAYBKTRANCHNL=substr(m.BUSINNAME, 3) else 1=1 end  where 1=1 \n");

        System.out.println(tempstring);

    }


    @Data
    @AllArgsConstructor
    class Student{
        private String name;
        private int age;
    }
}
