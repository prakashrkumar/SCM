package com.scm.prakash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
