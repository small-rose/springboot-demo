package cn.xiaocai.demo.jsoup.web.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import cn.xiaocai.demo.jsoup.spider.utils.NetUtil;
import cn.xiaocai.demo.jsoup.web.model.TbWebLink;
import cn.xiaocai.demo.jsoup.web.model.TbWebPage;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * 根据 TbWebPage 取 TbWebLink
 */
public class FetchPageLinkUtil {

	private static List<String> hisurl = new ArrayList<String>();
	private static List<String> linkList = new ArrayList<String>();
	
	//Test start
	static String TestUrl = "http://www.mmkao.org/NAKED-ART/";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TbWebPage page= new TbWebPage();
		page.setLinkTag("body a");
		page.setLinkTagAttr("abs:href");
		page.setLinkKeys("article/index");
//		analsysPageForLinks(TestUrl,category);
		for(String hurl : linkList){
			System.out.println(" hurl-->"+hurl);
		}
		page.setPageHref("http://djc027.com/html/part/index55-2.html");
		List<TbWebLink> result = analsysPageForLinks(page);
		for(TbWebLink tmp : result){
			System.out.println("-->"+tmp);
		}
		hisurl.clear();
		linkList.clear();
	}
	//Test end
	
	/**
	 * 抓取网站某个分类页面所以的分页列表链接
	 * @param pageBase
	 * @return
	 */
	public static List<TbWebLink> analsysPageForLinks(TbWebPage pageBase){
		List<TbWebLink> list = new ArrayList<TbWebLink>();
		analsysLinks(pageBase.getPageHref(),pageBase);
		TbWebLink weblink = null ;
		String linkUrls = null;
		String[] urls = null;
		List<String> tmplist = new ArrayList<>();
		for(String link : linkList){
			urls = link.split(",");
			if(urls[0].endsWith(".html")){
				tmplist.add(link);
			}
		}
		urls = null;
		for(int k = 0; k < tmplist.size(); k ++){
			linkUrls = tmplist.get(k);
			urls = linkUrls.split(",");
			
			weblink = new TbWebLink();
 			weblink.setAddTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			weblink.setCategoryId(pageBase.getCategoryId());
			weblink.setPageId(pageBase.getPageId());
			weblink.setLinkHref(urls[0]);
			weblink.setLinkName(urls[1]);
			weblink.setLinkNo((long) (k+1));
			weblink.setLinkMark(ConstantHelp.Mark_nostatus_0);
			list.add(weblink);
		}
		hisurl.clear();
		linkList.clear();
		return list;
	}
	
	/**
	 * 递归获取某一分页的列表中的详细全部链接
	 * @param url
	 * @param category
	 */
	private static void analsysLinks(String url,TbWebPage category){
		System.out.println("page url :"+url);
		if(hisurl.contains(url)){
			return;
		}
		Document doc = NetUtil.getDocument(url);
		if(doc==null){
			System.out.println("doc is null "+url);
			return;
		}
		hisurl.add(url);
		//System.out.println("FetchPageLinkUtil.analsysLinks hisurl :"+hisurl.size());
		String tag = category.getLinkTag();
		String attr = category.getLinkTagAttr();
		String linkcontent = category.getLinkKeys();
		System.out.println(" tag :"+tag+", attr"+attr+",linkcontent "+linkcontent);
		Elements elemens = doc.select(tag);
		//System.out.println(" elemens:"+elemens);
		for(Element e : elemens){
			
			String link = e.attr(attr);
			String linkName = e.text();
			if(link.equals(url)){
				continue;
			}
			if(!link.contains(linkcontent)){
				continue;
			}
			if(ConstanLinkKeys.PAGE_INFO.contains(linkName)){
				continue;
			}
			System.out.println("图片页面链接："+ link  );
			
			if(!linkList.contains((link+","+e.text()))){
				linkList.add(link+","+e.text());
			}
			//只拿当前页面的内容列表，无需迭代
			//analsysLinks(link,category);
		}
	}

}
