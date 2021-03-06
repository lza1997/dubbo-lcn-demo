package com.demo.controller;

import com.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lorne on 2017/7/6.
 */
@Controller
public class TestController {


    @Autowired
    private TestService testService;

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model){
        model.addAttribute("info",testService.hello());
        return "index";
    }
}
