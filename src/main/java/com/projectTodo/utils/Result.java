package com.projectTodo.utils;

/**
 * 统一返回对象
 * @author Yan liang
 * @create 2019/9/28
 * @since 1.0.0
 */
public class Result<T> {
    private int resultCode;
    private String message;
    private T data;

    public Result(){

    }

    public Result(int resultCode, String message){
        this.resultCode = resultCode;
        this.message = message;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}