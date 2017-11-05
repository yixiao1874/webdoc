package web.ssm.vo;

import java.io.Serializable;

/**
 * Created by 14999 on 2017/11/4.
 */
public class User implements Serializable{
    private String userName;
    private String userPwd;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
}
