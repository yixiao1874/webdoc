package web.ssm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.ssm.service.FileService;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by 14999 on 2017/11/5.
 */
@Controller
@RequestMapping("file")
public class FileController {
    @Autowired
    private FileService fileService;

    @RequestMapping("list")
    public String listFile(String act, Model model, HttpServletResponse response){
        Map<String,String> fileList = fileService.queryFile(act,response);
        model.addAttribute("fileList",fileList);
        return "right";
    }
}
