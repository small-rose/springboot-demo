package cn.xiaocai.js.data.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/7/30 23:42
 * @version: v1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name = "JS_ARTICLE_RANK")
public class ArticleRank {

    @Id
    @GenericGenerator(name = "id", strategy = "cn.xiaocai.js.data.persistence.id.MyIdGenerator" )
    @GeneratedValue(generator = "id")
    private Long id ;
    private String rank_date ;
    private String slug ;//用户id
    private Integer rank_no ;//用户id
    private String title ;//上榜文章名称
    private String author_nickname ;
    private String author_nickname_py ;
    private String author_avatar ;
    // 收益 页面显示要除以1000
    private String fp ;
    private String author_fp ;
    private String voter_fp ;

    @Override
    public String toString() {
        return "ArticleRank{" +
                "id=" + id +
                ", rank_date='" + rank_date + '\'' +
                ", slug='" + slug + '\'' +
                ", rank_no=" + rank_no +
                ", title='" + title + '\'' +
                ", author_nickname='" + author_nickname + '\'' +
                ", author_nickname_py='" + author_nickname_py + '\'' +
                ", author_avatar='" + author_avatar + '\'' +
                ", fp='" + fp + '\'' +
                ", author_fp='" + author_fp + '\'' +
                ", voter_fp='" + voter_fp + '\'' +
                '}';
    }
}
