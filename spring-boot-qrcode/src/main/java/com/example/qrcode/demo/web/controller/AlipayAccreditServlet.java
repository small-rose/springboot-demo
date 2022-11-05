package com.example.qrcode.demo.web.controller;

import com.example.qrcode.demo.core.constants.AliPayConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//import com.fenet.insurance.paystation.onlinepay.api.config.Basic2Config;
//import com.fenet.insurance.paystation.onlinepay.api.config.BasicConfig;
//import com.fenet.insurance.paystation.onlinepay.api.utils.DES;
//import com.fenet.insurance.paystation.onlinepay.api.utils.ResultPageUtils;
//import org.apache.log4j.Logger;

@Slf4j
public class AlipayAccreditServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Autowired
	AliPayConstants aliPayConstants;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//doPost(request, response);
	}
/*

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		log.info("alipayaccreditservlet begin <<<<<<<<<<<<<<<<<<<<");

		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");

		StringBuffer sb = new StringBuffer("");
		Map<String, String> parmMap = new LinkedHashMap<String, String>();
		Map reqMap = request.getParameterMap();
		for (Object key : reqMap.keySet()) {
			parmMap.put(key.toString(), ((String[]) reqMap.get(key))[0]);
			sb.append(key.toString()).append("=").append(((String[]) reqMap.get(key))[0]).append("&");
		}

		String orderId = (String)parmMap.get("state");
		String app_id = (String)parmMap.get("app_id");
		String code = (String)parmMap.get("auth_code");
		String alipay_userId = "";
		String PayChannel = "";
		String errormessage = "";
		

		try {
			// 第一步：通过code获取userid
			AlipayClient alipayClient = new DefaultAlipayClient(
					aliPayConstants.getAlipay_accredit_url(), aliPayConstants.getApp_id(),
					aliPayConstants.getAlipay_private_key(), "json", "UTF-8",
					aliPayConstants.getAlipay_public_key(), "RSA2");
			AlipaySystemOauthTokenRequest alipayrequest = new AlipaySystemOauthTokenRequest();
			alipayrequest.setGrantType("authorization_code");
			alipayrequest.setCode(code);

			AlipaySystemOauthTokenResponse responseToken = null;
			try {
				responseToken = alipayClient.execute(alipayrequest);
			} catch (AlipayApiException e) {
				errormessage = "支付宝授权获取userid链接失败";
				throw new Exception(errormessage);
			}
			
			if (responseToken != null && responseToken.isSuccess()) {
				alipay_userId = responseToken.getUserId();

				// 第二步:调gatweay中的Action(gateway中先进行实名认证，再得到表单信息)
				String header = request.getHeader("apps-agent");
				if (header != null) {
					if (header.contains("Mobile")) {
						PayChannel = "01";
					} else {
						PayChannel = "02";
					}
				} else {
					PayChannel = "02";
				}

				Map<String, String> sHtmlText = new HashMap<String, String>();
				sHtmlText.put("orderId", orderId);
				// sHtmlText.put("checkCode", checkCode);
				sHtmlText.put("order_bankCode", "ALIPAY");
				// sHtmlText.put("orderAmount", orderAmount);
				sHtmlText.put("mer_url", null);
				sHtmlText.put("_input_charset", "GBK");
				sHtmlText.put("partnerID", BasicConfig.partnerID);// 用户ID号后续会将其用MD5签名的字符串一起提交过去
				sHtmlText.put("trade_code", BasicConfig.trade_code);// 对应支付平台的E0方法即进行收款
				// sHtmlText.put("verify_field", "");
				// sHtmlText.put("sign", "");
				sHtmlText.put("sign_type", BasicConfig.sign_type);
				sHtmlText.put("inpay_bankCode", null);
				sHtmlText.put("inpay_order_bankCode", null);
				sHtmlText.put("PayChannel", PayChannel);
				sHtmlText.put("alipay_userId", alipay_userId);
				sHtmlText.put("code", code);
				sHtmlText.put("key", BasicConfig.KEY);
				sHtmlText.put("partnerPwd", BasicConfig.partnerPwd);

				if (logger.isDebugEnabled()) {
					this.logger.info(new Date()
							+ " request gateway url for make bank form :"
							+ BasicConfig.alipay_gateway);
				}
				HttpURLConnection httpurlconnection = null;
				URL url = new URL(BasicConfig.alipay_gateway);
				httpurlconnection = (HttpURLConnection) url.openConnection();
				httpurlconnection.setUseCaches(false);
				httpurlconnection.setDefaultUseCaches(false);
				httpurlconnection.setDoOutput(true);
				httpurlconnection.setDoInput(true);
				httpurlconnection.setRequestMethod("POST");
				httpurlconnection.setRequestProperty("Host", url.getHost());
				httpurlconnection.setInstanceFollowRedirects(true);
				httpurlconnection.setConnectTimeout(60000);
				httpurlconnection.setReadTimeout(150000);
				httpurlconnection.setRequestProperty("Content-Type",
						"application/x-www-form-urlencoded");
				httpurlconnection.connect();
				DataOutputStream dos = new DataOutputStream(
						httpurlconnection.getOutputStream());
				StringBuffer sBuffer = new StringBuffer();
				for (Map.Entry<String, String> entry : sHtmlText.entrySet()) {
					sBuffer.append("&" + entry.getKey() + "="
							+ entry.getValue());
				}
				String string = sBuffer.toString();
				String s = string.substring(1, string.length());
				dos.writeBytes(s);
				dos.flush();
				dos.close();
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(
								httpurlconnection.getInputStream()));
				String line;
				String info = "";
				while ((line = reader.readLine()) != null) {
					info += line;
				}

				String message = DES.des_descrypt(BasicConfig.KEY, info);
				if (logger.isDebugEnabled()) {
					this.logger.info("paystation 返回结果:====" + message);
				}

				int i = message.lastIndexOf("|");
				String ms = message.substring(i + 1, message.length());
				String mm = message.substring(0, i);
				if (Arrays.asList(BasicConfig.GBK_CHARSET_BANK).contains(
						"ALIPAY".toUpperCase())) {
					response.setContentType("text/html; charset=gbk");
				} else {
					response.setContentType("text/html; charset=utf-8");
				}
				StringBuffer messages = new StringBuffer();
				if ("000000".equals(mm)) {
					if (logger.isDebugEnabled()) {
						this.logger.info("result:"
								+ ResultPageUtils.createBankLinkPage(ms));
					}

					messages.append(ResultPageUtils.createBankLinkPage(ms));
					PrintWriter out = response.getWriter(); // 应永安要求修改返回页面
					out.print(messages.toString()); // 应永安要求修改返回页面
					reader.close();

				} else if ("888888".equals(mm)) {
					if (logger.isDebugEnabled()) {
						this.logger.info("result:" + ms);
					}
					response.setContentType("text/html;charset=UTF-8");
					response.getWriter().write(ms);// 直接将完整的表单html输出到页面
					response.getWriter().flush();
					response.getWriter().close();

				} else {
					if (logger.isDebugEnabled()) {
						this.logger.error("result:"
								+ ResultPageUtils.createErrorPage(ms));
					}
					messages.append(ResultPageUtils.createErrorPage(ms));
					request.setAttribute("success", "0");
					request.setAttribute("message", ms);
					request.getRequestDispatcher("/process.jsp").forward(
							request, response);// 跳转到多选页面
				}
				httpurlconnection.disconnect();
			} else {
				errormessage = Basic2Config.errorInfo("F01001",
						"支付宝授权调usrid失败", orderId, "");
				StringBuffer messages = new StringBuffer();
				messages.append(ResultPageUtils.createErrorPage(errormessage));
				request.setAttribute("message", errormessage);
				request.setAttribute("success", "0");
				request.getRequestDispatcher("/process.jsp").forward(request,
						response);// 跳转到多选页面
			}
		} catch (Exception e) {
			logger.info("支付宝用户授权错误信息---------" + e.getMessage());
			String msg = "";
			if (e.getMessage() != null && !"".equals(e.getMessage()))
				msg = e.getMessage();
			else
				msg = Basic2Config.F01001;

			String message = errormessage = Basic2Config.errorInfo("F01001",
					msg, orderId, "");
			request.setAttribute("message", message);
			request.setAttribute("success", "0");
			request.getRequestDispatcher("/process.jsp").forward(request,response);// 跳转到多选页面
		}
		logger.info("alipayaccreditservlet end <<<<<<<<<<<<<<<<<<<<");
	}
*/


	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,
				config.getServletContext());

	}
/*
	作者：师襄
	链接：https://www.jianshu.com/p/70447d6c6ff5
	来源：简书
	著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
	*/
}
