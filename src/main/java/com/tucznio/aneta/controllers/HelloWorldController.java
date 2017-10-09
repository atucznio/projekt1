package com.tucznio.aneta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
        model.addAttribute("greeting", "Hello World from Spring 4 MVC");
        return "welcome";
    }

    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "welcome";
    }
    @RequestMapping(value = "/firstPage", method = RequestMethod.GET)
    public String sayHelloAgain2(HttpServletRequest request, ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        String firstName = request.getParameter("first_name");
        String lastName = request.getParameter("last_name");
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        int increaseCounter = DoSth.increaseCounter();
        model.addAttribute("increaseCounter", increaseCounter);
        return "refirectPage";
    }

}
