package nailSalon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/nailsalon")
public class MainController {
    @GetMapping
    public String getIndex(){
        return "index";
    }
}
