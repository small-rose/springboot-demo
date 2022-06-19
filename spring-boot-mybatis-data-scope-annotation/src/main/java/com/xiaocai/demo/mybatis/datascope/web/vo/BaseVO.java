package com.xiaocai.demo.mybatis.datascope.web.vo;

/**
 * @author js
 * @date  Create in 2019/08/30
 * @decription 基础dto
 * @Modified By:
 */
public abstract class BaseVO {
	
	private Integer pageIndex = 1;
	
	private Integer pageSize = 20;
	
	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getStartRowNum() {
		if(pageIndex != null && pageSize != null){
			return (this.pageIndex-1) * this.pageSize;
		}
		return 0;
	}


	public Integer getEndRowNum() {
		if(pageIndex != null && pageSize != null){
			return this.pageIndex * this.pageSize;
		}
		return 0;
	}

}
