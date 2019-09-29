package com.projectTodo.controller;

import com.projectTodo.utils.Result;
import com.projectTodo.utils.ResultGenerator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @author Yan liang
 * @create 2019/9/28
 * @since 1.0.0
 */
@RestController
@RequestMapping("/User")
@ApiIgnore
public class UserController {

    @PostMapping("/add")
    public Result addUser() {
        return ResultGenerator.success();
    }
}