package com.ProjectTodo.controller;

import com.ProjectTodo.utils.Result;
import com.ProjectTodo.utils.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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
@Api(tags = "测试", description = "测试api")
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("test")
    @ApiOperation("test api")
    public Result test() {
        logger.error("test");
        int a = 1/0;
        return ResultGenerator.success(new Date());
    }
}