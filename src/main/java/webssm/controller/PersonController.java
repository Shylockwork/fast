package webssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/persons")
public class PersonController { //implements Controller
//    @Override
//    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
//
//        String viewName = "user/showUser";
//
//        ModelAndView mav = new ModelAndView();
//        mav.addObject("users","person");
//        mav.setViewName(viewName);
//        return mav;
//    }

    @RequestMapping(method=RequestMethod.GET)
    @ResponseBody
    public Map findPerson(){
        Map map = new HashMap();
        map.put("str", "abc");
        return map;
    }


}
