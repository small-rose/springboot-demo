package cn.xiaocai.demo.redis.web.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/1 14:58
 * @version: v1.0
 */
@Data
@AllArgsConstructor
public class Employee implements Serializable {

    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
}
