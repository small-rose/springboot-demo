package cn.xiaocai.demo.jsoup.common;

import com.jcraft.jsch.*;

import org.apache.commons.io.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description: TODO 功能角色说明：
 * TODO 描述：
 * @author: 张小菜
 * @date: 2021/5/27 0:01
 * @version: v1.0
 */
public class SSHTest {

    public static void main(String[] args) throws IOException, JSchException {
        // TODO Auto-generated method stub
        String host = "121.4.26.45";
        int port = 22;
        String user = "root";
        String password = "small.CAI3366";
        // ifconfig
        String command = "journalctl -u redis.service";
        String res = exeCommand(host,port,user,password,command);
        System.out.println(res);
    }


    public static String exeCommand(String host, int port, String user, String password, String command) throws JSchException, IOException {
        JSch jsch = new JSch();

        jsch.addIdentity("D:\\small_CAI3366.pem");


        Session session = jsch.getSession(user, host, port);
        session.setConfig("StrictHostKeyChecking", "no");

        //    java.util.Properties config = new java.util.Properties();
        //   config.put("StrictHostKeyChecking", "no");

        session.setPassword(password);
        session.connect(30000);

        ChannelExec channelExec = (ChannelExec) session.openChannel("exec");
        InputStream in = channelExec.getInputStream();
        channelExec.setCommand(command);
        channelExec.setErrStream(System.err);
        channelExec.connect();
        String out = IOUtils.toString(in, "UTF-8");

        channelExec.disconnect();
        session.disconnect();

        return out;
    }

}
