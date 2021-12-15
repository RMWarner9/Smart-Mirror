package edu.mc3.cis.group.mirror.controllers;

import edu.mc3.cis.group.mirror.models.Greetings;
import edu.mc3.cis.group.mirror.services.ClothingService;
import edu.mc3.cis.group.mirror.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GreetingsController is a controller that uses REST services in order to return a Greeting object
 */
@RestController
@RequestMapping("greetings")
public class GreetingsController {

    @Autowired
    GreetingService service;

    /**
     * getGreetings returns a greeting
     * @return Greeting
     */
    @GetMapping(path = "/getGreetings", produces = "application/json")
    public Greetings getGreetings(){

        return service.getGreeting();
    }
}
