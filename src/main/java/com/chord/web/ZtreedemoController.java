package com.chord.web;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.chord.entity.Users;
import com.chord.entity.Ztreedemo;
import com.chord.mapper.ZtreedemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lena
 * @since 2019-03-23
 */
@Controller
public class ZtreedemoController {

    @RequestMapping("/")
    public String gethome(){
        return "index";
    }

    @RequestMapping("/index1")
    public String getindex1(){
        return "index1";
    }


    @RequestMapping("/registerpage")
    public String getregisterpage(){
        return "formdemo";
    }

    @RequestMapping("/register")
    @ResponseBody
    public HashMap<String,Object> getregister(Users users){
        HashMap<String,Object> resp=new HashMap<>();
        System.out.println(users.getUsername());
        System.out.println(",,,,,,,,,,,,,");
        System.out.println(users);
        if (users==null){
            resp.put("err",false);
        }else {
            resp.put("stuats",true);
            resp.put("data", users);
        }
        return resp;
    }

    @Autowired
    private ZtreedemoMapper ztreedemoMapper;

    @RequestMapping("gettree")
   @ResponseBody
    public List<Ztreedemo> getIndex(Integer id, HttpServletRequest request, Model model){
        //System.out.println(id);
        String pid = request.getParameter("id");
        System.out.println(pid);
        if(pid==null){
            pid=0+"";
        }
        Integer pid1=Integer.parseInt(pid);
        List<Ztreedemo> ztreedemos = ztreedemoMapper.selectList(new EntityWrapper<Ztreedemo>()
                .eq("pid",pid1));

      ztreedemos.forEach(ztreedemo -> System.out.println(ztreedemo.getIsParent()));
        return ztreedemos;
    }

}

