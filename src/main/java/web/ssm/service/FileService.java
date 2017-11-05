package web.ssm.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 14999 on 2017/11/5.
 */
@Service
public class FileService {
    public Map<String,String> queryFile(String act, HttpServletResponse resp) {
        Map<String,String> map = new HashMap<String,String>();
        File file = new File(act);
        if(file.isDirectory()){
            File[] files = file.listFiles();
            for(int i = 0; i<files.length; i++){
                String str = files[i].toString();
                String key = str.substring(str.lastIndexOf("\\")+1);
                map.put(key,str.replace("\\","/"));
            }
            //日志记录

        }else{
            FileInputStream in = null;
            OutputStream out = null;
            try {
                resp.setHeader("content-disposition", "attachment;filename=" + URLEncoder.encode(act, "UTF-8"));
                in = new FileInputStream(file);
                out = resp.getOutputStream();
            }catch (Exception e){
                e.printStackTrace();
            }
            byte[] buffer = new byte[1024];
            int len = 0;
            try {
                while((len=in.read(buffer))>0){
                    out.write(buffer,0,len);
                }
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }
        return map;
    }
}
