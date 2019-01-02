package webssm.controller;

import org.springframework.web.HttpRequestHandler;
import webssm.bean.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OffcnHelloController2 implements HttpRequestHandler {
    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Users u1 = new Users();
        u1.setUname("shylock");
        u1.setUpassword("love");
        u1.setUid(1);
        u1.setPrivilege("package");
        //-------------------------
        Users u2 = new Users();
        u2.setUname("fuck");
        u2.setUpassword("you");
        u2.setUid(1);
        u2.setPrivilege("1314");

        //准备视图名称
        String viewName = "/WEB-INF/jsps/user/userList.jsp";


        List<Users> list  = new ArrayList<>();
        list.add(u1);
        list.add(u2);

        request.setAttribute("users",list);

        request.getRequestDispatcher(viewName).forward(request,response);

    }
}
