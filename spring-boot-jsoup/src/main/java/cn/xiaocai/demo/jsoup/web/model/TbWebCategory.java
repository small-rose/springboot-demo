package cn.xiaocai.demo.jsoup.web.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TbWebCategory ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/24 10:59
 * @Version ： 1.0
 **/
@Entity
@Table(name = "tb_web_category")
@Data
public class TbWebCategory implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "web_id")
    private Long webId;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "category_url")
    private String categoryUrl;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "category_mark")
    private String categoryMark;

    @Column(name = "page_tag")
    private String pageTag;

    @Column(name = "page_tag_attr")
    private String pageTagAttr;

    @Column(name = "page_keys")
    private String pageKeys;

    @Column(name = "page_total")
    private Long pageTotal;

    @Column(name = "add_time")
    private String addTime;
}
