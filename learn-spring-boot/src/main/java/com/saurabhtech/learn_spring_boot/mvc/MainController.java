package com.saurabhtech.learn_spring_boot.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/mvc-learn-controller")
public class MainController {

    // Let's create the method => returns "Hello World";
    @GetMapping("/hello-world")
    @ResponseBody   // This annotation allows to return the String else it expects us to return the view
    public String helloWorld(){
        return "Hello World";
    }

    // Let's create the method => returns html (Create html here itself)
    @GetMapping("/html-as-string")
    @ResponseBody
    public String returnHtmlAsString(){
        StringBuilder sb = new StringBuilder();
        sb.append("<html lang=\"en\">");
        sb.append("<head>");
        sb.append("<title>Document</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("<h1>My First Html Page</h1>");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }

    // Let's now return =>  View with "My first html view with jsp"
    @GetMapping("/first-jsp-view")
    public String returnView(){
        return "firstView"; // FirstView is the JSP file with prefix and suffix in application.properties
    }

    // Let's now return => View with name and age passed from the Request Param
    @GetMapping("/greet-and-return-age")
    public String greetAndReturnAge(@RequestParam String name, @RequestParam int age, ModelMap model){
        model.put("name",name.toUpperCase());
        model.put("age",age);
        return "greetAndReturnAge";
    }

}
