package cn.xiaocai.js.data.uitl;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.util.StringUtils;

import javax.net.ssl.*;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/**
 * @program: springboot-jsoup
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-06 14:31
 **/
@Slf4j
public class NetUtil {

    /**
     * html
     * @param url
     * @return
     * @throws IOException
     */
    public static Document getDocument(String url) {
        return getDocument(url, "");
    }

    /**
     * html
     * @param url
     * @return
     * @throws IOException
     */
    public static Document getDocument(String url, String referer) {
        Document doc = null;
        try{
            //System.out.println("get : url : "+url);
            trustEveryone();
            log.info("url-----" + url);
            if (StringUtils.hasText(referer)){
                doc = Jsoup.connect(url).timeout(15000).userAgent(ConstantUtils.getAgent()).get();
            }else {
                doc = Jsoup.connect(url).timeout(15000).userAgent(ConstantUtils.getAgent()).referrer(referer).get();
            }
            return doc;
        }catch (HttpStatusException e) {
            // TODO: handle exception
            int code = e.getStatusCode();
            if(code ==404){
                return doc;
            }
        }catch (SocketTimeoutException e) {
            // TODO: handle exception
            try {
                if (StringUtils.hasText(referer)){
                    doc = Jsoup.connect(url).timeout(15000).userAgent(ConstantUtils.getAgent()).get();
                }else {
                    doc = Jsoup.connect(url).timeout(15000).userAgent(ConstantUtils.getAgent()).referrer(referer).get();
                }
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return doc;
        }
        catch (UnknownHostException e) {
            // TODO: handle exception
            try {
                TimeUnit.SECONDS.sleep(1);
                if (StringUtils.hasText(referer)){
                    doc = Jsoup.connect(url).timeout(15000).userAgent(ConstantUtils.getAgent()).get();
                }else {
                    doc = Jsoup.connect(url).timeout(15000).userAgent(ConstantUtils.getAgent()).referrer(referer).get();
                }
            } catch (IOException | InterruptedException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return doc;
        }
        catch(IOException e){
            System.out.println("IOException : url : "+url);
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return doc;
    }

    /**
     *html
     *
     * @param url
     * @return
     * @throws IOException
     */
    public static Document getDocumentPostSSL(String url) throws IOException {
        trustEveryone();
        Document doc = (Document) Jsoup.connect(url).timeout(10000).userAgent(ConstantUtils.getAgent()).post();
        return doc;
    }

    public static void trustEveryone() {
        SSLContext context = null ;
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

             context = SSLContext.getInstance("TLS");
            SSLContext ssl = SSLContext.getInstance("SSL");
            context.init(null, new X509TrustManager[] { new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            } }, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
            //HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
     }

    public static SSLContext trustSSL() {
        SSLContext context = null ;
        try {
            HttpsURLConnection.setDefaultHostnameVerifier(new HostnameVerifier() {
                @Override
                public boolean verify(String hostname, SSLSession session) {
                    return true;
                }
            });

            //context = SSLContext.getInstance("TLS");
            context = SSLContext.getInstance("SSL");
            context.init(null, new X509TrustManager[] { new X509TrustManager() {
                @Override
                public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            } }, new SecureRandom());
            //HttpsURLConnection.setDefaultSSLSocketFactory(context.getSocketFactory());
            //HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return  context ;
    }
}
