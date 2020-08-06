package com.example.daocloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MyController {

    @Autowired
    MyService myService;


    @RequestMapping("/")
    public String index() {
        return "Hello spring";
    }

    @RequestMapping("/add")
    public String add(int a, int b) {
        return myService.add(a, b) +"";
    }
}
