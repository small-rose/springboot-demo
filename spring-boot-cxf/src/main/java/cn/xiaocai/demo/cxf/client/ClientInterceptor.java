package cn.xiaocai.demo.cxf.client;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.phase.AbstractPhaseInterceptor;

import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;

import org.apache.cxf.phase.Phase;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;
/**
 * @program: spring-boot-cxf-client
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 10:28
 **/
public class ClientInterceptor  extends AbstractPhaseInterceptor<SoapMessage> {
    private String username;
    private String password;

    public ClientInterceptor(String username, String password) {
        // 发送请求之前进行拦截
        super(Phase.PREPARE_SEND);
        this.username = username;
        this.password = password;
    }

    @Override
    public void handleMessage(SoapMessage soapMessage) throws Fault {
        List<Header> headers = soapMessage.getHeaders();
        Document doc = DOMUtils.createDocument();
        Element auth = doc.createElement("authrity");
        Element username = doc.createElement("username");
        Element password = doc.createElement("password");
        username.setTextContent(this.username);
        password.setTextContent(this.password);
        auth.appendChild(username);
        auth.appendChild(password);
        headers.add(0, new Header(new QName("tiamaes"), auth));
    }
}
