package edu.mc3.cis.group.mirror.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.mc3.cis.group.mirror.configs.NewsConfig;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

import java.io.IOException;
import java.net.URL;

@Service
public class NewsService {

    private String helloWorld = "Hello, ";

    @Autowired
    NewsConfig config;

    public String getHello() {
        return helloWorld + config.getExampleName();
    }

    public ExampleResult getResult(int x, int y) {
        return new ExampleResult(x, y);
    }

    public News getNews() throws IOException {
        News news = new News();

        try{

            ObjectMapper om = new ObjectMapper();
            news = om.readValue(new URL(config.getNewsAPIUrl().toString()), News.class);

            System.out.println(news);
            return news;

        }catch (Exception e)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(),"News Object not properly mapped");
        }

    }

}

