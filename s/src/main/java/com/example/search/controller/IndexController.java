package com.example.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"/index"})
public class IndexController {

    @RequestMapping(value = {"/hello"})
    public String hello(){
        return "index";
    }
}
