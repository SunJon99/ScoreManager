package com.sunjon.ScoreManager.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@Component
public class AdminInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Integer type = (Integer) request.getSession().
                getAttribute("type");
        if(type == null){
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out=response.getWriter();
            out.print("<script>alert('您还未登录，即将跳转到登陆界面!');" +
                    "window.location='/login';</script>");
            return false;
        }
        if(type == 1){
            return true;
        }
        return false;
    }
}
