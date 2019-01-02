package webssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import webssm.bean.Person;
import webssm.bean.Teacher;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("async")
public class AsyncController {
    @RequestMapping("/showAsync")
    public String showAsync(){
        return "async/async";
    }

    @RequestMapping("/showAsync2")
    public String showAsync2(){
        return "async/async2";
    }

    @RequestMapping("/ajax.async")
    @ResponseBody
    public Teacher ajaxAsync(@RequestBody Teacher teacher){
        return teacher;
    }

    @RequestMapping("/ajax.async2")
    @ResponseBody
    public List<Person> ajaxAsync2(@RequestBody Person person){
        Person person1 = new Person();
        person1.setPersonId(2);
        person1.setPersonName("老关");
        person1.setPersonGender("man");
        List<Person> list = new ArrayList<>();
        list.add(person);
        list.add(person1);
        return list;
    }

    @RequestMapping(value = "/ajax.async3" ,method = RequestMethod.PUT)
    @ResponseBody
    public Person ajaxAsync3(Person person){
        System.out.println(person);
        return person;
    }
}
