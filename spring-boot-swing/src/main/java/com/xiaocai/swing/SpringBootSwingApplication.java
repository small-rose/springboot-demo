package com.xiaocai.swing;


import com.xiaocai.swing.ui.loading.LoadFrame;
import com.xiaocai.swing.ui.main.MainFrameController;
import com.xiaocai.swing.ui.progress.ProgressBeanPostProcessor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.io.ClassPathResource;

import javax.swing.*;
import java.io.IOException;

@SpringBootApplication
public class SpringBootSwingApplication {

    public static void main(String[] args) {
        //UIManager.setInstalledLookAndFeels("");
        //先启动启动画面
        banner();

        long start = System.currentTimeMillis();
        //启动springboot
        new SwingWorker() {
            @Override
            protected Object doInBackground() {
                ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringBootSwingApplication.class)
                        .headless(false)
                        .run(args);

                MainFrameController bean = context.getBean(MainFrameController.class);
                bean.prepareAndOpenFrame();

                long end = System.currentTimeMillis();
                System.out.println("time:" + (end - start) + "ms");
                return null;
            }
        }.execute();
    }


    private static void banner() {
        LoadFrame load = new LoadFrame();
        ImageIcon imageIcon = null;
        try {
            imageIcon = new ImageIcon(new ClassPathResource("/icon/logo-3.png").getURL());
            load.setIconImage(imageIcon.getImage());
        } catch (IOException e) {
            e.printStackTrace();
        }

        load.setTitle("张小菜");
        load.setVisible(true);
        //监听进度并更新
        ProgressBeanPostProcessor.observe().subscribe(integer -> {
                    load.getProgress().setValue(integer);
                    // 变色
                    //load.setForce();
                }

                , e -> {
                    e.printStackTrace();
                }
                , () -> load.setVisible(false));
    }
}
