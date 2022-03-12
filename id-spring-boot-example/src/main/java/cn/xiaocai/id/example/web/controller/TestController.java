package cn.xiaocai.id.example.web.controller;

import cn.xiaocai.id.example.web.service.TestService;
import cn.xiaocai.id.example.web.utils.SnowflakeIdWorker;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Project : springboot-demo
 * @Author : Small-Rose / zhangxaiocai
 * @Description : [ TestController ] 说明：无
 * @Function :  功能说明：无
 * @Date ：2022/2/17 16:42
 * @Version ： 1.0
 **/

@RestController
@AllArgsConstructor
public class TestController {

    private final TestService testService ;

    private final  SnowflakeIdWorker snowflakeIdWorker = new SnowflakeIdWorker(0L,0L);

    /**
     *  http://localhost:8801/id-example/getId
     * @return
     */
    @GetMapping(value="/getId")
    public Long testId(){

        return testService.getId() ;
    }

    /**
     *  http://localhost:8801/id-example/batch/10
     * @return
     */
    @GetMapping(value="/batch/{batchNum}")
    public Map<String, Object> testId(@PathVariable(name="batchNum") int batchNum){
        HashMap result = new HashMap<String, Object>();

        if (batchNum <0 ){
            batchNum = 100;
        }

        long start = System.currentTimeMillis();
        Set<Long> batchIds = testService.getBatchId(batchNum);
        long end = System.currentTimeMillis();

        result.put("take", (end - start)+"ms" ) ;
        result.put("size", batchNum);
        result.put("data", batchIds);
        return result ;
    }

    /**
     *  http://localhost:8801/id-example/snow
     * @return
     */
    @GetMapping(value="/snow")
    public Map<String, Object> snowflakeId(){
        HashMap result = new HashMap<String, Object>();

        Set<Long> batchIds = new HashSet<>();
        long start = System.currentTimeMillis();
        for (; System.currentTimeMillis() - start < 1000 ;){
            long l = snowflakeIdWorker.nextId();
            batchIds.add(l);
        }


        result.put("size", batchIds.size());
        result.put("data", batchIds);
        return result ;
    }
}
