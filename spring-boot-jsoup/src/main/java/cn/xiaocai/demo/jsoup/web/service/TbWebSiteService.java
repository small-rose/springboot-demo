package cn.xiaocai.demo.jsoup.web.service;

import cn.xiaocai.demo.jsoup.web.model.TbWebSite;
import cn.xiaocai.demo.jsoup.web.repository.TbWebSiteDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TbWebSiteService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:55
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class TbWebSiteService {

    @Resource
    private TbWebSiteDao tbWebSiteDao ;


    public TbWebSite add(TbWebSite tbWebSite){
       return  tbWebSiteDao.save(tbWebSite);
    }


    public TbWebSite update(TbWebSite tbWebSite){
        return  tbWebSiteDao.saveAndFlush(tbWebSite);
    }


    public boolean delete(TbWebSite tbWebSite){
        tbWebSiteDao.delete(tbWebSite);
        return true ;
    }


    public TbWebSite selectById(Long id){
        return  tbWebSiteDao.getOne(id);
    }

    public List<TbWebSite> queryList(Long webId) {
        List<TbWebSite> list = new ArrayList<TbWebSite>();

        return list ;
    }
}
