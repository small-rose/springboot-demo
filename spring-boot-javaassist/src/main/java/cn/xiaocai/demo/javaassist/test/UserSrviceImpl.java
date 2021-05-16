package cn.xiaocai.demo.javaassist.test;
/**
 * @Copyright 源码阅读网 http://coderead.cn
 */

/**
 * @author 鲁班大叔
 * @date 2021
 */
public class UserSrviceImpl implements UserSrvice {
    @Override
    public String getName(Integer id) {
        System.out.println("执行getName");
        return "鲁班大叔";
    }

    @Override
    public void deleteUser(Integer id, String password) {
        System.out.println("删除用户");
    }
}
