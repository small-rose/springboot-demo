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
            "\n" +
            "<HEAD>\n" +
            "    <TRAN_CODE>A0</TRAN_CODE>\n" +
            "    <USER>Hx05</USER>\n" +
            "    <PASSWORD>Hx05pwd</PASSWORD>\n" +
            "</HEAD>\n" +
            "<BODY>\n" +
            "    <APP_BASE>\n" +
            "        <CHECK_CODE></CHECK_CODE>   <!--校验码-->\n" +
            "        <INSU_MIDNO></INSU_MIDNO>   <!--商户号-->\n" +
            "        <AMOUNT>32000000</AMOUNT> <!--交易金额-->\n" +
            "        <DIRECT_BANKCODE></DIRECT_BANKCODE>    <!--付款银行代码-->\n" +
            "        <DIRECT_ORDERBANKCODE></DIRECT_ORDERBANKCODE>  <!--第三方支付渠道-->\n" +
            "        <POLICYSTARTDATE>20211130000000</POLICYSTARTDATE>   <!--过期时间（起保时间）-->\n" +
            "        <REMARK></REMARK>   <!--备注（江苏实名，投保人与付款人关系为“其他”时必传）-->\n" +
            "        <OPCODE></OPCODE>   <!--操作员代码-->\n" +
            "        <OPPW></OPPW>   <!--操作员密码-->\n" +
            "        <RECOGNITIONID></RECOGNITIONID> <!--区域识别号。用于对应终端号的校验-->\n" +
            "        <PAYTYPE>1</PAYTYPE>    <!--支付类型，默认自动到账确认-->\n" +
            "        <PAYWAY>06</PAYWAY>   <!--支付方式-->\n" +
            "        <CHECKNO><![CDATA[fnd20211125009]]></CHECKNO> <!--支票号-->\n" +
            "        <CHECKSERRAL></CHECKSERRAL> <!--支票流水号-->\n" +
            "        <SUBCOMPANY>32</SUBCOMPANY>    <!--分公司代码-->\n" +
            "        <CURRENCYTYPE>CNY</CURRENCYTYPE>    <!--币种-->\n" +
            "        <PARANORMALDAY></PARANORMALDAY>\n" +
            "        <INSUREDNAME><![CDATA[莱芜德立交通设施有限公司]]></INSUREDNAME> <!--缴款人名称-->\n" +
            "        <DEPARTMENTCODE>32011001</DEPARTMENTCODE>    <!--业务归属部门-->\n" +
            "        <BANKCODE></BANKCODE><!--扣款业务时使用，客户开户行号-->\n" +
            "        <CUSTACCOUNTNAME></CUSTACCOUNTNAME><!--扣款业务时使用，客户在银行的户名-->\n" +
            "        <CUSTACCOUNTNO></CUSTACCOUNTNO><!--扣款和分期业务时使用，客户开户行账号-->\n" +
            "        <BANKNAME></BANKNAME><!--扣款业务时使用，客户开户行名称-->\n" +
            "        <CUSTBANKNO></CUSTBANKNO><!--扣款业务时使用，客户开户行代码(cnaps号联行号)-->\n" +
            "        <BANKCITY></BANKCITY><!--扣款业务时使用，客户开户行所在市-->\n" +
            "        <BANKPROVINCE></BANKPROVINCE><!--扣款业务时使用，客户开户行所在省份-->\n" +
            "        <BANKTYPE></BANKTYPE><!--扣款和分期业务时使用，客户开户行直联号-->\n" +
            "        <ISPAYPUBLIC></ISPAYPUBLIC><!--扣款业务时使用，银行指令类型-->\n" +
            "        <MOBILENUMBER></MOBILENUMBER><!--扣款业务时使用，客户的手机号-->\n" +
            "        <CARDFLAG></CARDFLAG><!--扣款业务时使用，客户账户的卡折类型-->\n" +
            "        <CERTIFICATETYPE></CERTIFICATETYPE><!--扣款业务时使用，证件类型-->\n" +
            "        <CERTIFICATENO></CERTIFICATENO><!--扣款业务时使用，证件号码-->\n" +
            "        <CUSTEMAIL></CUSTEMAIL><!--扣款业务时使用，客户电子邮箱-->\n" +
            "        <EXPIRYDATE></EXPIRYDATE><!--分期业务必传，卡片有效期-->\n" +
            "        <STAGENUM></STAGENUM><!--分期业务必传，分期期数-->\n" +
            "        <BACKURL></BACKURL><!--业务系统指定的页面通知地址-->\n" +
            "\n" +
            "        <VEHICLEOWNERNAME></VEHICLEOWNERNAME>    <!--车主名称-->\n" +
            "        <VEHICLEOWNERNATURE></VEHICLEOWNERNATURE>   <!--车主性质-->\n" +
            "        <VEHICLEOWNERIDCODE></VEHICLEOWNERIDCODE>  <!--车主证件类型-->\n" +
            "        <VEHICLEOWNERIDNO></VEHICLEOWNERIDNO>  <!--车主证件号-->\n" +
            "        <VEHICLEOWNERPHONENO></VEHICLEOWNERPHONENO>    <!--车主手机号-->\n" +
            "        <APPLICANTIDCODE></APPLICANTIDCODE>    <!--投保人证件类型-->\n" +
            "        <ISCERTIFICATE></ISCERTIFICATE>    <!--是否需认证-->\n" +
            "        <REALNAMEMODE>00</REALNAMEMODE><!-- 实名认证方式 00:无需实名认证 01:江苏模式  02:全国模式 03:深圳模式 04:上海模式 -->\n" +
            "        <APPLICANTNATURE>0</APPLICANTNATURE> <!--投保人类型-->\n" +
            "        <PAYACCOUNTNAME>莱芜德立交通设施有限公司</PAYACCOUNTNAME>   <!--付款人名称-->\n" +
            "        <RELATIONSHIPCODE></RELATIONSHIPCODE>   <!--投保人与付款人关系？？？？-->\n" +
            "    </APP_BASE>\n" +
            "    <DETAILS>\n" +
            "                <APP_INFO>\n" +
            "            <CUSTSEQ>599320104032021000003-Fcws7RsNn0LvLISoC5o</CUSTSEQ>  <!--流水号-->\n" +
            "            <APPLICANTNO>599320104032021000003</APPLICANTNO> <!--投保单号-->\n" +
            "            <POLICYNO></POLICYNO>  <!--保单号-->\n" +
            "            <ENDORSENO></ENDORSENO>   <!--批单号-->\n" +
            "            <CURRENCYTYPE>CNY</CURRENCYTYPE>  <!--币种-->\n" +
            "            <AMOUNT>17600000</AMOUNT>    <!--金额（分）-->\n" +
            "            <TRANSACTORNAME>李丙炎</TRANSACTORNAME>    <!--业务经办人-->\n" +
            "            <APPLICANTNAME>莱芜德立交通设施有限公司</APPLICANTNAME>   <!--投保人名称-->\n" +
            "            <APPLICANTCODE>ACU820210000006550</APPLICANTCODE>   <!--投保人代码-->\n" +
            "            <INSUREDNAME>莱芜德立交通设施有限公司</INSUREDNAME>     <!--被保人名称-->\n" +
            "            <INSUREDCODE>ACU820210000006550</INSUREDCODE>     <!--被保险人代码-->\n" +
            "            <STARTDATE>20211126000000</STARTDATE>   <!--起保日期-->\n" +
            "            <DATATYPE>1</DATATYPE>  <!--数据类型-->\n" +
            "            <DATASOURCE>05</DATASOURCE>    <!--数据来源-->\n" +
            "            <DEPARTMENTCODE>32011001</DEPARTMENTCODE>    <!--业务归属部门代码-->\n" +
            "            <INSTALLMENTSTIMES></INSTALLMENTSTIMES>   <!--分期缴费期次-->\n" +
            "\n" +
            "            <PROCONFIRM_SEQUENCE_NO></PROCONFIRM_SEQUENCE_NO>  <!--上海平台预确认码/江苏平台查询码-->\n" +
            "            <AMEND_QUERY_NO></AMEND_QUERY_NO>  <!--批改查询码-->\n" +
            "            <POLICYTYPE>01</POLICYTYPE>    <!--出单类型-->\n" +
            "            <CITYCODE></CITYCODE>  <!--出单归属地-->\n" +
            "            <COVERAGETYPE>3</COVERAGETYPE>  <!--险种类型-->\n" +
            "            <LICENSEPLATETYPE></LICENSEPLATETYPE>  <!--号牌种类-->\n" +
            "            <LICENSEPLATENO></LICENSEPLATENO>    <!--号牌号码-->\n" +
            "            <VIN></VIN> <!--车架号-->\n" +
            "            <ENGINENO></ENGINENO>  <!--发动机号-->\n" +
            "            <EXPIREDATE>20221125235959</EXPIREDATE>    <!--终保日期-->\n" +
            "            <CLASSESCODE>0403</CLASSESCODE><!-- 业务险种代码 -->\n" +
            "        </APP_INFO>\n" +
            "                <APP_INFO>\n" +
            "            <CUSTSEQ>599320104032021000003-CxGLOdXmKppESWvGLl8</CUSTSEQ>  <!--流水号-->\n" +
            "            <APPLICANTNO>599320104032021000003</APPLICANTNO> <!--投保单号-->\n" +
            "            <POLICYNO></POLICYNO>  <!--保单号-->\n" +
            "            <ENDORSENO></ENDORSENO>   <!--批单号-->\n" +
            "            <CURRENCYTYPE>CNY</CURRENCYTYPE>  <!--币种-->\n" +
            "            <AMOUNT>14400000</AMOUNT>    <!--金额（分）-->\n" +
            "            <TRANSACTORNAME>李丙炎</TRANSACTORNAME>    <!--业务经办人-->\n" +
            "            <APPLICANTNAME>莱芜德立交通设施有限公司</APPLICANTNAME>   <!--投保人名称-->\n" +
            "            <APPLICANTCODE>ACU820210000006550</APPLICANTCODE>   <!--投保人代码-->\n" +
            "            <INSUREDNAME>莱芜德立交通设施有限公司</INSUREDNAME>     <!--被保人名称-->\n" +
            "            <INSUREDCODE>ACU820210000006550</INSUREDCODE>     <!--被保险人代码-->\n" +
            "            <STARTDATE>20211126000000</STARTDATE>   <!--起保日期-->\n" +
            "            <DATATYPE>F</DATATYPE>  <!--数据类型-->\n" +
            "            <DATASOURCE>05</DATASOURCE>    <!--数据来源-->\n" +
            "            <DEPARTMENTCODE>32011001</DEPARTMENTCODE>    <!--业务归属部门代码-->\n" +
            "            <INSTALLMENTSTIMES></INSTALLMENTSTIMES>   <!--分期缴费期次-->\n" +
            "\n" +
            "            <PROCONFIRM_SEQUENCE_NO></PROCONFIRM_SEQUENCE_NO>  <!--上海平台预确认码/江苏平台查询码-->\n" +
            "            <AMEND_QUERY_NO></AMEND_QUERY_NO>  <!--批改查询码-->\n" +
            "            <POLICYTYPE>01</POLICYTYPE>    <!--出单类型-->\n" +
            "            <CITYCODE></CITYCODE>  <!--出单归属地-->\n" +
            "            <COVERAGETYPE>3</COVERAGETYPE>  <!--险种类型-->\n" +
            "            <LICENSEPLATETYPE></LICENSEPLATETYPE>  <!--号牌种类-->\n" +
            "            <LICENSEPLATENO></LICENSEPLATENO>    <!--号牌号码-->\n" +
            "            <VIN></VIN> <!--车架号-->\n" +
            "            <ENGINENO></ENGINENO>  <!--发动机号-->\n" +
            "            <EXPIREDATE>20221125235959</EXPIREDATE>    <!--终保日期-->\n" +
            "            <CLASSESCODE>0403</CLASSESCODE><!-- 业务险种代码 -->\n" +
            "        </APP_INFO>\n" +
            "            </DETAILS>\n" +
            "</BODY>\n" +
            "</PACKET>" ;

    public static void main(String[] args) {
        //String url = "http://192.168.50.251:9090/bp-paystation/ApplicationsServlet";

        // String url = "http://10.2.6.76:9090/bp-paystation/ApplicationsServlet";
        String url = "http://10.1.4.171:9090/bp-paystation/ApplicationsServlet";
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
