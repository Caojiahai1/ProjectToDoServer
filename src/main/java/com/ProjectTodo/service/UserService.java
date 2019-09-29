package com.ProjectTodo.service;

import com.ProjectTodo.entry.User;
import com.ProjectTodo.utils.Result;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
public interface UserService {
    Result userOnline(User user);
}