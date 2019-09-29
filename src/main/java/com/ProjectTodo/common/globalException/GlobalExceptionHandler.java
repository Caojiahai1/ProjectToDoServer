package com.ProjectTodo.common.globalException;

import com.ProjectTodo.utils.Result;
import com.ProjectTodo.utils.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public Result handleException(Exception e, HttpServletRequest request){
        Result result = ResultGenerator.fail("请求异常：" + e.getMessage());
        logger.error("请求异常：" + e.getMessage(), e);
        //使用HttpServletRequest中的header检测请求是否为ajax, 如果是ajax则返回json, 如果为非ajax则返回view(即ModelAndView)
//        String contentTypeHeader = request.getHeader("Content-Type");
//        String acceptHeader = request.getHeader("Accept");
//        String xRequestedWith = request.getHeader("X-Requested-With");
//        if ((contentTypeHeader != null && contentTypeHeader.contains("application/json"))
//                || (acceptHeader != null && acceptHeader.contains("application/json"))
//                || "XMLHttpRequest".equalsIgnoreCase(xRequestedWith)) {
//            return result;
//        }
        return result;
    }
}