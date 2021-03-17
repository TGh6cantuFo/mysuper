package com.st.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 查看上传日志控制类
 * Created by sxm on 2016/10/19.
 */
@Controller
public class IndexPageController {

    @RequestMapping("/index")
    public String gotoindex(){
        return "/index";
    }
}
