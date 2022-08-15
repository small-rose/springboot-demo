package cn.xiaocai.demo.camunda.workflow.util;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;

public class PageUtils {
    /**
     * 将PageInfo对象泛型中的Po对象转化为Vo对象
     * @param pageInfoPo PageInfo<Po>对象</>
     * @param <P> Po类型
     * @param <V> Vo类型
     * @return
     */
    public static <P, V> PageInfo<V> PageInfo2PageInfoVo(PageInfo<P> pageInfoPo) {
        // 创建Page对象，实际上是一个ArrayList类型的集合
        Page<V> page = new Page<>(pageInfoPo.getPageNum(), pageInfoPo.getPageSize());
        page.setTotal(pageInfoPo.getTotal());
        PageInfo<V> pageInfoVo = new PageInfo<>(page);
        pageInfoVo.setEndRow(pageInfoPo.getEndRow());
        pageInfoVo.setHasNextPage(pageInfoPo.isHasNextPage());
        pageInfoVo.setHasPreviousPage(pageInfoPo.isHasPreviousPage());
        pageInfoVo.setIsFirstPage(pageInfoPo.isIsFirstPage());
        pageInfoVo.setIsLastPage(pageInfoPo.isIsLastPage());
        pageInfoVo.setNavigateFirstPage(pageInfoPo.getNavigateFirstPage());
        pageInfoVo.setNavigateLastPage(pageInfoPo.getNavigateLastPage());
        pageInfoVo.setNavigatepageNums(pageInfoPo.getNavigatepageNums());
        pageInfoVo.setNavigatePages(pageInfoPo.getNavigatePages());
        pageInfoVo.setNextPage(pageInfoPo.getNextPage());
        pageInfoVo.setPageNum(pageInfoPo.getPageNum());
        pageInfoVo.setPages(pageInfoPo.getPages());
        pageInfoVo.setPageSize(pageInfoPo.getPageSize());
        pageInfoVo.setPrePage(pageInfoPo.getPrePage());
        pageInfoVo.setSize(pageInfoPo.getSize());
        pageInfoVo.setStartRow(pageInfoPo.getStartRow());
        pageInfoVo.setTotal(pageInfoPo.getTotal());
        return pageInfoVo;
    }
}
