package com.projectTodo.common.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
@Component
public class UserInfoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        String uri = request.getRequestURI();
        String userInfo = request.getHeader("userId");
        if (userInfo == null) {
            response.setCharacterEncoding("utf-8");
            response.setStatus(500);
            response.getOutputStream().write("用户未注册".getBytes());
            response.getOutputStream().flush();
            return false;
        }
        return true;
    }
}