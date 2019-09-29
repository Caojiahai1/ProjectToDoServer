package com.projectTodo.config;

import com.projectTodo.common.interceptor.UserInfoInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Autowired
    private UserInfoInterceptor userInfoInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        String[] excludePathPatterns = new String[]{"/User/**","/swagger-ui.html","/swagger-resources/**", "/v2/api-docs/**", "/webjars/**", "/error"};
        // 添加一个拦截器
        registry.addInterceptor(userInfoInterceptor).addPathPatterns("/**").excludePathPatterns(excludePathPatterns);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/webjars/**");
    }
}