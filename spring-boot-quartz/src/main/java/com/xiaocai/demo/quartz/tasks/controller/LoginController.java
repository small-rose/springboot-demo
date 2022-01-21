package com.xiaocai.demo.quartz.tasks.controller;

import com.xiaocai.demo.quartz.tasks.model.BuzBatchTask;
import com.xiaocai.demo.quartz.tasks.service.BatchTaskService;
import com.xiaocai.demo.quartz.tasks.vo.BatchTaskQuery;
import com.xiaocai.demo.quartz.tasks.vo.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ LoginControler ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/1/20 17:21
 * @Version ： 1.0
 **/

@Controller
public class LoginController {

    @Autowired
    private BatchTaskService batchTaskService ;

    @GetMapping(value="/")
    public String index(HttpServletRequest request){

        try {
            List<BuzBatchTask> buzBatchTasks = batchTaskService.listAll();
            request.setAttribute("taskList", buzBatchTasks);
            request.setAttribute("errorMsg", "数据加载成功");

        }catch(Exception e){

            request.setAttribute("errorMsg", "数据加载出错");
        }
        return "index";
    }

    @RequestMapping(value="findList", method= RequestMethod.POST)
    @ResponseBody
    public ReturnT<List> findList(HttpServletRequest request){
        List<BuzBatchTask> buzBatchTasks = batchTaskService.listAll();
        request.setAttribute("taskList", buzBatchTasks);
        return new ReturnT(buzBatchTasks);
    }

    @RequestMapping(value="pageList", method= RequestMethod.GET)
    @ResponseBody
    public Map pageList(int page, int rows, String sortOrder, String sort, String searchKey){
        BatchTaskQuery batchQuery = new BatchTaskQuery();
        batchQuery.setPage(page);
        batchQuery.setRows(rows);
        batchQuery.setSortOrder(sortOrder);
        batchQuery.setSort(sort);
        batchQuery.setSearchKey(searchKey);
        int pageNumber = 1;
        int pageSize = 10;
        // JPA 分页从0开始
        if(batchQuery.getPage()!=0) {
            pageNumber = batchQuery.getPage();
        }
        if(batchQuery.getRows()!=0){
            pageSize = batchQuery.getRows();
        }
        Pageable pageable = PageRequest.of(pageNumber-1, pageSize, Sort.Direction.DESC,"id");
        Page<BuzBatchTask> buzBatchTasks = batchTaskService.listAll(pageable,  batchQuery);

        Map map = new HashMap<String, Object>();
        map.put("total", buzBatchTasks.getTotalElements());
        map.put("rows", buzBatchTasks.getContent());
        return map;
    }
}
