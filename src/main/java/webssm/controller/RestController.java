package webssm.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import webssm.bean.Person;

@Controller
@RequestMapping("/users")
public class RestController {

    @RequestMapping("/show")
    public String show(){
        return "rest/rest";
    }


    @RequestMapping(value = "/{name}/orders/{money}")
    @ResponseBody
    public Person getNameAndSale(@PathVariable String name,@PathVariable int money){
        System.out.println(name);
        System.out.println(money);
        return null;
    }
    @RequestMapping(value = "/{ids}")
    @ResponseBody
    public Person getSaleList(@PathVariable int[] ids){
        for (int i : ids){
            System.out.println(i);
        }
        return null;
    }


}
