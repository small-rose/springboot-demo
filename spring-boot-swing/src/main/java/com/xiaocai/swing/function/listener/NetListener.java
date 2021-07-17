package com.xiaocai.swing.function.listener;

import cn.hutool.core.net.NetUtil;
import cn.hutool.core.thread.ThreadUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.RuntimeUtil;
import com.xiaocai.swing.common.utils.SystemUtil;
import com.xiaocai.swing.function.from.NetForm;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;

import javax.swing.*;
import java.io.*;
import java.util.LinkedHashSet;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/7/16 20:57
 * @version: v1.0
 */
@Slf4j
public class NetListener {



    public static void addListeners() {

        NetForm netForm = NetForm.getInstance();
        netForm.getIpConfigButton().addActionListener(e -> {
            try {

                String ipConfigStr;
                if (SystemUtil.isWindowsOs()) {
                    ipConfigStr = RuntimeUtil.execForStr("ipconfig");
                } else {
                    ipConfigStr = RuntimeUtil.execForStr("ifconfig");
                }
                netForm.getIpConfigTextArea().setText(ipConfigStr);
                netForm.getIpConfigTextArea().setCaretPosition(0);
            } catch (Exception ex) {
                ex.printStackTrace();
                log.error(ExceptionUtils.getStackTrace(ex));
            }
        });
        netForm.getIpConfigAllButton().addActionListener(e -> {
            try {
                String ipConfigStr;
                if (SystemUtil.isWindowsOs()) {
                    ipConfigStr = RuntimeUtil.execForStr("ipconfig /all");
                } else {
                    ipConfigStr = RuntimeUtil.execForStr("netstat -nat");
                }
                netForm.getIpConfigTextArea().setText(ipConfigStr);
                netForm.getIpConfigTextArea().setCaretPosition(0);
            } catch (Exception ex) {
                ex.printStackTrace();
                log.error(ExceptionUtils.getStackTrace(ex));
            }
        });

        netForm.getRefreshIpv4ListButton().addActionListener(e -> {
            try {
                LinkedHashSet<String> ipv4Set = NetUtil.localIpv4s();
                netForm.getIpv4ListTextArea().setText(String.join("\n", ipv4Set));
            } catch (Exception ex) {
                ex.printStackTrace();
                log.error(ExceptionUtils.getStackTrace(ex));
                JOptionPane.showMessageDialog(netForm.getNetPanel(), ex.getMessage(), "刷新失败！", JOptionPane.ERROR_MESSAGE);
            }
        });
        netForm.getRefreshIpv6ListButton().addActionListener(e -> {
            try {
                LinkedHashSet<String> ipv6Set = NetUtil.localIpv6s();
                netForm.getIpv6ListTextArea().setText(String.join("\n", ipv6Set));
            } catch (Exception ex) {
                ex.printStackTrace();
                log.error(ExceptionUtils.getStackTrace(ex));
                JOptionPane.showMessageDialog(netForm.getNetPanel(), ex.getMessage(), "刷新失败！", JOptionPane.ERROR_MESSAGE);
            }
        });
        netForm.getHostToIpButton().addActionListener(e -> {
            try {
                String hostStr = netForm.getHostTextField().getText().trim();
                String ipByHost = NetUtil.getIpByHost(hostStr);
                netForm.getIpTextField().setText(ipByHost);
            } catch (Exception ex) {
                ex.printStackTrace();
                log.error(ExceptionUtils.getStackTrace(ex));
                JOptionPane.showMessageDialog(netForm.getNetPanel(), ex.getMessage(), "获取失败！", JOptionPane.ERROR_MESSAGE);
            }
        });

        // PING
        netForm.getPingButton().addActionListener(e -> {
            try {
                String pingIp = netForm.getPingTextField().getText().trim();
                netForm.getIpConfigTextArea().setText("");
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
                            netForm.getIpConfigTextArea().append(line + "\n");
                        }
                    } catch (UnsupportedEncodingException ex) {
                        log.error(ExceptionUtils.getStackTrace(ex));
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
                netForm.getIpConfigTextArea().setCaretPosition(0);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(netForm.getNetPanel(), ex.getMessage(), "失败！", JOptionPane.ERROR_MESSAGE);
                log.error(ExceptionUtils.getStackTrace(ex));
            }
        });
    }
}
