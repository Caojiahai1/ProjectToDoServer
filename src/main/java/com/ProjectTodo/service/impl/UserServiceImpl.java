package com.ProjectTodo.service.impl;

import com.ProjectTodo.dao.UserDao;
import com.ProjectTodo.dao.UserLoginLogDao;
import com.ProjectTodo.entry.User;
import com.ProjectTodo.entry.UserLoginLog;
import com.ProjectTodo.service.UserService;
import com.ProjectTodo.utils.Result;
import com.ProjectTodo.utils.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private UserLoginLogDao userLoginLogDao;

    @Override
    @Transactional
    public Result userOnline(User user) {
        if (user.getSignature() == null || "".equals(user.getSignature())) {
            return ResultGenerator.fail("用户签名为空");
        }
        Long userId = userDao.getIdBySignature(user.getSignature());
        if (userId ==null || userId == 0) {
            userDao.Insert(user);
            userId = user.getId();
        }
        // 插入上线日志

        UserLoginLog userLoginLog = new UserLoginLog();
        userLoginLog.setUserId(userId);
        userLoginLog.setLoginIp("");
        userLoginLog.setLoginTime(new Date());
        userLoginLogDao.Insert(userLoginLog);
        return ResultGenerator.success();
    }
}