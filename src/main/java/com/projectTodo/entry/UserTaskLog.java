package com.projectTodo.entry;

import java.util.Date;

/**
 * @author Yan liang
 * @create 2019/10/10
 * @since 1.0.0
 */
public class UserTaskLog {

    public UserTaskLog() {
        setOperation("");
        setDescription("");
        setCreateTime(new Date());
    }

    private Long id;
    private Long taskId;
    private Long userId;
    private String operation;
    private String description;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
