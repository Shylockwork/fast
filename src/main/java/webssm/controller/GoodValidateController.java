package webssm.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import webssm.bean.GoodValidate;

import java.util.List;

@Controller
@RequestMapping("/good")
public class GoodValidateController {


    @RequestMapping("/goodsShow.action")
    public String goodsShow(){
        return "goods/goodsSave";
    }

    //在方法中@Validated注解和BindingResult属性是成对出现的
    //每出现一个@Validated注解就必须添加一个BindingResult属性
    @RequestMapping("/goodsSave.action")
    public String goodsSave(@ModelAttribute("good")  @Validated GoodValidate good, BindingResult result){
        //框架会将校验的结果保存到BindingResult中,所以
        //可以从其中获取校验结果,实现判断 如果数据校验没有成功,说明数据是不合法的
        //给客户响应当前页面,同时可以考虑将客户添加的数据回显回来
        if(result.hasErrors()){
            //将所有的错误,每一个错误看做一个对象,将这些对象放入集合
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError oe:allErrors){
                System.out.println(oe.getDefaultMessage());
            }
//            model.addAttribute("good",good);
            return "goods/goodsSave";
        }
        //如果数据校验成功，说明数据时合法的，那么给客户响应
        //相关的后续操作页面
        System.out.println(123);
        return "main/main";
    }
}
