package web.ssm.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.ssm.dao.UserDao;
import web.ssm.vo.ResultInfo;
import web.ssm.vo.User;

/**
 * Created by 14999 on 2017/11/4.
 */
@Service
public class UserLoginService {
    @Autowired
    private UserDao userDao;


    public ResultInfo userLogin(String userName, String userPwd) {
        ResultInfo resultInfo = new ResultInfo();
        //参数校验org.apache.commons.lang3.StringUtils;
        if(StringUtils.isBlank(userName)){
            resultInfo.setResultCode(300);
            resultInfo.setResultMessage("请输入用户名");
            return resultInfo;
        }
        if(StringUtils.isBlank(userPwd)){
            resultInfo.setResultCode(300);
            resultInfo.setResultMessage("请输入密码");
            return resultInfo;
        }
        User user = userDao.findUserByUserName(userName);
        if(user == null){
            resultInfo = new ResultInfo("用户名或密码错误",300);
            return resultInfo;
        }
        if(!userPwd.equals(user.getUserPwd())){
            resultInfo = new ResultInfo("用户名或密码错误",300);
            return resultInfo;
        }
        resultInfo = new ResultInfo("用户登陆成功",200);
        return resultInfo;
    }
}
