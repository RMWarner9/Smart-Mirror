package edu.mc3.cis.group.mirror.controllers;

import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.models.News;
import edu.mc3.cis.group.mirror.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@RequestMapping("news")
public class NewsController{

    @Autowired
    private NewsService service;


    @GetMapping(path = "/hello", produces = "application/json")
    public String getHello(HttpServletResponse response) {
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

    @GetMapping(path = "/articles", produces = "application/json")
    public News getNews() {
        try {
            return service.getNews();
        }catch (IOException exception)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(), "Unable to retrieve News object");
        }
    }
}
