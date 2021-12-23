package cn.xiaocai.demo.tkbase.web.service;

import cn.xiaocai.demo.tkbase.web.common.base.BaseService;
import cn.xiaocai.demo.tkbase.web.common.message.CommonResult;
import cn.xiaocai.demo.tkbase.web.mapper.UserMapper;
import cn.xiaocai.demo.tkbase.web.model.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Xiaocai.Zhang
 */
@Service
public class UserBsService extends BaseService<TbUser> {

    @Autowired
    private UserMapper userMapper;

    public CommonResult querySpecialAgeOver20(){
        TbUser tbUser = new TbUser();
        tbUser.setAge(20);
        List<TbUser> list = userMapper.selectSpecialAgeOver20(tbUser);
        return CommonResult.ok("自定义查询测试", list);
    }
}
