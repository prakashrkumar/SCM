package com.scm.prakash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller 
public class PageController {

     @RequestMapping("/home")
    public String home(Model model){
        System.out.println("test chal rahah hai");
     

        return "home";
    }
    // about 
    @RequestMapping("/about")
    public  String aboutPage(){
        System.out.println("About page per aa gaya hai kay");
        return "about";
    }
    // service
    @RequestMapping("/service")
    public  String service(){
        System.out.println("service oage per aa gaya hai kay");
        return "service";
    }
    // contact
    @RequestMapping("/contact")
    public  String contact(){
        System.out.println("contact page oage per aa gaya hai kay");
        return  new String("contact");
    }

    @RequestMapping("/login")
    public  String login(@RequestParam String param){
        System.out.println("Login page per aa gaya hai kay");
        return new String("login");
    }

      //login
    @RequestMapping("/register")
    public  String register(){
        System.out.println("Login page per aa gaya hai kay");
        return "register";
    }

    

}
