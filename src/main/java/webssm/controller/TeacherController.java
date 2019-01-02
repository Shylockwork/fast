package webssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import webssm.bean.Teacher;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @RequestMapping("teacherShow")
    public String teacherShow(){
        return "teacher/teacherSave";
    }

    @RequestMapping("teacherSave")
    public String doTheacherSave(@Validated Teacher teacher, BindingResult result,Model model){
        model.addAttribute("teacher",teacher);
        if(result.hasErrors()){
            List<ObjectError> allErrors = result.getAllErrors();
           // System.out.println("toArray"+allErrors.toArray());
            System.out.println(allErrors.getClass().getName());

            model.addAttribute("errors",allErrors.toArray());
            for (ObjectError oe:allErrors){
                System.out.println(oe.getDefaultMessage());
            }
           // model.addAttribute("teacher",teacher);
            return "teacher/teacherSave";
        }
        System.out.println(123);
        return "main/main";
    }

}
