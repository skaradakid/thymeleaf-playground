package net.javathymeleaf.thymeleaf_tutorial.controller;

import net.javathymeleaf.thymeleaf_tutorial.model.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.model.IModel;

import java.sql.Struct;
import java.util.Arrays;
import java.util.List;

@Controller
public class formController {

//    handler method to handle user registration page request
    @GetMapping("register")
    public String userRegistrationPage(Model model){
        // Empty UserForm model object to store form data
        UserForm userForm =  new UserForm();
        model.addAttribute("userForm", userForm);
        List<String> listProfession = Arrays.asList("Developer", "Tester", "Architect");
        model.addAttribute("ListProfession", listProfession);
        return "register-form";
    }
}
