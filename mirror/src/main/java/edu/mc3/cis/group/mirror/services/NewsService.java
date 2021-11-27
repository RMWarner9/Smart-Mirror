package edu.mc3.cis.group.mirror.services;

import edu.mc3.cis.group.mirror.configs.NewsConfig;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


//labels the class as an interface that stands alone in the model with no encapsulation
@Service
public class NewsService {

    @Autowired
    NewsConfig config;

    public String getHello()
    {
        String helloWorld = "Hello, ";
        return helloWorld + config.getExampleName();
    }

    public ExampleResult getResult(int x, int y)
    {
        return new ExampleResult(x,y);
    }
}
