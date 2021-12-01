package edu.mc3.cis.group.mirror.services;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kwabenaberko.newsapilib.NewsApiClient;
import com.kwabenaberko.newsapilib.models.request.EverythingRequest;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;
import edu.mc3.cis.group.mirror.configs.NewsConfig;
import edu.mc3.cis.group.mirror.models.ExampleResult;
import edu.mc3.cis.group.mirror.models.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.DataInput;
import java.io.IOException;

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

    public News getNews() throws IOException {
        ObjectMapper om = new ObjectMapper();

        NewsApiClient newsApiClient = new NewsApiClient("d8834b34a69c48b9a6b2f139dde87232");
        final ArticleResponse[] baseResponse = new ArticleResponse[1];
         newsApiClient.getEverything(
                new EverythingRequest.Builder()
                        .q("trump")
                        //.page(3)
                        .build(),
                new NewsApiClient.ArticlesResponseCallback() {
                    @Override
                    public void onSuccess(ArticleResponse response) {
                        System.out.println(response);
                        baseResponse[0] = response;
                    }

                    @Override
                    public void onFailure(Throwable throwable) {
                        System.out.println(throwable.getMessage());
                    }
                }
        );

         System.out.println(baseResponse[0]);

        return new News();
    }
}
