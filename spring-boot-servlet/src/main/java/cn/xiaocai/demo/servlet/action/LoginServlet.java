package cn.xiaocai.demo.servlet.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: springboot-servlet
 * @description
 * @function:  servlet
 * @author: zzy
 * @create: 2021-05-11 17:23
 **/
public class LoginServlet extends HttpServlet {
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
        request.setCharacterEncoding("UTF-8");
        //用户名
        String username = request.getParameter("username");
        //密码
        String password = request.getParameter("password");
        System.out.println("username = "+username);
        System.out.println("password = "+password);
        // TODO do your business


        request.getRequestDispatcher("/WEB-INF/jsp/success.jsp").forward(request,response);
    }
}
