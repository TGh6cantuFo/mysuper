package com.st.controller;

import com.st.service.WxUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 查看上传日志控制类
 * Created by sxm on 2016/10/19.
 */
@Controller
public class IndexPageController {

    @Autowired
    WxUserService wxUserService;

    @RequestMapping("/index")
    public String gotoindex(){
        return "/index";
    }

    @RequestMapping("/")
    public ModelAndView mysuper(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("userList",wxUserService.getMessage());
        mav.setViewName("/maxin");
        return mav;
    }
}
