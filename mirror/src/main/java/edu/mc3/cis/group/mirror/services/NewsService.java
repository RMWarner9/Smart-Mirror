package edu.mc3.cis.group.mirror.services;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.mc3.cis.group.mirror.configs.NewsConfig;
import edu.mc3.cis.group.mirror.exceptions.MagicMirrorException;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.models.News;
import edu.mc3.cis.group.mirror.models.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;


/**
 * NewsService is a Service class that returns the news articles from the newsapi URL
 * It also contains examples of how the program works.
 */
@Service
public class NewsService {

    private final String helloWorld = "Hello, ";

    @Autowired
    NewsConfig config;

    /**
     * getHello method is a method that is an example of how to use the config classes
     * @return
     */
    public String getHello() {
        return helloWorld + config.getExampleName();
    }

    /**
     * getResult is an example of learning how to pass objects to the controller
     * @param x int first number to be multiplied
     * @param y int second number to be multiplied
     * @return ExampleResult(x,y)
     */
    public ExampleResult getResult(int x, int y) {
        return new ExampleResult(x, y);
    }

    /**
     * getNews is a method that returns all of the articles returned from the news api
     * @return News object
     */
    public News getNews() {
        News news = new News();

        try{


            news = mapNewsObject();

            System.out.println(news);
            return news;

        }catch (Exception e)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(),"News Object not properly mapped");
        }
    }

    public ArrayList<Result> top10Results()
    {
        News news;
        ArrayList<Result> top10Results = new ArrayList<Result>(10);
        try{

            news = mapNewsObject();

            for(int i = 0; i < 10; i++){
                top10Results.add(news.getResults().get(i));
            }
            System.out.println(news);

        }catch (Exception e)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(),"News Object not properly mapped");
        }

       return top10Results;
    }

    public ArrayList<Result> getTopNArticles(int numberOfArticles)
    {
        News news;
        ArrayList<Result> topNResults = new ArrayList<Result>(numberOfArticles);
        try{

            news = mapNewsObject();

            for(int i = 0; i < numberOfArticles; i++){
                topNResults.add(news.getResults().get(i));
            }
            System.out.println(news);

        }catch (Exception e)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(),"News Object not properly mapped");
        }

        return topNResults;
    }


    public int maxResults() throws IOException {
        try {
            News news = mapNewsObject();
            return news.getTotalResults();
        }catch (IOException e)
        {
            throw new MagicMirrorException(HttpStatus.INTERNAL_SERVER_ERROR, new Throwable().getCause(), "News object not properly mapped");
        }

    }

    private News mapNewsObject() throws IOException {
        News news = new News();
        ObjectMapper om = new ObjectMapper();
        news = om.readValue(new URL(config.getNewsAPIUrl().toString()), News.class);
        return news;
    }

}

