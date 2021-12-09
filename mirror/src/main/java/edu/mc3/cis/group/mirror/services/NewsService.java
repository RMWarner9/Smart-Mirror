package edu.mc3.cis.group.mirror.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.mc3.cis.group.mirror.configs.NewsConfig;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;

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
            news = om.readValue(new URL("https://newsdata.io/api/1/news?apikey=pub_2516ec7af3617bbefa1f732b3be5504e5d3e&language=en"), News.class);

            System.out.println(news);
            return news;


        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        return news;
    }

    public News getArticles() throws IOException {
        ObjectMapper om = new ObjectMapper();
        News.NewsRoot root = om.readValue(new File("news-json.json"), News.NewsRoot.class);
        System.out.println(root);

        return new News();
    }
}

