package com.xiaocai.demo.client;

import com.xiaocai.demo.http.HttpClientUtil;
import org.junit.Test;

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
public class PostApplication_ChinaPay {

    public static String requestMessage = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
            "<PACKET TYPE=\"REQUEST\">\n" +
            "\n" +
            "<HEAD>\n" +
            "    <TRAN_CODE>A0</TRAN_CODE>\n" +
            "    <USER>Hx04</USER>\n" +
            "    <PASSWORD>Hx04pwd</PASSWORD>\n" +
            "</HEAD>\n" +
            "<BODY>\n" +
            "    <APP_BASE>\n" +
            "        <CHECK_CODE></CHECK_CODE>   <!--校验码-->\n" +
            "        <INSU_MIDNO></INSU_MIDNO>   <!--商户号-->\n" +
            "        <AMOUNT>388344</AMOUNT> <!--交易金额-->\n" +
            "        <DIRECT_BANKCODE></DIRECT_BANKCODE>    <!--付款银行代码-->\n" +
            "        <DIRECT_ORDERBANKCODE>CHINAPAY</DIRECT_ORDERBANKCODE>  <!--第三方支付渠道-->\n" +
            "        <REMARK></REMARK>   <!--备注（江苏实名，投保人与付款人关系为“其他”时必传）-->\n" +
            "        <OPCODE></OPCODE>   <!--操作员代码-->\n" +
            "        <OPPW></OPPW>   <!--操作员密码-->\n" +
            "        <RECOGNITIONID></RECOGNITIONID> <!--区域识别号。用于对应终端号的校验-->\n" +
            "        <PAYTYPE>2</PAYTYPE>    <!--支付类型，默认自动到账确认-->\n" +
            "        <PAYWAY>02</PAYWAY>   <!--支付方式-->\n" +
            "        <CHECKNO><![CDATA[]]></CHECKNO> <!--支票号-->\n" +
            "        <CHECKSERRAL></CHECKSERRAL> <!--支票流水号-->\n" +
            "        <POLICYSTARTDATE>20220107230000</POLICYSTARTDATE>   <!--过期时间（起保时间）-->\n" +
            "        <SUBCOMPANY>37</SUBCOMPANY>    <!--分公司代码-->\n" +
            "        <CURRENCYTYPE>CNY</CURRENCYTYPE>    <!--币种-->\n" +
            "        <PARANORMALDAY></PARANORMALDAY>\n" +
            "        <INSUREDNAME><![CDATA[冯超]]></INSUREDNAME> <!--缴款人名称-->\n" +
            "        <DEPARTMENTCODE>37010701</DEPARTMENTCODE>    <!--业务归属部门-->\n" +
            "        <BANKCODE></BANKCODE>\n" +
            "        <CUSTACCOUNTNAME></CUSTACCOUNTNAME>\n" +
            "        <CUSTACCOUNTNO></CUSTACCOUNTNO>\n" +
            "        <BANKNAME></BANKNAME>\n" +
            "        <CUSTBANKNO></CUSTBANKNO>\n" +
            "        <BANKCITY></BANKCITY>\n" +
            "        <BANKPROVINCE></BANKPROVINCE>\n" +
            "        <BANKTYPE></BANKTYPE>\n" +
            "        <ISPAYPUBLIC></ISPAYPUBLIC>\n" +
            "        <MOBILENUMBER>18995557653</MOBILENUMBER>\n" +
            "        <CARDFLAG></CARDFLAG>\n" +
            "        <CERTIFICATETYPE></CERTIFICATETYPE>\n" +
            "        <CERTIFICATENO>371523199105233773</CERTIFICATENO><!-- 扣款业务时使用，证件号码（江苏/深圳/全国实名投保人证件号码字段必传） -->\n" +
            "        <CUSTEMAIL></CUSTEMAIL>\n" +
            "        <EXPIRYDATE></EXPIRYDATE>\n" +
            "        <STAGENUM></STAGENUM>\n" +
            "        <BACKURL></BACKURL>\n" +
            "\n" +
            "        <VEHICLEOWNERNAME>冯超</VEHICLEOWNERNAME>    <!--车主名称-->\n" +
            "        <VEHICLEOWNERNATURE>1</VEHICLEOWNERNATURE>   <!--车主性质-->\n" +
            "        <VEHICLEOWNERIDCODE>01</VEHICLEOWNERIDCODE>  <!--车主证件类型-->\n" +
            "        <VEHICLEOWNERIDNO>371523199105233773</VEHICLEOWNERIDNO>  <!--车主证件号-->\n" +
            "        <VEHICLEOWNERPHONENO>18995557653</VEHICLEOWNERPHONENO>    <!--车主手机号-->\n" +
            "        <APPLICANTIDCODE>01</APPLICANTIDCODE>    <!--投保人证件类型-->\n" +
            "        <ISCERTIFICATE></ISCERTIFICATE>    <!--是否需认证-->\n" +
            "        <REALNAMEMODE>02</REALNAMEMODE><!-- 实名认证方式 00:无需实名认证 01:江苏模式  02:全国模式 03:深圳模式 04:上海模式 -->\n" +
            "        <APPLICANTNATURE>1</APPLICANTNATURE> <!--投保人类型-->\n" +
            "        <PAYACCOUNTNAME>冯超</PAYACCOUNTNAME>   <!--付款人名称-->\n" +
            "        <RELATIONSHIPCODE></RELATIONSHIPCODE>   <!--投保人与付款人关系-->\n" +
            "        <APPLICANTFLAG></APPLICANTFLAG><!-- 投保人是否为经营者本人 -->\n" +
            "        <INSUREQUERYSTATUS></INSUREQUERYSTATUS><!-- 签约状态 0 已签约，1 未签约（上海实名必传） -->\n" +
            "    </APP_BASE>\n" +
            "    <DETAILS>\n" +
            "                <APP_INFO>\n" +
            "            <CUSTSEQ>599370103662021001207-6Q8qkpIenvwMFAie2yZ</CUSTSEQ>  <!--流水号-->\n" +
            "            <APPLICANTNO>599370103662021001207</APPLICANTNO> <!--投保单号-->\n" +
            "            <POLICYNO></POLICYNO>  <!--保单号-->\n" +
            "            <ENDORSENO></ENDORSENO>   <!--批单号-->\n" +
            "            <CURRENCYTYPE>CNY</CURRENCYTYPE>  <!--币种-->\n" +
            "            <AMOUNT>388344</AMOUNT>    <!--金额（分）-->\n" +
            "            <TRANSACTORNAME>侯延冰</TRANSACTORNAME>    <!--业务经办人-->\n" +
            "            <APPLICANTNAME>冯超</APPLICANTNAME>   <!--投保人名称-->\n" +
            "            <APPLICANTCODE>ACI820210000007524</APPLICANTCODE>   <!--投保人代码-->\n" +
            "            <INSUREDNAME>冯超</INSUREDNAME>     <!--被保人名称-->\n" +
            "            <INSUREDCODE>ACI820210000007524</INSUREDCODE>     <!--被保险人代码-->\n" +
            "            <STARTDATE>20211210000000</STARTDATE>   <!--起保日期-->\n" +
            "            <DATATYPE>1</DATATYPE>  <!--数据类型-->\n" +
            "            <DATASOURCE>04</DATASOURCE>    <!--数据来源-->\n" +
            "            <DEPARTMENTCODE>37010701</DEPARTMENTCODE>    <!--业务归属部门代码-->\n" +
            "            <INSTALLMENTSTIMES></INSTALLMENTSTIMES>   <!--分期缴费期次-->\n" +
            "\n" +
            "            <PROCONFIRM_SEQUENCE_NO>V0101ACIC370021121008859216819</PROCONFIRM_SEQUENCE_NO>  <!--上海平台预确认码/江苏平台查询码-->\n" +
            "            <AMEND_QUERY_NO></AMEND_QUERY_NO>  <!--批改查询码-->\n" +
            "            <POLICYTYPE>01</POLICYTYPE>    <!--出单类型-->\n" +
            "            <CITYCODE></CITYCODE>  <!--出单归属地-->\n" +
            "            <COVERAGETYPE>2</COVERAGETYPE>  <!--险种类型-->\n" +
            "            <LICENSEPLATETYPE></LICENSEPLATETYPE>  <!--号牌种类-->\n" +
            "            <LICENSEPLATENO>*</LICENSEPLATENO>    <!--号牌号码-->\n" +
            "            <VIN>LMN35784375837485</VIN> <!--车架号-->\n" +
            "            <ENGINENO>3452345</ENGINENO>  <!--发动机号-->\n" +
            "            <EXPIREDATE>20221209235959</EXPIREDATE>    <!--终保日期-->\n" +
            "            <CLASSESCODE>0366</CLASSESCODE><!-- 业务险种代码 -->\n" +
            "        </APP_INFO>\n" +
            "            </DETAILS>\n" +
            "</BODY>\n" +
            "</PACKET>" ;

    @Test
    public  void PostApplication_ChinaPay() {
//        String url = "http://192.168.50.254:9090/bp-paystation/ApplicationsServlet";

        String url = "http://10.2.6.76:9090/bp-paystation/ApplicationsServlet";
//        String url = "http://10.1.4.171:9090/bp-paystation/ApplicationsServlet";
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
