package cn.xiaocai.demo.redis.po;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

/**
 * @program: bp-paystation-client
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-04-29 17:38
 **/
@Slf4j
@Data
public class User implements Serializable {

    private Long id ;
    private String name ;
    private Date inDate ;
    private LocalDateTime outTime ;
    private boolean isOk;
    private byte[] image ;
    private List<String>  roles ;
    private Map<String,Object>  press;
    private Set<User> leaders ;

    public User( ) {
    }

    public User(Long id, String name, Date inDate, LocalDateTime outTime, boolean isOk, byte[] image) {
        this.id = id;
        this.name = name;
        this.inDate = inDate;
        this.outTime = outTime;
        this.isOk = isOk;
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", inDate=" + inDate +
                ", outTime=" + outTime +
                ", isOk=" + isOk +
                ", image=" + Arrays.toString(image) +
                ", roles=" + roles +
                ", press=" + press +
                ", leaders=" + leaders +
                '}';
    }
}
