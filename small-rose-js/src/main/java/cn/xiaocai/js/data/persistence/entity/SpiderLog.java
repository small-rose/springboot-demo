package cn.xiaocai.js.data.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/31 10:00
 * @version: v1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "JS_SPIDER_LOG")
public class SpiderLog {

    @Id
    @GenericGenerator(name = "id", strategy = "cn.xiaocai.js.data.persistence.id.MyIdGenerator" )
    @GeneratedValue(generator = "id")
    private Long id ;
    private String rank_date ;
    private String rank_type ; //AR 文章排名
    private String status ;//当日抓取结果 S / F
    private String result ;//当日抓取结果
    private String update_result ;//更新结果
    private Date exec_time ;//当日抓取结果
}
