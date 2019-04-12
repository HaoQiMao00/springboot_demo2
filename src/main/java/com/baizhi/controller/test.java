package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("test")
public class test {
    @ResponseBody
    @RequestMapping("test2")
    public String test(){
        return"quicklymake";
    }
}
