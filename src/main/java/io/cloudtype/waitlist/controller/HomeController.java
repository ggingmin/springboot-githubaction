package io.cloudtype.waitlist.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*")
@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){

        return "index.html";
    }
}
