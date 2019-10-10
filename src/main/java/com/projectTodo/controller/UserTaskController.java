package com.projectTodo.controller;

import com.projectTodo.entry.UserTask;
import com.projectTodo.service.UserTaskService;
import com.projectTodo.utils.Result;
import com.projectTodo.utils.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan liang
 * @create 2019/10/10
 * @since 1.0.0
 */
@RestController
@RequestMapping("/UserTask")
@Api(tags = "用户任务")
public class UserTaskController {

    @Autowired
    private UserTaskService userTaskService;

    @PostMapping("/addTask")
    @ApiOperation(value = "添加用户任务")
    public Result addTask(@RequestBody UserTask userTask) {
        return ResultGenerator.success();
    }
}
