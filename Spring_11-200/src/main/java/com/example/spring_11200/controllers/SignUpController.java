package com.example.spring_11200.controllers;

import com.example.spring_11200.dto.UserForm;
import com.example.spring_11200.models.User;
import com.example.spring_11200.services.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    @Autowired
    private SignUpService signUpService;

    @GetMapping("/signUpPage")
    public String getSignUpPage(){
        return "sign_up_page";
    }
    @PostMapping("/signUp")
    public String signUp(UserForm form){
        signUpService.addUser(form);
        return "redirect:/signUpPage";
    }


}