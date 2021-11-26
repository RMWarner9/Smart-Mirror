package edu.mc3.cis.group.mirror.services;

import edu.mc3.cis.group.mirror.configs.NewsConfig;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class NewsService {

    private String helloWorld = "Hello, ";

    @Autowired
    NewsConfig config;

    public String getHello()
    {
        return helloWorld + config.getExampleName();
    }

    public ExampleResult getResult(int x, int y)
    {
        return new ExampleResult(x,y);
    }
}
