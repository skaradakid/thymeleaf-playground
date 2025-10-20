package net.javathymeleaf.thymeleaf_tutorial.controller;

import net.javathymeleaf.thymeleaf_tutorial.model.User;
import org.springframework.objenesis.instantiator.sun.MagicInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    // handler method to handle fragment-expression request
    //http://localhost:8080/fragment-expression
    @GetMapping("fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    //http://localhost:8080/users
    @GetMapping("/users")
    public String users(Model model){
        User admin = new User("Admin", "adimin@gmail.com", "Admin", "Male");
        User karabo = new User("kb", "karabo@gmail.com", "User", "Male");
        User mabena = new User("shebe", "mabena@gmail.com", "groovist", "Male");
        List<User> users  = new ArrayList<>();
        users.add(admin);
        users.add(karabo);
        users.add(mabena);
        model.addAttribute("users", users);
        return "users";

    }
    @GetMapping("/if-unless")
    public String ifUnless(Model model){
        User admin = new User("Admin", "adimin@gmail.com", "Admin", "Male");
        User karabo = new User("kb", "karabo@gmail.com", "User", "Male");
        User mabena = new User("shebe", "mabena@gmail.com", "groovist", "Male");
        List<User> users  = new ArrayList<>();
        users.add(admin);
        users.add(karabo);
        users.add(mabena);
        model.addAttribute("users", users);
        return "if-unless";
    }
    @GetMapping("switch-case")
    public String switchCase(Model model){
        User user = new User("karabo", "karabo@gmail.com", "devOpp", "male");
        model.addAttribute("user", user);
        return "switch-case";
    }
}
