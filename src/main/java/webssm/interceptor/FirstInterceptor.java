package webssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstInterceptor implements HandlerInterceptor {

    /*
    * preHandle:在请求到达后端控制器方法之前执行
    * 在Controller方法执行之前执行此方法
    * 此方法起到拦截功能: 在返回值为true时放行,反之拦截
    * */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        System.out.println("pre.........Handler..............");
//  String url = request.getRequestURL().toString();
//        if(url.indexOf("5000")!=-1){
//            return false;
//        }
        return true;
    }
    /*
    * postHandle:在Controller的方法执行之后  在ModelAndView返回给适配器之前执行
    * 利用此方法可以改变ModelAndView模型数据
    * */
    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        System.out.println("post.........Handler..............");
    }
    /*
    * afterCompletion:在Controller方法相当于finally
    * */
    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("after.........Completion..............");
    }
}
