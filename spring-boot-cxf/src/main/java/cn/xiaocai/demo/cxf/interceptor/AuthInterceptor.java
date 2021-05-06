package cn.xiaocai.demo.cxf.interceptor;

import org.apache.cxf.binding.soap.SoapHeader;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPException;
import java.util.List;

/**
 * @program: spring-boot-cxf
 * @description   webservice 服务端认证拦截验证
 * @function:
 * @author: zzy
 * @create: 2021-05-06 10:21
 **/
public class AuthInterceptor extends AbstractPhaseInterceptor<SoapMessage> {

    private String USERNAME;
    private String PASSWORD;

    public AuthInterceptor(String username, String password) {
        // 定义在什么阶段进行拦截
        super(Phase.PRE_PROTOCOL);
        this.USERNAME = username;
        this.PASSWORD = password;
    }


    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        String username = null;
        String password = null;
        List<Header> headers = soapMessage.getHeaders();
        if(headers == null) {
            throw new Fault(new IllegalArgumentException("headers未取到，无法验证用户信息"));
        }
        // 获取客户端传递的用户名和密码
        for (Header header : headers) {
            SoapHeader soapHeader = (SoapHeader) header;
            Element e = (Element) soapHeader.getObject();
            NodeList usernameNode = e.getElementsByTagName("username");
            NodeList passwordNode = e.getElementsByTagName("password");
            username = usernameNode.item(0).getTextContent();
            password = passwordNode.item(0).getTextContent();
            if(StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
                throw new Fault(new IllegalArgumentException("用户信息为空！"));
            }
        }
        // 校验客户端用户名密码是否和服务端一致
        if(!(username.equals(USERNAME) && password.equals(PASSWORD))) {
            throw new Fault(new SOAPException("用户信息认证失败！"));
        }
    }
}
