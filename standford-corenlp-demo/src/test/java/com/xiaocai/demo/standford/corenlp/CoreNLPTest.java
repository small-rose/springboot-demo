package com.xiaocai.demo.standford.corenlp;

import edu.stanford.nlp.pipeline.StanfordCoreNLP;
import org.junit.jupiter.api.Test;

import java.io.IOException;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ CoreNLPTest ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/7/18 15:27
 * @Version ： 1.0
 **/
public class CoreNLPTest {

    @Test
    public void test_14() throws IOException {

        String[] chineseArgs = new String[]{"-props","StanfordCoreNLP-chinese.properties",
                "-annotators","tokenize,ssplit,pos,lemma,ner,parse,coref,kbp,entitylink",
                "-file", "sample-chinese.txt", "-outputFormat", "text"};
        StanfordCoreNLP.main(chineseArgs);
    }
}
