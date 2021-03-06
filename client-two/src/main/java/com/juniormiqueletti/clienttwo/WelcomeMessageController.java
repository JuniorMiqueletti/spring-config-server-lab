package com.juniormiqueletti.clienttwo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMessageController {

    @Autowired
    private Config config;

    @GetMapping("/")
    public String home() {
        return "<h1>" + config.getWelcomeMessage() + "</h1>";
    }
}
