package cn.xiaocai.js.data.search.vo;


import cn.xiaocai.js.data.persistence.entity.ArticleRank;

import java.beans.Transient;

/**
 * @author Tommy
 * Created by Tommy on 2019/10/30
 **/
public class SearchResult implements java.io.Serializable {

    private int highlight[];    //高亮显示命中字符
    private String highlightText;

    private WordIndex mathIndex; // 最后匹配的词
    private ArticleRank item;
    public SearchResult() {
    }

    public SearchResult(ArticleRank item) {
        this.item = item;
    }

    public int[] getHighlight() {
        return highlight;
    }

    public void setHighlight(int[] highlight) {
        this.highlight = highlight;
    }


    public ArticleRank getItem() {
        return item;
    }

    public void setItem(ArticleRank item) {
        this.item = item;
    }
    @Transient
    public WordIndex getMathIndex() {
        return mathIndex;
    }
    @Transient
    public void setMathIndex(WordIndex mathIndex) {
        this.mathIndex = mathIndex;
    }

    public String getHighlightText() {
        return highlightText;
    }

    public void setHighlightText(String highlightText) {
        this.highlightText = highlightText;
    }


}
