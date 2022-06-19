package com.xiaocai.demo.mybatisplus.web.vo;

import com.xiaocai.demo.mybatisplus.web.entity.Account;
import lombok.Data;

import java.util.Date;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2022/6/1 15:37
 * @version: v1.0
 */
@Data
public class AccountVo extends Account {


    private Date startDate ;
    private Date endDate ;
}
