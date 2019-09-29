package com.projectTodo.controller;

import com.projectTodo.utils.Result;
import com.projectTodo.utils.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);
    @GetMapping("test")
    public Result test() {
        logger.error("test");
        int a = 1/0;
        return ResultGenerator.success(new Date());
    }
}