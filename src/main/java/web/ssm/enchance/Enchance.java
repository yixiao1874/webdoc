package web.ssm.enchance;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Aspect
public class Enchance {

    @After(value="execution(* web.ssm.service.*.listFile(..))")
    public void after(){
        System.out.println("查看文件夹操作增强方法");
        String ip = "127.0.0.1";
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String action = "查看文件夹";
    }
}
