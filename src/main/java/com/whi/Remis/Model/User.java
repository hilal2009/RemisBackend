
package com.whi.Remis.Model;

public class User {
    private String userId;
    private String regDate;
    private String userName;
    private String gender;
    private String secName;

    public User(String userId, String regDate, String userName, String gender, String secName) {
        this.userId = userId;
        this.regDate = regDate;
        this.userName = userName;
        this.gender = gender;
        this.secName = secName;
    }

    public User() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }    
}
