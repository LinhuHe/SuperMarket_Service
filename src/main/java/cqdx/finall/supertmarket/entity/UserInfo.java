package cqdx.finall.supertmarket.entity;

public class UserInfo {
    private String userId;

    private String userNickname;

    private Integer userSex;

    private Integer isShoper;

    private String userIpaddr;

    private String userPortrait;

    public UserInfo(){}

    public UserInfo(String userId, String userNickname, Integer userSex, String userIpaddr, String userPortrait) {
        this.userId = userId;
        this.userNickname = userNickname;
        this.userSex = userSex;
        this.isShoper = 0;
        this.userIpaddr = userIpaddr;
        this.userPortrait = userPortrait;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getIsShoper() {
        return isShoper;
    }

    public void setIsShoper(Integer isShoper) {
        this.isShoper = isShoper;
    }

    public String getUserIpaddr() {
        return userIpaddr;
    }

    public void setUserIpaddr(String userIpaddr) {
        this.userIpaddr = userIpaddr;
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait;
    }
}