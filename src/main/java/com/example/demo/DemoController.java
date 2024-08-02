package com.example.demo;

import com.example.demo.temp.TempComponent;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
    private TempComponent tempComponent = new TempComponent();

//    public DemoController(TempComponent tempComponent) {
//        this.tempComponent = tempComponent;
//
//    }

    @RequestMapping("home")
    public String home(Model model) {
        model.addAttribute("message", "Hello Thymeleaf!!!");
        model.addAttribute("name", "Haeun");
        model.addAttribute("year", 2024);
        model.addAttribute("student", new Student("Alex","alex@gmail.com"));
        return "home.html";
    }

    @RequestMapping("profile")
    public String profile(){
        return "profile.html";
    }
    @RequestMapping("address")
    public String address(){
        return "address.html";
    }


}
