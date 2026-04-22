package Alutsiv.first_java_project_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @GetMapping (value = "/")
    public String hello(){
        return "Hello World, in my first controller!";
    }

    @GetMapping (value = "/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }
//http://localhost:8080/greeting?name=Vistula
}
