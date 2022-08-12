package cn.xiaocai.demo.camunda;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.RepositoryService;
import org.camunda.bpm.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@Slf4j
@SpringBootApplication
public class SpringBootCamundaApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCamundaApplication.class, args);
        log.info("deploy success ");
    }


    @Autowired
    RepositoryService repositoryService;

    @Override
    public void run(String... args) {
        List<ProcessDefinition> processDefinitionList = repositoryService.createProcessDefinitionQuery().active().latestVersion().list();
        log.info("> 处于激活状态的最新版本的流程定义数量: " + processDefinitionList.size());
        for (ProcessDefinition pd : processDefinitionList) {
            log.info("\t ===> Process definition: " + pd.getKey() + " 版本：" + pd.getVersion());
        }
    }
}
