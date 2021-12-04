package demo.vulnerableapp.demovulnerableapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("eventName", "this is the event name");
        return "index";
    }

    
}