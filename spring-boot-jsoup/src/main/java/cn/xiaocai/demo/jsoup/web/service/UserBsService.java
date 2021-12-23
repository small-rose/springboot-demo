package cn.xiaocai.demo.jsoup.web.service;



import cn.xiaocai.demo.jsoup.web.common.message.CommonResult;
import cn.xiaocai.demo.jsoup.web.mapper.UserMapper;
import cn.xiaocai.demo.jsoup.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xiaocai.Zhang
 */
@Service
public class UserBsService extends BaseService<User> {

    @Autowired
    private UserMapper userMapper;

    public CommonResult querySpecialAgeOver20(){
        User user = new User();
        user.setAge(20);
        List<User> list = userMapper.selectSpecialAgeOver20(user);
        return CommonResult.ok("自定义查询测试", list);
    }
}
