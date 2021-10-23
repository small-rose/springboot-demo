package com.xiaocai.demo.https;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.*;

import static com.sun.deploy.security.TrustDecider.timeout;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ HttpClientUtils ] 说明：无
 * @Function :  功能说明： HttpClient 封装 https  请求  和 http 请求
 * @Date ：2021/10/23 10:17
 * @Version ： 1.0
 **/
public class HttpClientUtils {

    private int timeOut = 4000;
    private String charset = "UTF-8";

    public String getCharset() {
        return charset;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public int getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(int timeOut) {
        this.timeOut = timeOut;
    }

    /**
     *  http post 请求
     * @param url
     * @param params
     * @return
     */
    public String post(String url, Hashtable<String, String> params) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = "" ;
        try {
            httpClient = HttpClients.createDefault();
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeOut)
                    .setConnectTimeout(timeOut).build();
            httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            List<NameValuePair> list = new ArrayList<>();
            params.forEach((k, v) -> list.add(new BasicNameValuePair(k, v)));
            httpPost.setEntity(new UrlEncodedFormEntity(list, charset));
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, charset);
        }catch (ClientProtocolException | UnsupportedEncodingException e){
            result = "";
        } catch (IOException e) {
            e.printStackTrace();
            result = "";
        } finally{
            try {
                if (httpPost == null) {
                    httpPost.releaseConnection();
                }
                if (httpClient == null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                result = "";
            }
        }
        return result;
    }

    /**
     *  http  get 请求
     * @param url
     * @param params
     * @return
     */
    public String get(String url, Hashtable<String, String> params) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = "" ;
        try {
            httpClient = HttpClients.createDefault();
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeOut)
                    .setConnectTimeout(timeOut).build();
            String newUrl = getParams(url, params);
            httpPost = new HttpPost(newUrl);
            httpPost.setConfig(requestConfig);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, charset);
        }catch (ClientProtocolException | UnsupportedEncodingException e){
            result = "";
        } catch (IOException e) {
            e.printStackTrace();
            result = "";
        } finally{
            try {
                if (httpPost == null) {
                    httpPost.releaseConnection();
                }
                if (httpClient == null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                result = "";
            }
        }
        return result;
    }

    /**
     * https post
     * @param url
     * @param params
     * @return
     */
    public String postSSL(String url, Hashtable<String, String> params){
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = "" ;
        try {
            httpClient = (CloseableHttpClient) sslClient();
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeOut)
                    .setConnectTimeout(timeOut).build();
            httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            List<NameValuePair> list = new ArrayList<>();
            params.forEach((k, v) -> list.add(new BasicNameValuePair(k, v)));
            httpPost.setEntity(new UrlEncodedFormEntity(list, charset));
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, charset);
        }catch (ClientProtocolException | UnsupportedEncodingException e){
            result = "";
        } catch (IOException e) {
            e.printStackTrace();
            result = "";
        } finally{
            try {
                if (httpPost == null) {
                    httpPost.releaseConnection();
                }
                if (httpClient == null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                result = "";
            }
        }
        return result;
    }


    /**
     *  https  get 请求
     * @param url
     * @param params
     * @return
     */
    public String getSSL(String url, Hashtable<String, String> params) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = "" ;
        try {
            httpClient = (CloseableHttpClient) sslClient();
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeOut)
                    .setConnectTimeout(timeOut).build();
            String newUrl = getParams(url, params);
            httpPost = new HttpPost(newUrl);
            httpPost.setConfig(requestConfig);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, charset);
        }catch (ClientProtocolException | UnsupportedEncodingException e){
            result = "";
        } catch (IOException e) {
            e.printStackTrace();
            result = "";
        } finally{
            try {
                if (httpPost == null) {
                    httpPost.releaseConnection();
                }
                if (httpClient == null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                result = "";
            }
        }
        return result;
    }


    /**
     *  http post 请求
     * @param url
     * @param params
     * @return
     */
    public String postMultipart(String url,String filePath, Hashtable<String, String> params) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = "" ;
        String fileName = "" ;

        try {
            httpClient = HttpClients.createDefault();
            RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeOut)
                    .setConnectTimeout(timeOut).build();
            httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);
            List<NameValuePair> list = new ArrayList<>();
            params.forEach((k, v) -> list.add(new BasicNameValuePair(k, v)));

            Hashtable<String, File> files = new Hashtable<>();
            fileName =  filePath + params.get("FileName");
            String content = params.get("Report");
            File file = new File(fileName);
            files.put("Report", file);
            HttpEntity entity = makeMultipartEntity(list, files);
            httpPost.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, charset);
        }catch (ClientProtocolException | UnsupportedEncodingException e){
            result = "";
        } catch (IOException e) {
            e.printStackTrace();
            result = "";
        } finally{
            try {
                if (httpPost == null) {
                    httpPost.releaseConnection();
                }
                if (httpClient == null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                result = "";
            }
        }
        return result;
    }

    /**
     * @Description 创建一个HTTPEntity对象
     * @param params
     *            :字符串的入参
     * @param files
     *            :大数据的入参
     * @return HttpClient
     */
    public  HttpEntity makeMultipartEntity(List<NameValuePair> params,   Map<String, File> files) {
        MultipartEntityBuilder builder = MultipartEntityBuilder.create();
        builder.setMode(HttpMultipartMode.BROWSER_COMPATIBLE); // 如果有SocketTimeoutException等情况，可修改这个枚举
        if (params != null && params.size() > 0) {
            for (NameValuePair p : params) {
                builder.addTextBody(p.getName(), p.getValue(),
                        ContentType.TEXT_PLAIN.withCharset("UTF-8"));
            }
        }

        if (files != null && files.size() > 0) {
            Set<Map.Entry<String, File>> entries = files.entrySet();
            for (Map.Entry<String, File> entry : entries) {
                builder.addPart(entry.getKey(), new FileBody(entry.getValue()));
            }
        }
        return builder.build();
    }


    /**
     * @Description 处理https请求的post方法（含有大数据的参数）
     * @param url
     *            :url
     * @param params
     *            :参数
     * @return 返回的字符串
     */
    public  String postMultipartSSL(String url, String filePath, Hashtable<String, String> params) {
        CloseableHttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = "";
        String fileName = "";
        try {
            httpClient = (CloseableHttpClient) sslClient();
            RequestConfig requestConfig = RequestConfig.custom()
                    .setSocketTimeout(4000).setConnectTimeout(4000).build();
            httpPost = new HttpPost(url);
            httpPost.setConfig(requestConfig);

            List<NameValuePair> ps = new ArrayList<NameValuePair>();
            for (String pKey : params.keySet()) {
                ps.add(new BasicNameValuePair(pKey, params.get(pKey)));
            }

            Hashtable<String, File> files = new Hashtable<String, File>();
            fileName = filePath + params.get("FileName") ;
            //String content = params.get("Report");
            //FileIOMethod.SaveTextFile(fileName, content, "utf-8");
            File file = new File(fileName);
            files.put("Report", file);
            HttpEntity entity = makeMultipartEntity(ps, files);
            httpPost.setEntity(entity);
            CloseableHttpResponse response = httpClient.execute(httpPost);
            HttpEntity httpEntity = response.getEntity();
            result = EntityUtils.toString(httpEntity, "utf-8");

        } catch (ClientProtocolException e) {
            result = "";
        } catch (IOException e) {
            result = "";
        } finally {
            //FileIOMethod.DelFile(fileName);
            try {
                if (httpPost != null) {
                    httpPost.releaseConnection();
                }
                if (httpClient != null) {
                    httpClient.close();
                }
            } catch (IOException e) {
                result = "";
            }
        }
        return result;
    }

    /**
     * 忽略SSL验证
     * @return
     */
    private HttpClient sslClient(){
        try {
            SSLContext context = SSLContext.getInstance("TSL");
            X509TrustManager trustManager = new X509TrustManager(){

                @Override
                public void checkClientTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                }

                @Override
                public void checkServerTrusted(X509Certificate[] x509Certificates, String s) throws CertificateException {
                }

                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            };
            context.init(null, new TrustManager[]{trustManager}, null);
            SSLConnectionSocketFactory SSLContext = new SSLConnectionSocketFactory(context, NoopHostnameVerifier.INSTANCE);

            CloseableHttpClient httpClient = HttpClients.custom().setSSLSocketFactory(SSLContext).build();
            return httpClient ;

        }catch (NoSuchAlgorithmException | KeyManagementException e){
            return HttpClients.createDefault();
        }
    }

    private String getParams(String url, Hashtable<String, String> params){
        String ps = "";
        for (String key : params.keySet()) {
            if (!"".equals(ps)){
                ps = ps + "&";
            }
            String pValue = params.get(key).replace("%","%25")
                    .replace(" ", "%20").replace("#", "%23");
            ps += key.concat("=").concat(pValue);
        }
        if (!"".equals(ps)){
            url = url.concat("?").concat(ps);
        }
        return url;
    }

}
