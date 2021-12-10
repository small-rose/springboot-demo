package com.xiaocai.demo.ftp;

import com.jcraft.jsch.*;
import com.jcraft.jsch.ChannelSftp.LsEntry;
import lombok.Data;
import lombok.extern.log4j.Log4j;


import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

@Log4j
@Data
public class SFTPClient {

	private String hostIp;
	private int port;
	private String username;
	private String password;
	private ChannelSftp sftp = null;


	public static SFTPClient getInstance(String hostIp, int port, String username, String password){
		return new SFTPClient(hostIp, port, username, password);
	}


	public SFTPClient(String hostIp, int port, String username, String password) {
		this.hostIp = hostIp;
		this.port = port;
		this.username = username;
		this.password = password;
	}

	public void login() {
		try {
			if (sftp == null) {
				JSch jsch = new JSch();
				Session sshSession = null;
				if(port==0){
					sshSession = jsch.getSession(username, hostIp);					
				}else{
					sshSession = jsch.getSession(username, hostIp, port);
				}
				
				
				sshSession.setPassword(password);
				sshSession.setConfig("StrictHostKeyChecking", "no");
				sshSession.connect();
				Channel channel = sshSession.openChannel("sftp");
				channel.connect();
				sftp = (ChannelSftp) channel;
				//log.info("Success to conect sftp:" + hostIp);
				System.out.println("Success to conect sftp:" + hostIp);
			}
		} catch (Exception e) {
			e.printStackTrace();
			//log.error("[SFTPClient]->[getSFTPClient]", e);
		}
	}

	public List<String> ls(String dir) throws Exception {
		Vector<?> files = sftp.ls(dir);

		List<String> fileNames = new ArrayList<String>();
		for (int i = 0; i < files.size(); ++i) {
			Object obj = files.elementAt(i);
			String fileName = obj.toString();
			if (obj instanceof LsEntry) {
				LsEntry entry = (LsEntry) obj;
				fileName = entry.getFilename();
			}
			fileNames.add(fileName);
		}
		return fileNames;
	}

	/**
	 *
	 * @param srcFileName  远程文件完整路径
	 * @param dest   本地保存的文件路径
	 * @throws Exception
	 */
	public void download(String srcFileName, String dest) throws Exception {
		sftp.get(srcFileName, dest);
	}
	

	/**
	 * 
	 * @param dir：源路径
	 * @param dest ： 目录路径
	 * @throws Exception 
	 */
	public void downLoadDir(String dir, String dest) throws Exception {
		 downLoadDir(dir, dest, null);
	}
	
	/**
	 * 
	 * @param dir：源路径
	 * @param dest ： 目录路径
	 * @param pattern ：文件过滤条件
	 * @throws Exception 
	 */
	public void downLoadDir(String dir, String dest, String pattern) throws Exception {
		List<String> fileNames = ls(dir);

		if (!dir.endsWith("/")) {
			dir += "/";
		}

		for (String fileName : fileNames) {
			if (fileName.equals(".") || fileName.equals("..")) {
				continue;
			}

			if (pattern == null) {
				download(dir + fileName, dest);
				continue;
			} else if (fileName.indexOf(pattern) != -1 && fileName.endsWith(".txt")  ) {
				download(dir + fileName, dest);
				//log.info("Success to download file:" + fileName);
				System.out.println("Success to download file:" + fileName);
			}
		}
	}

	public void mvFileToBakup(String srcFileName, String dest) {
		try {
			sftp.rename(srcFileName, dest);
		} catch (SftpException e) {
			e.printStackTrace();
			//log.error("[SFTPClient]-->[mvFileToBakup]", e);
		}
	}

	public void logout() {
		if (sftp != null) {
			try {
				sftp.disconnect();
			} catch (Exception e) {
				e.printStackTrace();
				//log.error("[SFTPClient]-->[logout]", e);
			}
		}
	}

	public static void main(String[] args) {
		try {
			String ip = "120.27.164.229";
			int port = 13022;
			String name = "202109150001bill";
			String pass = "202109150001bill";
			String remotePath = "/mnt/customerbill/202109150001";

			SFTPClient sFtpClient = new SFTPClient(ip, port, name, pass);

  			sFtpClient.login();
			List<String> fileNames = sFtpClient.ls(remotePath);
			for (String fileName : fileNames) {
				System.out.println(fileName);
			}

			sFtpClient.downLoadDir(remotePath, "D:\\当前任务文件夹\\安诚\\对账文件\\易宝\\111", "2021-12-09");
			sFtpClient.logout();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
