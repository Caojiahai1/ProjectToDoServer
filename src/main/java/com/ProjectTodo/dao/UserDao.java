package com.projectTodo.dao;

import com.projectTodo.entry.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
public interface UserDao {

    void Insert(User user);

    Long getIdBySignature(@Param("signature") String signature);
}