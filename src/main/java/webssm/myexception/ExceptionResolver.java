package webssm.myexception;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class ExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception ex) {
        System.out.println(ex.getClass());
        if(!(ex instanceof  MyException)){
            ex = new MyException("请稍后");
        }
        ModelAndView mav = new ModelAndView();
        mav.setViewName("error/error");
        mav.addObject("msg",ex.getMessage());
        return mav;
    }
}

