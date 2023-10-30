package marcelo.horn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/firstController")
public class FirstController {
    
    @GetMapping("/firstMethod")
    public String firstMethod() {
        return "My first method on REST API";
    }

}
