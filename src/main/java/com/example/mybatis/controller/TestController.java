package com.example.mybatis.controller;


import com.example.mybatis.dto.TestDto;
import com.example.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value ="/test")
    public String test(Model model){
        TestDto selectname = testService.selectTest();
        model.addAttribute("selectname",selectname);

        return "test";
    }
}
