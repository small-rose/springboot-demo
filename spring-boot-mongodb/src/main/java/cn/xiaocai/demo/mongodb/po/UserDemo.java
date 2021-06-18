package cn.xiaocai.demo.mongodb.po;

import lombok.Data;

import java.util.Date;

/**
 * @program: spring-boot-mongodb
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-06-11 09:42
 **/
@Data
public class UserDemo {

    private Long id;
    private Integer age;
    private String name;
    private Date birth;
}
