package com.projectTodo.entry;

import com.projectTodo.utils.DateHelp;

import java.util.Date;

/**
 * @author Yan liang
 * @create 2019/10/10
 * @since 1.0.0
 */
public class UserTask {

    public UserTask() {
        setTitle("");
        setContent("");
        setPriority(0);
        setPercent(0.0);
        setExpirationTime(DateHelp.getDefaultDate());
        setFinishTime(DateHelp.getDefaultDate());
        setCreateTime(new Date());
    }

    private Long id;
    private Long userId;
    private String title;
    private String content;
    private Integer priority;
    private Double percent;
    private Boolean finished;
    private Boolean deleted;
    private Date expirationTime;
    private Date finishTime;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Double getPercent() {
        return percent;
    }

    public void setPercent(Double percent) {
        this.percent = percent;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(Date expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
