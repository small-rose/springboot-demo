package com.xiaocai.demo.client;

import com.xiaocai.demo.http.HttpClientUtil;
import org.apache.http.client.utils.HttpClientUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : small-rose/zhangxiaocai
 * @Description : [ PostApplication ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/9/9 16:05
 * @Version ： 1.0
 **/
public class PostApplication {

    public static String requestMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<PACKET TYPE=\"REQUEST\">\n" +
            "<HEAD>\n" +
            "    <TRAN_CODE>A0</TRAN_CODE>\n" +
            "    <USER>Hx04</USER>\n" +
            "    <PASSWORD>Hx04pwd</PASSWORD>\n" +
            "</HEAD>\n" +
            "<BODY>\n" +
            "    <APP_BASE>\n" +
            "        <CHECK_CODE>999</CHECK_CODE>   <!--校验码-->\n" +
            "        <INSU_MIDNO>999</INSU_MIDNO>   <!--商户号-->\n" +
            "        <AMOUNT>1</AMOUNT> <!--交易金额-->\n" +
            "        <DIRECT_BANKCODE></DIRECT_BANKCODE>    <!--付款银行代码-->\n" +
            "        <DIRECT_ORDERBANKCODE></DIRECT_ORDERBANKCODE>  <!--第三方支付渠道-->\n" +
            "        <REMARK></REMARK>   <!--备注（江苏实名，投保人与付款人关系为“其他”时必传）-->\n" +
            "        <OPCODE></OPCODE>   <!--操作员代码-->\n" +
            "        <OPPW></OPPW>   <!--操作员密码-->\n" +
            "        <RECOGNITIONID></RECOGNITIONID> <!--区域识别号。用于对应终端号的校验-->\n" +
            "        <PAYTYPE>2</PAYTYPE>    <!--支付类型，默认自动到账确认-->\n" +
            "        <PAYWAY>07</PAYWAY>   <!--支付方式-->\n" +
            "        <CHECKNO><![CDATA[11111aaa]]></CHECKNO> <!--支票号-->\n" +
            "        <CHECKSERRAL></CHECKSERRAL> <!--支票流水号-->\n" +
            "        <POLICYSTARTDATE>20210930000000</POLICYSTARTDATE>   <!--过期时间（起保时间）-->\n" +
            "        <SUBCOMPANY>50</SUBCOMPANY>    <!--分公司代码-->\n" +
            "        <CURRENCYTYPE>CNY</CURRENCYTYPE>    <!--币种-->\n" +
            "        <PARANORMALDAY></PARANORMALDAY>\n" +
            "        <INSUREDNAME><![CDATA[重庆市楷晟建材有限公司]]></INSUREDNAME> <!--缴款人名称-->\n" +
            "        <DEPARTMENTCODE>50010901</DEPARTMENTCODE>    <!--业务归属部门-->\n" +
            "        <BANKCODE></BANKCODE>\n" +
            "        <CUSTACCOUNTNAME></CUSTACCOUNTNAME>\n" +
            "        <CUSTACCOUNTNO></CUSTACCOUNTNO>\n" +
            "        <BANKNAME></BANKNAME>\n" +
            "        <CUSTBANKNO></CUSTBANKNO>\n" +
            "        <BANKCITY></BANKCITY>\n" +
            "        <BANKPROVINCE></BANKPROVINCE>\n" +
            "        <BANKTYPE></BANKTYPE>\n" +
            "        <ISPAYPUBLIC></ISPAYPUBLIC>\n" +
            "        <MOBILENUMBER></MOBILENUMBER>\n" +
            "        <CARDFLAG></CARDFLAG>\n" +
            "        <CERTIFICATETYPE></CERTIFICATETYPE>\n" +
            "        <CERTIFICATENO></CERTIFICATENO>\n" +
            "        <CUSTEMAIL></CUSTEMAIL>\n" +
            "        <EXPIRYDATE></EXPIRYDATE>\n" +
            "        <STAGENUM></STAGENUM>\n" +
            "        <BACKURL></BACKURL>\n" +
            "        <VEHICLEOWNERNAME>重庆市楷晟建材有限公司</VEHICLEOWNERNAME>    <!--车主名称-->\n" +
            "        <VEHICLEOWNERNATURE>3</VEHICLEOWNERNATURE>   <!--车主性质-->\n" +
            "        <VEHICLEOWNERIDCODE>71</VEHICLEOWNERIDCODE>  <!--车主证件类型-->\n" +
            "        <VEHICLEOWNERIDNO>91500228MA5YQ2U05J</VEHICLEOWNERIDNO>  <!--车主证件号-->\n" +
            "        <VEHICLEOWNERPHONENO>18596869685</VEHICLEOWNERPHONENO>    <!--车主手机号-->\n" +
            "        <APPLICANTIDCODE>71</APPLICANTIDCODE>    <!--投保人证件类型-->\n" +
            "        <ISCERTIFICATE>0</ISCERTIFICATE>    <!--是否需认证-->\n" +
            "        <APPLICANTNATURE>3</APPLICANTNATURE> <!--投保人类型-->\n" +
            "        <PAYACCOUNTNAME>重庆市楷晟建材有限公司</PAYACCOUNTNAME>   <!--付款人名称-->\n" +
            "        <RELATIONSHIPCODE></RELATIONSHIPCODE>   <!--投保人与付款人关系？？？？-->\n" +
            "    </APP_BASE>\n" +
            "    <DETAILS>\n" +
            "                <APP_INFO>\n" +
            "            <CUSTSEQ>599500103602021001076-00001</CUSTSEQ>  <!--流水号-->\n" +
            "            <APPLICANTNO>5995001036020210000001</APPLICANTNO> <!--投保单号-->\n" +
            "            <POLICYNO>111</POLICYNO>  <!--保单号-->\n" +
            "            <ENDORSENO></ENDORSENO>   <!--批单号-->\n" +
            "            <CURRENCYTYPE>CNY</CURRENCYTYPE>  <!--币种-->\n" +
            "            <AMOUNT>1</AMOUNT>    <!--金额（分）-->\n" +
            "            <TRANSACTORNAME>测试业务</TRANSACTORNAME>    <!--业务经办人-->\n" +
            "            <APPLICANTNAME>重庆市楷晟建材有限公司</APPLICANTNAME>   <!--投保人名称-->\n" +
            "            <APPLICANTCODE>ACU820210000000591</APPLICANTCODE>   <!--投保人代码-->\n" +
            "            <INSUREDNAME>重庆市楷晟建材有限公司</INSUREDNAME>     <!--被保人名称-->\n" +
            "            <INSUREDCODE>ACU820210000000591</INSUREDCODE>     <!--被保险人代码-->\n" +
            "            <STARTDATE>20210930000000</STARTDATE>   <!--起保日期-->\n" +
            "            <DATATYPE>1</DATATYPE>  <!--数据类型-->\n" +
            "            <DATASOURCE>11</DATASOURCE>    <!--数据来源-->\n" +
            "            <DEPARTMENTCODE>50010901</DEPARTMENTCODE>    <!--业务归属部门代码-->\n" +
            "            <INSTALLMENTSTIMES></INSTALLMENTSTIMES>   <!--分期缴费期次-->\n" +
            "            <PROCONFIRM_SEQUENCE_NO>01ACIC500021090931170971871613</PROCONFIRM_SEQUENCE_NO>  <!--上海平台预确认码/江苏平台查询码-->\n" +
            "            <AMEND_QUERY_NO></AMEND_QUERY_NO>  <!--批改查询码-->\n" +
            "            <POLICYTYPE>01</POLICYTYPE>    <!--出单类型-->\n" +
            "            <CITYCODE></CITYCODE>  <!--出单归属地-->\n" +
            "            <COVERAGETYPE>1</COVERAGETYPE>  <!--险种类型-->\n" +
            "            <LICENSEPLATETYPE></LICENSEPLATETYPE>  <!--号牌种类-->\n" +
            "            <LICENSEPLATENO>*</LICENSEPLATENO>    <!--号牌号码-->\n" +
            "            <VIN>LBSXBD1H035642342</VIN> <!--车架号-->\n" +
            "            <ENGINENO>23424</ENGINENO>  <!--发动机号-->\n" +
            "            <EXPIREDATE>20220929235959</EXPIREDATE>    <!--终保日期-->\n" +
            "        </APP_INFO>\n" +
            "                <APP_INFO>\n" +
            "            <CUSTSEQ>599500103602021001076-7YUcGRHPg7M4XhjWOTA</CUSTSEQ>  <!--流水号-->\n" +
            "            <APPLICANTNO>599500103602021001076</APPLICANTNO> <!--投保单号-->\n" +
            "            <POLICYNO></POLICYNO>  <!--保单号-->\n" +
            "            <ENDORSENO></ENDORSENO>   <!--批单号-->\n" +
            "            <CURRENCYTYPE>CNY</CURRENCYTYPE>  <!--币种-->\n" +
            "            <AMOUNT>0</AMOUNT>    <!--金额（分）-->\n" +
            "            <TRANSACTORNAME>测试业务</TRANSACTORNAME>    <!--业务经办人-->\n" +
            "            <APPLICANTNAME>重庆市楷晟建材有限公司</APPLICANTNAME>   <!--投保人名称-->\n" +
            "            <APPLICANTCODE>ACU820210000000591</APPLICANTCODE>   <!--投保人代码-->\n" +
            "            <INSUREDNAME>重庆市楷晟建材有限公司</INSUREDNAME>     <!--被保人名称-->\n" +
            "            <INSUREDCODE>ACU820210000000591</INSUREDCODE>     <!--被保险人代码-->\n" +
            "            <STARTDATE>20210930000000</STARTDATE>   <!--起保日期-->\n" +
            "            <DATATYPE>4</DATATYPE>  <!--数据类型-->\n" +
            "            <DATASOURCE>11</DATASOURCE>    <!--数据来源-->\n" +
            "            <DEPARTMENTCODE>50010901</DEPARTMENTCODE>    <!--业务归属部门代码-->\n" +
            "            <INSTALLMENTSTIMES></INSTALLMENTSTIMES>   <!--分期缴费期次-->\n" +
            "            <PROCONFIRM_SEQUENCE_NO>01ACIC500021090931170971871613</PROCONFIRM_SEQUENCE_NO>  <!--上海平台预确认码/江苏平台查询码-->\n" +
            "            <AMEND_QUERY_NO></AMEND_QUERY_NO>  <!--批改查询码-->\n" +
            "            <POLICYTYPE>01</POLICYTYPE>    <!--出单类型-->\n" +
            "            <CITYCODE></CITYCODE>  <!--出单归属地-->\n" +
            "            <COVERAGETYPE>1</COVERAGETYPE>  <!--险种类型-->\n" +
            "            <LICENSEPLATETYPE></LICENSEPLATETYPE>  <!--号牌种类-->\n" +
            "            <LICENSEPLATENO>*</LICENSEPLATENO>    <!--号牌号码-->\n" +
            "            <VIN>LBSXBD1H035642342</VIN> <!--车架号-->\n" +
            "            <ENGINENO>23424</ENGINENO>  <!--发动机号-->\n" +
            "            <EXPIREDATE>20220929235959</EXPIREDATE>    <!--终保日期-->\n" +
            "        </APP_INFO>\n" +
            "            </DETAILS>\n" +
            "</BODY>\n" +
            "</PACKET>" ;

    public static void main(String[] args) {
        String url = "http://10.2.6.76:9090/bp-paystation/ApplicationsServlet";
        // 调收付 接口
        Map<String, String> params = new HashMap<>(2);
        params.put("param1", "postApplication");
        params.put("param2", requestMessage);

        String returnMessage = null;
        try {
            returnMessage = HttpClientUtil.postForm(url, params);
        } catch (Exception e) {
            //logger.error("调用接出错了！系统:"+dataSource+" 的URL是[ "+url+" ] ");
            e.printStackTrace();
        }
        System.out.println(returnMessage);
    }
}
