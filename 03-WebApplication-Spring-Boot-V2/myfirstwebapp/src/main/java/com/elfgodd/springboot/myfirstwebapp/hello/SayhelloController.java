package com.elfgodd.springboot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 1. tell spring is a spring bean
@Controller
public class SayhelloController {
    //"say-hello" => "Hello! What are you learning today?"

    // url: say-hello
    @RequestMapping("say-hello")

    // adding the view
    @ResponseBody
    public String sayHello() {
        return "Hello! What are you learning today?";
    }
}
