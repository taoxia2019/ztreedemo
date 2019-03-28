package com.chord.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UploadController {
    @RequestMapping("uploadpage")
    public String toupdatepage(){
        return "uploadpage";
    }

    @RequestMapping("upload")
    @ResponseBody
    public Map<String,String> toupdate(MultipartFile file) throws Exception{
        System.out.println(file.getOriginalFilename());
        file.transferTo(new File("d:/"+file.getOriginalFilename()));
        Map<String,String> map =new HashMap<>();
        map.put("msg",file.getOriginalFilename());
        return map;
    }
}
