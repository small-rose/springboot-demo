package cn.xiaocai.demo.tkbase.web.mapper;

import cn.xiaocai.demo.tkbase.web.model.TbUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Xiaocai.Zhang
 */


public interface UserMapper extends Mapper<TbUser> {


    List<TbUser> selectSpecialAgeOver20(TbUser tbUser);
}
