package com.projectTodo.service;

import com.projectTodo.entry.User;
import com.projectTodo.utils.Result;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
public interface UserService {
    Result userOnline(User user);
}