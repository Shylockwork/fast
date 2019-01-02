package webssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webssm.bean.Msg;
import webssm.bean.Users;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/users")
public class UserLoginController {
    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    public Msg login(Users user, HttpSession session){
        System.out.println(user.getUname()+"--"+user.getUpassword());
        Msg msg = new Msg();
        msg.setState(400);
        msg.setMessage("用户名或者密码不正确");
        //页面传来登录信息，要进行登录校验
        if(user.getUname() != null && user.getUname().length() > 0 && user.getUpassword() != null && user.getUpassword().length() > 0){
            session.setAttribute("user", user);
            msg.setState(200);
            msg.setMessage("登录成功");
        }
        return msg;
    }
}
