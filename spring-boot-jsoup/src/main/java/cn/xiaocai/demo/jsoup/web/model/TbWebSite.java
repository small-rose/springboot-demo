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

@Entity(name = "tb_web_site")
@Data
public class TbWebSite implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "web_id")
    private Long webId;

    @Column(name = "web_url")
    private String webUrl;

    @Column(name = "web_name")
    private String webName;

    @Column(name = "web_desc")
    private String webDesc;

    @Column(name = "web_open")
    private String webOpen;

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
