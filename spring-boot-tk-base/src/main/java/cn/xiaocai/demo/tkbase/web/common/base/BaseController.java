package cn.xiaocai.demo.tkbase.web.common.base;

import cn.xiaocai.demo.tkbase.web.common.message.CommonResult;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *  通用 BaseController
 * @author Xiaocai.Zhang
 * @param <T>
 */
@Slf4j
public  abstract class BaseController<T> {



    protected void beforeHandle(Map map){
        log.info("前置处理--before");
    }

    protected  void afterHandle(Map map){
        log.info("后置处理--after");
    }

    /**
     *  由子类的实现提供真实的service
     * @return
     */
    public abstract BaseService<T> getBaseService();

    @RequestMapping("/add")
    public Object add(@RequestBody Map map){
        beforeHandle(map);
        T newinstance = getBaseService().newinstance(map);
        T t = getBaseService().add(newinstance);
        afterHandle(map);
        return CommonResult.ok("操作成功");
    }

    @RequestMapping("delete")
    public Object delete(@RequestBody Map map){
        T newinstance = getBaseService().newinstance(map);
        getBaseService().delete(newinstance);
        return CommonResult.ok("操作成功");
    }

    /**
     * 通过主键id批量删除 参数必须为数组，名为ids
     * @param ids
     * @return
     */
    @RequestMapping("deletes")
    public Object batchDelete(@RequestParam("ids[]") Integer ids[]){
        int i = getBaseService().deleteByIds(Arrays.asList(ids));
        if(i>0) {
            return CommonResult.ok("操作成功");
        }else {
            return CommonResult.fail("操作失败");
        }
    }



    @RequestMapping("update")
    public Object update(@RequestBody Map map){
        T t = getBaseService().newinstance(map);
        int rs = getBaseService().update(t);
        if(rs>0) {
            return CommonResult.ok("更新成功");
        }else {
            return CommonResult.fail("更新失败");
        }

    }
    @RequestMapping("/getById")
    public Object getById(@RequestParam(defaultValue = "1") Integer id){
        T t = getBaseService().queryByPrimaryKey(id);
        if(null==t)
            return  CommonResult.fail("查询失败");;
        return CommonResult.ok(t);
    }

    @RequestMapping(value = "/getOne")
    public Object getOne(@RequestBody Map map){
        T t = getBaseService().newinstance(map);
        t = getBaseService().queryOne(t);
        if(null==t)
            return  CommonResult.fail("查询失败");;
        return CommonResult.ok(t);
    }

    @RequestMapping("/getList")
    public Object getList(@RequestBody Map map){
        T t = getBaseService().newinstance(map);
        List<T> list = getBaseService().queryList(t);
        return CommonResult.ok(list);
    }

    /**
     * 附带检索条件的分页查询
     * @param map
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/getPageQuery")
    public Object getListByPage(@RequestBody Map map, @RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize){
        T t = getBaseService().newinstance(map);
        PageInfo<T> pageInfo = getBaseService().queryListByPage(t,pageNo,pageSize);
        return CommonResult.ok(pageInfo);
    }

    /**
     * 无检索条件的分页查询 --测试过
     * @param pageNo
     * @param pageSize
     * @return
     */
    @RequestMapping("/getPage")
    public Object getListByPage(@RequestParam("pageNo") int pageNo, @RequestParam("pageSize") int pageSize){
        //T t = getBaseService().newinstance(null);
        T t=null;
        PageInfo<T> pageInfo = getBaseService().queryListByPage(t,pageNo,pageSize);
        return CommonResult.ok(pageInfo);
    }

}
