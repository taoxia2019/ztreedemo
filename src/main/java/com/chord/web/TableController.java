package com.chord.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.chord.entity.LayuiResult;
import com.chord.entity.Ztreedemo;
import com.chord.mapper.ZtreedemoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TableController {

    @Autowired
    ZtreedemoMapper ztreedemoMapper;

    @RequestMapping("tolist")
    public String tolist(){
        return "list";
    }

    @RequestMapping("listdata")
    @ResponseBody
    public LayuiResult<Ztreedemo> getlist(Integer page,Integer limit,Ztreedemo ztreedemo){
        System.out.println(ztreedemo);
        LayuiResult<Ztreedemo> result=new LayuiResult<>();

            Page<Ztreedemo> page1 = new Page<>(page, limit);
            List<Ztreedemo> ztreedemos = ztreedemoMapper.selectPage(page1, null);
            result.setCode(0);
            result.setCount(ztreedemoMapper.selectCount(null));
            result.setMsg("");
            result.setData(ztreedemos);

        return result;
    }


}
