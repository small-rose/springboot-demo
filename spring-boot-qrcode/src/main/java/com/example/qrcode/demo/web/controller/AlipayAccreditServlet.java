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
			// ??????????????????code??????userid
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
				errormessage = "?????????????????????userid????????????";
				throw new Exception(errormessage);
			}
			
			if (responseToken != null && responseToken.isSuccess()) {
				alipay_userId = responseToken.getUserId();

				// ?????????:???gatweay??????Action(gateway????????????????????????????????????????????????)
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
				sHtmlText.put("partnerID", BasicConfig.partnerID);// ??????ID?????????????????????MD5????????????????????????????????????
				sHtmlText.put("trade_code", BasicConfig.trade_code);// ?????????????????????E0?????????????????????
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
					this.logger.info("paystation ????????????:====" + message);
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
					PrintWriter out = response.getWriter(); // ?????????????????????????????????
					out.print(messages.toString()); // ?????????????????????????????????
					reader.close();

				} else if ("888888".equals(mm)) {
					if (logger.isDebugEnabled()) {
						this.logger.info("result:" + ms);
					}
					response.setContentType("text/html;charset=UTF-8");
					response.getWriter().write(ms);// ????????????????????????html???????????????
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
							request, response);// ?????????????????????
				}
				httpurlconnection.disconnect();
			} else {
				errormessage = Basic2Config.errorInfo("F01001",
						"??????????????????usrid??????", orderId, "");
				StringBuffer messages = new StringBuffer();
				messages.append(ResultPageUtils.createErrorPage(errormessage));
				request.setAttribute("message", errormessage);
				request.setAttribute("success", "0");
				request.getRequestDispatcher("/process.jsp").forward(request,
						response);// ?????????????????????
			}
		} catch (Exception e) {
			logger.info("?????????????????????????????????---------" + e.getMessage());
			String msg = "";
			if (e.getMessage() != null && !"".equals(e.getMessage()))
				msg = e.getMessage();
			else
				msg = Basic2Config.F01001;

			String message = errormessage = Basic2Config.errorInfo("F01001",
					msg, orderId, "");
			request.setAttribute("message", message);
			request.setAttribute("success", "0");
			request.getRequestDispatcher("/process.jsp").forward(request,response);// ?????????????????????
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
	???????????????
	?????????https://www.jianshu.com/p/70447d6c6ff5
	???????????????
	??????????????????????????????????????????????????????????????????????????????????????????????????????
	*/
}
