package web.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.ssm.service.UserLoginService;
import web.ssm.vo.ResultInfo;

import javax.servlet.http.HttpSession;

/**
 * Created by 14999 on 2017/11/4.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("loginpage")
    public String loginPage(){
        return "loginPage";
    }

    @RequestMapping("login")
    public String userLogin(String userName, String userPwd, Model model, HttpSession session){
        ResultInfo resultInfo = userLoginService.userLogin(userName,userPwd);
        if(resultInfo.getResultCode() == 200){
            session.setAttribute("userName",userName);
            return "file";
        }else{
            model.addAttribute("message",resultInfo.getResultMessage());
            return "loginPage";
        }
    }
}
