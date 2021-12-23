package com.example.demo.web;

import com.example.demo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final PersonService personService;

    public HomeController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public String viewHomePage() {
        return "homePage";
    }

    @PostMapping("/create")
    public String createPerson(@RequestParam String username, @RequestParam String password) {
        personService.createPerson(username, password);
        return "redirect:/home";
    }
}
