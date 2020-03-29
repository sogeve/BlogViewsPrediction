package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AddController {

    @RequestMapping("/i")
    public String add(){
        System.out.println("cokolwiek");
        return "index";
    }

}
