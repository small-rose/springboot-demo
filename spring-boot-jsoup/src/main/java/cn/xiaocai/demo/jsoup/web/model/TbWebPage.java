package cn.xiaocai.demo.jsoup.web.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Project : springboot-demo
 * @Author : zhangzongyuan
 * @Description : [ TbWebSite ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2021/12/23 17:49
 * @Version ： 1.0
 **/
@Entity
@Table(name = "tb_web_page")
@Data
public class TbWebPage implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "page_id")
    private Long pageId;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "page_no")
    private Long pageNo;

    @Column(name = "page_href")
    private String pageHref;

    @Column(name = "page_name")
    private String pageName;

    @Column(name = "page_mark")
    private String pageMark;

    @Column(name = "link_tag")
    private String linkTag;

    @Column(name = "link_tag_attr")
    private String linkTagAttr;


    @Column(name = "link_keys")
    private String linkKeys;

    @Column(name = "link_total")
    private Long linkTotal;

     @Column(name = "add_time")
    private String addTime;


/*


    @Entity标注保证实体能够被SpringBoot扫描到，对应表名为t_user。
    @Id表明id。
    @GeneratedValue中标注主键生成策略。
    @Transient表示不需要映射的字段。


GenerationType主键策略
    TABLE： 使用一个特定的数据库表格来保存主键
    SEQUENCE： 根据底层数据库的序列来生成主键，条件是数据库支持序列。这个值要与generator一起使用，generator 指定生成主键使用的生成器（可能是orcale中自己编写的序列）。
    IDENTITY： 主键由数据库自动生成（主要是支持自动增长的数据库，如mysql）
    AUTO： 主键由程序控制，也是GenerationType的默认值。


 */
}
