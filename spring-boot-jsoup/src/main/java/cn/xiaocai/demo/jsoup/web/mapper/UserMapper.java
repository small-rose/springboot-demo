package cn.xiaocai.demo.jsoup.web.mapper;




import cn.xiaocai.demo.jsoup.web.model.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @author Xiaocai.Zhang
 */


public interface UserMapper extends Mapper<User> {


    List<User> selectSpecialAgeOver20(User user);
}
