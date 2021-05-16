package cn.xiaocai.demo.javaassist.test;

public interface UserSrvice {
    public String getName(Integer id);

    default void deleteUser(Integer id, String password) {
    }
}
