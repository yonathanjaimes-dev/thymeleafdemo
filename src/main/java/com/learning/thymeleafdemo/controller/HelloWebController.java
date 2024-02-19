package com.learning.thymeleafdemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWebController {

//    @RequestMapping("/showForm")
//    public String showForm(){
//        return "helloweb-form";
//    }

    @GetMapping("/showForm")
    public String showForm(){
        return "helloweb-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloweb";
    }

    @RequestMapping("/processFormVersionTwo")
    public String letsShoutDude(HttpServletRequest request, Model theModel){
        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Yo!" + theName;
        theModel.addAttribute("message",result);
        //System.out.println("name: "+theName);
        return "helloweb";
    }

//    @RequestMapping("/processFormVersionThree")
//    public String processFormVersionThree(@RequestParam("studentName") String theName, Model theModel){
////        String theName = request.getParameter("studentName");
//        theName = theName.toUpperCase();
//        String result = "Hey!" + theName;
//        theModel.addAttribute("message",result);
//        //System.out.println("name: "+theName);
//        return "helloweb";
//    }

    @PostMapping("/processFormVersionThree")
    public String processFormVersionThree(@RequestParam("studentName") String theName, Model theModel){
//        String theName = request.getParameter("studentName");
        theName = theName.toUpperCase();
        String result = "Hey!" + theName;
        theModel.addAttribute("message",result);
        //System.out.println("name: "+theName);
        return "helloweb";
    }

}
