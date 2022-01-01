package cn.xiaocai.demo.spider.data;

import lombok.Data;

/**
 * @program: springboot-demo
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-07-12 12:12
 **/
@Data
public class PicData extends UrlData{

    private String picName ;
    private String suffix ;

    public String toString(){
        return "PicData( url= "+url+", picName="+picName+", tag="+tag+", name="+name+", suffix="+suffix+")" ;
    }
}
