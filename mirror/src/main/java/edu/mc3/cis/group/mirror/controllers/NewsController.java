package edu.mc3.cis.group.mirror.controllers;

import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.models.News;
import edu.mc3.cis.group.mirror.models.Result;
import edu.mc3.cis.group.mirror.services.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * NewsController is a class that is a REST Api controller that is used to return JSON objects
 */
@RestController
@RequestMapping("news")
public class NewsController{

    @Autowired
    private NewsService service;

    /**
     * getHello is a method that demonstrates how to use the NewsService object to return Strings as JSON
     * @return String to be made JSON
     */
    @GetMapping(path = "/hello", produces = "application/json")
    public String getHello() {
        return service.getHello();
    }

    /**
     * getResult is a method that demonstrates how to make requests with parameters in the query string
     * @param x int x number to be multiplied
     * @param y int y number to be multiplied
     * @return ExampleResult object
     */
    @GetMapping(path ="/multiply/{x}/{y}", produces = "application/json")
    public ExampleResult getResult(
            @PathVariable int x,
            @PathVariable int y
    )
    {
        return service.getResult(x,y);
    }

    /**
     * getNews is a method that returns the articles from the NewsService object
     * @return News object populated with articles
     */
    @GetMapping(path = "/articles", produces = "application/json")
    public News getNews() {
        return service.getNews();
    }

    /**
     * getTop10Results returns the top 10 news articles
     * @return  top 10 results
     */
    @GetMapping(path = "/top10", produces = "application/json")
    public ArrayList<Result> getTop10Results()
    {
        return service.top10Results();
    }

    /**
     * getTopNResults returns as many specified results as the user requests
     * @param resultsToReturn
     * @return
     */
    @GetMapping(path = "top/{resultsToReturn}", produces = "application/json")
    public ArrayList<Result> getTopNResults(
            @PathVariable int resultsToReturn
    )
    {
        if(resultsToReturn > getNews().getTotalResults())
        {
            throw new MagicMirrorException(HttpStatus.BAD_REQUEST, new Throwable().getCause(), "Invalid entry");
        }
        else {
            return service.getTopNArticles(resultsToReturn);
        }
    }

}
