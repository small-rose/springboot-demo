package com.xiaocai.demo.http;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * http工具类
 *
 * @author zuoqing
 */
public class HttpClientUtil {

    private static CloseableHttpClient httpClient;
    private static final int DEFAULT_TIMEOUT = 10_000;

    private static CloseableHttpClient getInstance() {
        if (httpClient == null) {
            synchronized (HttpClient.class) {
                if (httpClient == null) {
                    httpClient = HttpClients.custom().build();
                }
            }
        }
        return httpClient;
    }


    public static String postBody(String url, String body, int timeout, String charset) throws Exception {
        HttpEntity entity = new StringEntity(body, ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), charset));
        RequestConfig requestConfig = RequestConfig.custom().setSocketTimeout(timeout).build();

        HttpPost post = new HttpPost(url);
        post.setEntity(entity);
        post.setConfig(requestConfig);

        CloseableHttpResponse response = getInstance().execute(post);
        return EntityUtils.toString(response.getEntity());
    }

    public static String postForm(String url, Map<String, String> params) throws Exception {
        List<NameValuePair> list = new ArrayList<>();
        params.forEach((k, v) -> list.add(new BasicNameValuePair(k, v)));
        HttpEntity entity = new UrlEncodedFormEntity(list, Charset.forName("utf-8"));

        HttpPost post = new HttpPost(url);
        post.setEntity(entity);
        CloseableHttpResponse response = getInstance().execute(post);
        return EntityUtils.toString(response.getEntity());
    }

}
