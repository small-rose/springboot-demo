package cn.xiaocai.demo.spider.rules;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/12/24 20:57
 * @version: v1.0
 */
@Data
@Slf4j
@Component
@Scope("prototype")
public class LinkGroupPageRule extends BaseRule{

    private List<String> defaultKeys = Arrays.asList("上一组","下一组","前一组","后一组");

    @Override
    protected BaseRule getRules() {
        return this;
    }

    @PostConstruct
    public void init(){
        System.out.println("--------初始化链接分页规则--------");
        List<String> skipKeys = getSkipKeys();
        if(skipKeys == null){
            skipKeys = defaultKeys;
        }
        super.setSkipKeys(skipKeys);
    }


}
