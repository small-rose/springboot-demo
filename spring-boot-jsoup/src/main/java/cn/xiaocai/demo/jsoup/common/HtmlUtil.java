package cn.xiaocai.demo.jsoup.common;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-07 16:37
 **/
public class HtmlUtil {


    private BrowserVersion browserVersion = BrowserVersion.CHROME;;

    private long javaScriptTimeOut = 30000;

    public HtmlUtil(){
    }

    public HtmlUtil(long javaScriptTimeOut) {
        this.javaScriptTimeOut = javaScriptTimeOut;
    }

    public HtmlUtil(BrowserVersion browserVersion, long javaScriptTimeOut) {
        this.browserVersion = browserVersion;
        this.javaScriptTimeOut = javaScriptTimeOut;
    }

    public String getHtml(String url){
        //新建一个模拟谷歌Chrome浏览器的浏览器客户端对象
        final WebClient webClient = new WebClient(browserVersion);

        //当JS执行出错的时候是否抛出异常, 这里选择不需要
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        //当HTTP的状态非200时是否抛出异常, 这里选择不需要
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setActiveXNative(false);
        //是否启用CSS, 因为不需要展现页面, 所以不需要启用
        webClient.getOptions().setCssEnabled(false);

        //很重要，启用JS
        webClient.getOptions().setJavaScriptEnabled(true);
        //很重要，设置支持AJAX
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());

        HtmlPage page = null;
        try {
            //尝试加载上面图片例子给出的网页
            page = webClient.getPage(url);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            webClient.close();
        }
        //异步JS执行需要耗时,所以这里线程要阻塞30秒,等待异步JS执行结束
        webClient.waitForBackgroundJavaScript(javaScriptTimeOut);

        //直接将加载完成的页面转换成xml格式的字符串
        String pageXml = page.asXml();

        return pageXml ;
    }
}
