package com.javatechie.springsecurityoauthsso.controller;

import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class AppController {

    @GetMapping("/")
    public String echoMessage(Principal principal) {
        return "Welcome to java techie "+principal.getName();
    }

}
