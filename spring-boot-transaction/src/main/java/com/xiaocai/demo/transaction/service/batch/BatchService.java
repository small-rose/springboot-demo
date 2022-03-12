package com.xiaocai.demo.transaction.service.batch;

import com.xiaocai.demo.transaction.entity.AccountRecord;
import com.xiaocai.demo.transaction.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ BatchService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/3/7 17:27
 * @Version ： 1.0
 **/
@Service
@Slf4j
public class BatchService {


    @Resource
    private AccountMapper accountMapper;


    @Transactional
    public String batchInsert(){

        List<AccountRecord> mockData = new ArrayList<AccountRecord>();
        AccountRecord accountRecord = null;
        for (int i=0 ; i<58; i++){

            accountRecord = new AccountRecord();
            accountRecord.setName("Test00"+i);
            accountRecord.setPass("Pass00"+i);
            mockData.add(accountRecord);
        }
        List<AccountRecord> records = new ArrayList<AccountRecord>();
        for (int i=1 ; i< mockData.size()+1; i++) {

            records.add(mockData.get(i));

            if (i==50){
                throw new RuntimeException("数据校验不正常");
            }
            if (i % 20 ==0){

                accountMapper.batchInsertList(records);
            }
        }
        return "写入成功";
    }
}
