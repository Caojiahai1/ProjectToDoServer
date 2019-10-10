package com.projectTodo.utils;

/**
 * @author Yan liang
 * @create 2019/10/10
 * @since 1.0.0
 */
public class IdGenerator {
    private static SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);

    public static Long nextId() {
        return idWorker.nextId();
    }
}
