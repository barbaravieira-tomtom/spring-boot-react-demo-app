package demo.vulnerableapp.demovulnerableapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("eventName", "this is the event name");
        return "index";
    }

    
}