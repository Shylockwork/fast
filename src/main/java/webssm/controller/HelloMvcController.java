package webssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import webssm.bean.DepartmentPojo;
import webssm.bean.Users;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloMvcController  {
    @RequestMapping("/mvc")
    public String helloMvc(){
        return "home";
    }

    @RequestMapping("/conv")
    public String conv(@RequestParam("date") Date date){
        System.out.println(date);
        return "home";
    }

    @RequestMapping("/deptDelete")
    public void dept(DepartmentPojo dp){
        System.out.println("======从pojo封装类型中获取数据=====");
        System.out.println(dp.getDept().getDeptId()+"~~~~"+dp.getDept().getDeptName()+"~~~~"+dp.getDept().getDeptLocation());
    }
}






