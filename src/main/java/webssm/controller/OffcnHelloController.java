package webssm.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import webssm.bean.Users;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class OffcnHelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
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
        String viewName = "user/userList";


        List<Users> list  = new ArrayList<>();
        list.add(u1);
        list.add(u2);

        ModelAndView mav = new ModelAndView();


        mav.addObject("users",list);
        mav.setViewName(viewName);

        //
        return mav;
    }
}
