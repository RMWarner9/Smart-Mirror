package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kwabenaberko.newsapilib.models.Article;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;

import java.util.Date;
import java.util.List;
/**
* Let's get roight into the news!!
 * For our first story, Matt has announced that he's going to start commenting
 * on the file ASAP
*/
public class News extends ArticleResponse {


    public News()
    {
        super();
    }
    @JsonProperty("Status")
    public String status;
    @JsonProperty("TotalResults")
    public int totalResults;
    @JsonProperty("Articles")
    public List<Article> articles;
}



