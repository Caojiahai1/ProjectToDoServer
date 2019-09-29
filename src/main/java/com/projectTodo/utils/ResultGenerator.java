package com.projectTodo.utils;

/**
 * 返回结果生成器
 * @author Yan liang
 * @create 2019/9/28
 * @since 1.0.0
 */
public class ResultGenerator {
    private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
    private static final String DEFAULT_FAIL_MESSAGE = "FAIL";
    private static final int RESULT_CODE_SUCCESS = 200;
    private static final int RESULT_CODE_SERVER_ERROR = 500;

    public static Result success() {
        return new Result(RESULT_CODE_SUCCESS, DEFAULT_SUCCESS_MESSAGE);
    }

    public static Result success(String message) {
        return new Result(RESULT_CODE_SUCCESS, message);
    }

    public static Result success(Object data) {
        Result result = new Result(RESULT_CODE_SUCCESS, DEFAULT_SUCCESS_MESSAGE);
        result.setData(data);
        return result;
    }

    public static Result fail() {
        return new Result(RESULT_CODE_SERVER_ERROR, DEFAULT_FAIL_MESSAGE);
    }

    public static Result fail(String message) {
        return new Result(RESULT_CODE_SERVER_ERROR, message);
    }

    public static Result fail(String message, Object data) {
        Result result = new Result(RESULT_CODE_SERVER_ERROR, message);
        result.setData(data);
        return result;
    }
}