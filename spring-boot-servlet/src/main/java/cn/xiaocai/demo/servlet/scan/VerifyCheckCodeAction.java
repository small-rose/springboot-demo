package cn.xiaocai.demo.servlet.scan;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @program: springboot-servlet
 * @description
 * @function:
 * @author: zzy
 * @create: 2021-05-11 17:32
 **/
@WebServlet(name = "VerifyCheck", urlPatterns = "/verifyCheckCode")
public class VerifyCheckCodeAction extends HttpServlet {
    /**
     *
     */
    private static final long serialVersionUID = 1L;


    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)	throws IOException, ServletException {
        doPost(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        request.setCharacterEncoding("GBK") ;
        String checkCode = request.getParameter("checkCode");
        System.out.println("Response checkcode===="+checkCode);
        HttpSession session = request.getSession();
        StringBuffer messages = new StringBuffer();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html; charset=UTF-8");

        if("".equals(checkCode)||checkCode==null){
            messages.append("<script>alert('Illegal request 非法请求');</script>");
            out.print(messages.toString());
            out.close();

        }else if(!checkCode.equalsIgnoreCase((String)session.getAttribute("randCheckCode"))){
            messages.append("<script>alert('验证码不正确,请重新输入');</script>");
            out.print(messages.toString());
            out.close();
        }else{
            request.setCharacterEncoding("GBK");
            request.setAttribute("orderId", checkCode);
            request.getRequestDispatcher( "/login.do").forward(request,response);
        }
    }

}
