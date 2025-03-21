package com.saurabhtech.learn_spring_boot.revision;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/revision")
@Controller
public class RevisionController {

    @GetMapping("/love-you-text")
    @ResponseBody
    public String returnLoveYou(){
        return "I Love You";
    }

    @GetMapping("love-you-html")
    @ResponseBody
    public String loveYouFromHtml(){
        StringBuilder sb = new StringBuilder();
        sb.append("<html lang=\"en\">");
        sb.append("<head>");
        sb.append("<title>Document</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("I Love You text from html page");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @GetMapping("/love-you-jsp")
    public String loveYouJsp(@RequestParam String name,@RequestParam int age, ModelMap modelMap){
        modelMap.put("username",name);
        modelMap.put("userage",age);
        return "loveyou";
    }
}
