package cn.xiaocai.demo.jsoup.web.utils;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import cn.xiaocai.demo.jsoup.spider.utils.DownPicUtil;
import cn.xiaocai.demo.jsoup.spider.utils.NetUtil;
import cn.xiaocai.demo.jsoup.spider.utils.RegexUtil;
import cn.xiaocai.demo.jsoup.web.model.TbWebLink;
import cn.xiaocai.demo.jsoup.web.model.TbWebPicture;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.StringUtils;

/**
 * 根据 TbWebLink 取 TbWebPicture
 */
public class FetchLinkPicsUtil {

	private static List<String> hisurl = new ArrayList<String>();
	private static List<String> picList = new ArrayList<String>();
	
	//Test start
	static String TestUrl = "http://www.mmkao.org/NAKED-ART/";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TbWebLink linkBase= new TbWebLink();
	
		for(String hurl : picList){
			System.out.println(" hurl-->"+hurl);
		}
		linkBase.setLinkHref("http://djc027.com/html/article/index10712.html");
		List<TbWebPicture> result = analsysHtmlForPics(linkBase);
		for(TbWebPicture tmp : result){
			System.out.println("-->"+tmp);
		}
		
		
	}
	//Test end
	
	/**
	 * 抓取网站某个分类页面所以的分页列表链接
	 * @param linkBase
	 * @return
	 */
	public static List<TbWebPicture> analsysHtmlForPics(TbWebLink linkBase){
		List<TbWebPicture> list = new ArrayList<TbWebPicture>();
		String tmpKey = linkBase.getLinkHref().substring(0, linkBase.getLinkHref().lastIndexOf("."));
		System.out.println("url: "+linkBase.getLinkHref());
		analsysImgAll(linkBase.getLinkHref(),tmpKey);

		TbWebPicture webPic = null ;
		String[] urls = null;
		String prekey =null , curkey = null, picUrl = null, oldName =null ,sufffix = "";
		byte[] content = null ;
		for(int k = 0; k < picList.size(); k ++){
			picUrl = picList.get(k);
			System.out.println(" picUrl" +picUrl);
			urls = picUrl.split(",");
			webPic = new TbWebPicture();
			curkey = urls[0].substring(0, urls[0].lastIndexOf("/"));
			if(prekey!=null && !curkey.equals(prekey)){
				continue ;
			}
			System.out.println("prekey "+prekey+", curkey "+curkey);
			
			if(RegexUtil.isEndWithImgSuffix(urls[0])){
				if(urls.length>1){
					oldName = urls[1]+RegexUtil.getPicNameWithImgSuffix(urls[0]);
				}else{
					oldName = RegexUtil.getPicNameWithImgSuffix(urls[0]);
				}
				
				sufffix = oldName.substring(oldName.lastIndexOf("."));
			}else{
				String date2Str = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
					if(urls.length>1 && !StringUtils.isEmpty(urls[1])){
						oldName = urls[1]+ date2Str +".jpg";
					}else{
						oldName = date2Str +".jpg";
					}
			}
			webPic = getPicContent(linkBase.getLinkName(),urls[0], oldName, sufffix,webPic);
			if(webPic.getPicContent()==null){
				System.out.println(" 图片内容未取到 :"+webPic.getPicPath());
				continue ;
			}
			
 			webPic.setAddTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
			webPic.setLinkId(linkBase.getLinkId());
			webPic.setPicOldName(oldName);
			webPic.setPicHref(urls[0]);
			webPic.setPicNo((long) (k+1));
			if(urls.length>1){
				webPic.setPicName(urls[1]);
				webPic.setPicDesc(urls[1]);
			}
			
			list.add(webPic);
			prekey = curkey;
			System.out.println("还有："+(picList.size()-k)+"待下载");
		}
		hisurl.clear();
		picList.clear();
		return list;
	}
	
	
	
	private static void analsysImgAll(String url,String tmpKey){

		if(hisurl.contains(url)){
			return;
		}
		//处理当前页
		analsysImg(url);
		
		Document doc = NetUtil.getDocument(url);
		if(doc==null){
			System.out.println("doc is null "+url);
			return;
		}
		hisurl.add(url);
		System.out.println("FetchLinkPicsUtil.analsysImgAll hisurl :"+hisurl.size());
		//找分页
		String hrefTag = "a";
		String hrefAttr = "abs:href";
		Elements tmps = doc.select(hrefTag);
		for(Element e : tmps){
			String href = e.attr(hrefAttr);
			if(href.equals(url)){
				continue;
			}
			if(!href.contains(tmpKey)){
				continue;
			}
			if(hisurl.contains(href)){
				continue;
			}
			System.out.println( " tmp href："+href);
			analsysImgAll(href,tmpKey);
		}
	}
	
	/**
	 * 抓取指定页面图片，不含其他分页
	 * @param url
	 */
	private static void analsysImg(String url){
		if(picList.contains(url)){
			System.out.println("picList :"+picList.size());
			return;
		}
		Document doc = NetUtil.getDocument(url);
		if(doc==null){
			System.out.println("FetchLinkPicsUtil.analsysImg doc is null "+url);
			return;
		}
		String tag = "body img";
		String[] attr ={ "abs:src","alt src","data-src"};
		Elements elemens = doc.select(tag);
		String picName = "";
		String imgUrl = "";
		for(Element e : elemens){
			String src = e.attr(attr[0]);
			picName = e.attr("alt");
			if(StringUtils.isEmpty(src)){
				
			}
			imgUrl = src;
			if (!RegexUtil.isPicLink(imgUrl)) {
				imgUrl = e.attr(attr[1]);
				if (!RegexUtil.isPicLink(imgUrl)) {
					imgUrl = e.attr(attr[2]);
				}
			}
			System.out.println(" imgUrl+picName "+imgUrl+","+picName);
			if(!picList.contains((imgUrl+","+picName))){
				picList.add(imgUrl+","+picName);
			}
		}
	}
	
	private static TbWebPicture getPicContent(String dir ,String imgsrc, String oldName, String sufffix,TbWebPicture pictrue){
		String filePath = DownPicUtil.save(dir,imgsrc, oldName, sufffix);
		File file = new File(filePath);
		if(FileOptionUtil.checkImgSizePx(filePath)){
			return pictrue;
		}
		byte[] content  = AttachemnetUtil.convertFileToBytes(file);
		pictrue.setPicPath(filePath);
		pictrue.setPicContent(content);
		pictrue.setPicSize(file.length());
		pictrue.setPicSuffix(sufffix);
		return pictrue;
	}
}
