package cn.xiaocai.js.data.search.vo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Tommy
 * Created by Tommy on 2019/10/27
 **/
public class WordIndex {
    private String word;
    private Object next;
    private int index;

    public Object getResource() {
        if (next instanceof WordIndex) {
            return ((WordIndex) next).getResource();
        } else {
            return next;
        }
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Object getNext() {
        return next;
    }

    public void setNext(Object next) {
        this.next = next;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * 匹配当前词项指定位置字符,忽略大小写
     *
     * @param index
     * @param c
     * @return
     */
    public boolean match(int index, char c) {
        return word.length() > index &&
                Character.toUpperCase(word.charAt(index)) == Character.toUpperCase(c);
    }

    /**
     * 查找下一个 首字母为c 词项
     *
     * @param c
     * @return
     */
    public WordIndex findNext(char c) {
        WordIndex next = this;
        while (next.getNext() instanceof WordIndex) {
            next = (WordIndex) next.getNext();
            if (next.getWord().charAt(0) == c) {
                return next;
            }
        }
        return null;
    }
    // 指向同一资源
   /* @Override
    public boolean equals(Object obj) {
        if (obj==null||!(obj instanceof WordIndex)) {
            return false;
        }
        return getResource() == ((WordIndex) obj).getResource();
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordIndex wordIndex = (WordIndex) o;

        return getResource().equals(wordIndex.getResource());
    }

    @Override
    public int hashCode() {
        return getResource().hashCode();
    }

   /* public static void main(String[] args) {
        WordIndex wordIndex = new WordIndex();
        wordIndex.next="123";
        WordIndex wordIndex2 = new WordIndex();
        wordIndex2.next="333";
        List<WordIndex> collect = Stream.of(wordIndex, wordIndex2).distinct().collect(Collectors.toList());
        System.out.println(collect.size());
    }*/
}
