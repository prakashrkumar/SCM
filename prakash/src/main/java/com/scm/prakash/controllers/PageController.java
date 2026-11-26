package com.scm.prakash.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.scm.prakash.entities.User;
import com.scm.prakash.forms.UserForm;
import com.scm.prakash.helpers.Message;
import com.scm.prakash.helpers.MessageType;
import com.scm.prakash.services.UserService;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
@Controller 
public class PageController {
    @Autowired 
    private UserService userService;

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
    @RequestMapping("/services")
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
    public  String register(Model  model){
      UserForm userForm=new UserForm();
      //if you want send default data
      model.addAttribute("userForm",userForm);

        return "register";
    }

    // processing register
    @RequestMapping(value = "/do-register", method = RequestMethod.POST)
    // error message ke liye HttpSession addd kaiye
    public  String processRegister(@Valid @ModelAttribute  UserForm userForm,BindingResult rBindingResult ,HttpSession session){
        System.out.println("Processing registration");
        // fetch form data
        //UserForm
        System.out.println(userForm);
        // validate form data

 if(rBindingResult.hasErrors()){
    return "register";
 }

        //TODO: Validate userForm(Next Video)


        // save to database


        // userservice
        //userForm ->user
        // User user=User.builder()
        // .name(userForm.getName())
        // .email(userForm.getEmail())
        // .password(userForm.getPassword())
        // .phoneNumber(userForm.getPhoneNumber())
        // .about(userForm.getAbout())
        // .profilePic(null)
        // .build();

        // use the method 
         User user=new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());
        user.setPassword(userForm.getPassword());
        user.setPhoneNumber(userForm.getPhoneNumber());
        user.setAbout(userForm.getAbout());
         user.setProfilePic(null);
       
       User saveUser= userService.saveUser(user);
       System.out.println("user saved:");



        //message="Registration Successful"

        // add the message:
     Message message=   Message.builder().content("Registration Successful").type(MessageType.green).build();
        session.setAttribute("message",message);



       // redirect to login page
        return "redirect:/register";
    }

    

}
