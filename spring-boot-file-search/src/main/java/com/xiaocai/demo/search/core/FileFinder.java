package com.xiaocai.demo.search.core;


import com.xiaocai.demo.search.core.strategy.FileContentContainsStrategy;
import com.xiaocai.demo.search.core.strategy.FileContentRegExpStrategy;
import com.xiaocai.demo.search.core.strategy.FileNameEndsWithStrategy;
import com.xiaocai.demo.search.core.strategy.FilterStrategy;
import lombok.Setter;

import java.io.File;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ FileFinder ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/6/30 14:39
 * @Version ： 1.0
 **/
public class FileFinder {


    /**
     * 文件搜索路径
     */
    @Setter
    private String path ;

    public List<File>  getAllFiles(){
        return FileFilterUtils.getAllList(path);
    }

    /**
     *
     * @param customerFileList 可以为null， null 时从path路径下的文件列表搜索，不为null，则使用定义的文件列表
     * @param containsMode 搜索策略
     * @param keys 关键字，至少有1个参数
     * @return
     */
    public List<File>  getFileList(ContainsMode containsMode,String[] keys, List<File> customerFileList, File ... files) {
        if (keys==null || keys.length==0){
            throw new IllegalArgumentException("缺少搜索的关键字");
        }
        if (customerFileList ==null || customerFileList.size()==0) {
            // 全部列表
            customerFileList = getAllFiles();
        }
        FilterStrategy strategy = null;
        //计算 含有关键词的 文件
        switch (containsMode){
            case FileNameContains:
                strategy = new FileNameEndsWithStrategy();
                break;
            case FileNameEndWith:
                strategy = new FileNameEndsWithStrategy();
                break;
            case FileContentContains:
                if (files!=null && files.length>0){
                    strategy = new FileContentContainsStrategy(files[0]);
                }else {
                    strategy = new FileContentContainsStrategy();
                }
                break;
            case FileContentRegExpStrategy:
                strategy = new FileContentRegExpStrategy();
                break;
            default:
                throw new IllegalArgumentException("查询策略不允许为空");
        }
        List<File> containsList = FileFilterUtils.getAllFilesByFileNameKeys(customerFileList, strategy, keys);
        return containsList ;
    }


}
