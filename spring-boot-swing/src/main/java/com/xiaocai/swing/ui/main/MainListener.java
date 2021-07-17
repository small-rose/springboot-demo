package com.xiaocai.swing.ui.main;

import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.RuntimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

import javax.swing.*;
import java.io.*;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/17 22:58
 * @version: v1.0
 */
@Slf4j
public class MainListener {


    private MyFrame myFrame ;

    public MainListener(MyFrame myFrame){
        this.myFrame = myFrame;
    }

    public void addListeners(){
        myFrame.getIpButton().addActionListener((e)->{
            myFrame.getTool_card().setSelectedComponent(myFrame.getIpcard_panel());
        });

        myFrame.getXmlButton().addActionListener((e)->{
            myFrame.getTool_card().setSelectedComponent(myFrame.getXmlcard_panel());
        });

        myFrame.getJsonButton().addActionListener((e)->{
            myFrame.getTool_card().setSelectedComponent(myFrame.getJsoncard_panel());
        });

        myFrame.getPingButton().addActionListener((e)->{
            try {
                String pingIp = myFrame.getIpValue().getText().trim();
                myFrame.getIpResult().setText("");
//                if (SystemUtil.isWindowsOs()) {
                Process process = RuntimeUtil.exec("ping " + pingIp);
                InputStream inputStream = process.getInputStream();
                ThreadUtil.execute(() -> {
                    InputStreamReader inputStreamReader = null;
                    BufferedReader bufferedReader = null;
                    try {
                        inputStreamReader = new InputStreamReader(inputStream, CharsetUtil.GBK);
                        bufferedReader = new BufferedReader(inputStreamReader);
                        String line = null;
                        while (true) {
                            try {
                                if ((line = bufferedReader.readLine()) == null) {
                                    break;
                                }
                            } catch (IOException ex) {
                                log.error(ExceptionUtils.getStackTrace(ex));
                            }
                            myFrame.getIpResult().append(line + "\n");
                        }
                    } catch (UnsupportedEncodingException ex) {
                        ex.printStackTrace();
                    } finally {
                        process.destroy();
                        if (inputStreamReader != null) {
                            try {
                                inputStreamReader.close();
                            } catch (IOException ex) {
                                log.error(ExceptionUtils.getStackTrace(ex));
                            }
                        }
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException ex) {
                                log.error(ExceptionUtils.getStackTrace(ex));
                            }
                        }
                    }

                });
//                } else {
//                }
                myFrame.getIpResult().setCaretPosition(0);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(myFrame.getIpcard_panel(), ex.getMessage(), "失败！", JOptionPane.ERROR_MESSAGE);
                log.error(ExceptionUtils.getStackTrace(ex));
            }
        });
    }
}
