package edu.mc3.cis.group.mirror.controllers;

import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//RestControllerAnnotation is the Annotation to indicate that this controller will be performing RESTful web services.
//RequestMapping requests the mapping of the web request in this controller that we used
@RestController
@RequestMapping("news")
public class NewsController{


    @Autowired
    private NewsService service;


    @GetMapping(path = "/hello", produces = "application/json")
    public String getHello() {
        return service.getHello();
    }

    @GetMapping(path ="/multiply/{x}/{y}", produces = "application/json")
    public ExampleResult getResult(
            @PathVariable int x,
            @PathVariable int y
    )
    {
        return service.getResult(x,y);
    }
}
