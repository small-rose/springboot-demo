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
        StringBuilder sql = new StringBuilder();
        sql.append(" select pyt.payableno,\n");
        sql.append(" pyt.policyno,\n");
        sql.append(" pyt.endorseno,\n");
        sql.append(" pyt.departmentcode,\n");
        sql.append(" (select dpt.departmentname from mm_department_tc dpt where dpt.departmentcode = pyt.departmentcode) as departmentname,\n");
        sql.append(" pyt.subcompany,\n");
        sql.append(" (select sub.subcompanyname from mm_subcompany_tc sub where sub.subcompany = pyt.subcompany) as subcompanyname,\n");
        sql.append(" pyt.currencycode,\n");
        sql.append(" (select cur.currencyname from mm_currencycode_tc cur where cur.currencycode = pyt.currencycode) as currencyname,\n");
        sql.append(" pyt.amount,\n");
        sql.append(" pyt.classescode,\n");
        sql.append(" (select cla.classescodename from mm_classescode_tc cla where cla.classescode = pyt.classescode) as classescodename,\n");
        sql.append(" pyt.customercode,\n");
        sql.append(" pyt.customername,\n");
        sql.append(" pyt.insuredname,\n");
        sql.append(" pyt.applicantnamecn,\n");
        sql.append(" (select ut.unitname from mm_unit_tc ut where ut.unitcode = pyt.unitcode) as unitcodename,pyt.taxesamount,mt.signdate,mt.startdate \n");
        sql.append(" from mm_payablemoney_td pyt \n");
        sql.append(" inner join mm_policy_td mt on mt.SEQPOLICY = pyt.FATHERNO \n");
        sql.append(" where pyt.CONFIRMAMOUNT = 0 and pyt.datatype in ('107', '131') and pyt.opstatus in ('0','1') and pyt.confirmstatus ='1' \n");
        //批单未开票
        sql.append(" and not exists (select 1 from mm_invply_td ip where ip.policyno = pyt.policyno and ip.endorseno = pyt.endorseno and ip.opstatus in( '0','1','2','9')) ");
        sql.append(" <!-- 原保单已开票 -->");
        sql.append(" <!--  and exists ");
        sql.append(" (select 1 from mm_invply_td a inner join mm_invoice_td m on m.seqinvoice = a.seqinvoice \n");
        sql.append("where a.policyno = pyt.policyno and a.endorseno in ('无', '000') and m.kplx in ('004','026','007') and m.opstatus ='0' ) \n --> ");
        //modify by sj 2020-04-21 处理保单发票对照表历史数据，保单号可能存的是主保单号
        sql.append(" and exists \n");
        sql.append(" (select 1 ");
        sql.append(" from mm_invply_td a \n");
        sql.append(" inner join mm_invoice_td m \n");
        sql.append(" on m.seqinvoice = a.seqinvoice \n");
        sql.append(" where (a.policyno = pyt.policyno or a.policyno = pyt.mainpolicyno) \n");
        sql.append(" and a.endorseno in ('无', '000') \n");
        sql.append(" and m.kplx in ('004', '026', '007') \n");
        sql.append(" and a.opstatus in('0','1','2')) \n");
        System.out.println(sql);

    }


    @Data
    @AllArgsConstructor
    class Student{
        private String name;
        private int age;
    }
}
