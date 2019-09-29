package com.projectTodo.service.impl;

import com.projectTodo.dao.UserDao;
import com.projectTodo.dao.UserLoginLogDao;
import com.projectTodo.entry.User;
import com.projectTodo.entry.UserLoginLog;
import com.projectTodo.service.UserService;
import com.projectTodo.utils.Result;
import com.projectTodo.utils.ResultGenerator;
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