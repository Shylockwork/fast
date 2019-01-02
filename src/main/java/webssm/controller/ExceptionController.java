package webssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import webssm.service.ExSer;

@Controller
public class ExceptionController {
    @RequestMapping("/myex")
    public void throwEx() throws Exception {
    new ExSer().throwMyExSer();
    }
}
