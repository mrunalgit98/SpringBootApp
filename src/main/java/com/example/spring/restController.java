package com.example.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController

public class restController {
//    @RequestMapping("/hello")
//
//    public String HelloWorld(){
//        return "hello from bridgelabz";
//    }
    /*using-http://localhost:8081/hello/query?name= mrunal*/
    @RequestMapping(value = {"/query"},method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name")String Name){
        return "Hello " + Name+ " from BridgeLabs.";
    }
    @RequestMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name){
        return "Hello"+name+ " from BridgeLabs.";
    }
    @PostMapping ("/post")
    public String sayHello(@RequestBody User u){
        return "Hello"+u.getFirstName()+" "+u.getLastName()+ " from BridgeLabs.";
    }
    @PutMapping("/put/firstName")
    public String sayHello1(@PathVariable String firstName,@RequestParam(value = "lastName")String lastName){
        return "hello " + firstName + " " + lastName ;
    }
    }

