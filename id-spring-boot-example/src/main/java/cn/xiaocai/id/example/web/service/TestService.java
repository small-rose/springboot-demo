package cn.xiaocai.id.example.web.service;

import cn.xiaocai.id.IdService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestService ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/17 16:44
 * @Version ： 1.0
 **/
@Service
@AllArgsConstructor
public class TestService {

    private final IdService idService;


    public Long getId(){

        return idService.nextId();
    }


    public Set<Long> getBatchId(int batchNum){
       /* if (batchNum == 0 || batchNum > 2000){
            batchNum = 1000 ;
        }*/
        Set<Long> batchIds = new HashSet<>();
        int c = 0 ;
        while (c < batchNum){
            long nextId = idService.nextId();

            if (!batchIds.contains(nextId)){
                batchIds.add(nextId);
                c++;
            }

            try {
                TimeUnit.NANOSECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        return batchIds;
    }
}
