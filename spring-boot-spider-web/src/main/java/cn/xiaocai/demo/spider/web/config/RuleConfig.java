package cn.xiaocai.demo.spider.web.config;


import cn.xiaocai.demo.spider.web.vo.Rules;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/1/1 21:38
 * @version: v1.0
 */
@Data
@ToString
public class RuleConfig {

    private List<Rules> rules;

    //private Map<String, List<Rules>> rules;
    //public void setRules(Map<String, List<Rules>> rules) {

    public void setRules(List<Rules> rules) {

/*
        final Map<String, List<Rules>> tmpOrgs = new HashMap<>();
        rules.forEach((k, v) -> {
            List<Rules> peerNodeDTO = JSONObject.parseObject(
                    JSONObject.toJSONString(v), new TypeReference<List<Rules>>(){});
            rules.put(k, peerNodeDTO);
        });
*/
        final List<Rules> result = new ArrayList<>();
        rules.forEach((r) -> {
            Rules peerNodeDTO = JSONObject.parseObject(
                    JSONObject.toJSONString(r), new TypeReference<Rules>(){});
            result.add(peerNodeDTO);
        });
        this.rules = result;
    }
}
