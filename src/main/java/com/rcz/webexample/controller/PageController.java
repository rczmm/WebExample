package com.rcz.webexample.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin
@Schema(description = "页面跳转")
@RequestMapping("page")
public class PageController {


    @GetMapping("user")
    public String index() {
        return "user";
    }

}
