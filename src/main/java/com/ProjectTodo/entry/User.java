package com.ProjectTodo.entry;

import java.util.Date;

/**
 * @author Yan liang
 * @create 2019/9/29
 * @since 1.0.0
 */
public class User {
    public User() {
        setNickName("");
        setGender(0);
        setProvince("");
        setCity("");
        setCountry("");
        setSignature("");
        setCreateTime(new Date());
    }

    private Long id;
    private String nickName;
    private Integer gender;
    private String province;
    private String city;
    private String country;
    private String signature;
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}