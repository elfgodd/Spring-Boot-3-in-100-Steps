// package com.elfgodd.springboot.myfirstwebapp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController2 {

    private Logger logger = LoggerFactory.getLogger(getClass());
    // login => com.elfgodd.springboot.myfirstwebapp.login.LoginController => login.jsp

    // http://localhost:8080/login?name=Alberto
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, ModelMap model) {
        model.put("name", name);
        System.out.println("Request param is " + name); // Not recommended for production code
        logger.debug("Request param is {}", name);
        logger.info("I want this printed at info level");
        logger.warn("I want this printed at warn level");
        return "login";
    }
}
