package com.projectTodo.controller;

import com.projectTodo.entry.User;
import com.projectTodo.service.UserService;
import com.projectTodo.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yan liang
 * @create 2019/9/28
 * @since 1.0.0
 */
@RestController
@RequestMapping("/User")
//@ApiIgnore
@Api(tags = "用户管理", description = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/onLine")
    @ApiOperation(value = "用户上线(用户不存在，会新增用户，记录上线日志)")
    public Result userOnline(@RequestBody User user) {
        return userService.userOnline(user);
    }
}