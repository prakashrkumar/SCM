package com.scm.prakash.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller 
public class PageController {

     @RequestMapping("/home")
    public String home(Model model){
        System.out.println("test chal rahah hai");
        model.addAttribute("name","prakash kumar");
        model.addAttribute("github","https://github.com/prakashrkumar");
        model.addAttribute("linkdin","https://www.linkedin.com/in/prakashfullstackdeveloper/");
        model.addAttribute("isLogin",false);

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
