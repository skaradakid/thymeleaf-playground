package net.javathymeleaf.thymeleaf_tutorial.controller;

import net.javathymeleaf.thymeleaf_tutorial.model.User;
import org.springframework.objenesis.instantiator.sun.MagicInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // handler method to handle variable-expression request
    //http://localhost:8080/variable-expression
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
     User user = new User("Karabo", "Kama@pha.com", "Back-end_dev", "Male");
     model.addAttribute("user", user);
     return "variable-expression";
    }

    // handler method to handle selection-expression request
    //http://localhost:8080/selection-expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model){
        User user = new User("mabena", "mabena@cr7.com", "dev_OPPs", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

    // handler method to handle message-expression request
    //http://localhost:8080/message-expression
    @GetMapping("message-expression")
    public String messageExpression(Model model){
        return "message-expression";
    }

    // handler method to handle link-expression request
    //http://localhost:8080/link-expression
    @GetMapping("link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id", "1");
        return "link-expression";
    }
}
