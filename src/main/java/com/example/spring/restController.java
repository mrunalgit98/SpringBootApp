package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class restController {
    @RequestMapping("/hello")

    public String HelloWorld(){
        return "hello from bridgelabz";
    }


    }

