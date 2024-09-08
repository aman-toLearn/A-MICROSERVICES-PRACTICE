package com.aman.rest;

import com.aman.client.WelcomeApiClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetRestController {
    @Autowired
    private WelcomeApiClient welcomeApiClient;

    @GetMapping("/greet")
    public  String getGreetMsg(){

        String s = welcomeApiClient.invokeWelcomeMsg();

        return "Good Morning" + s;
    }
}
