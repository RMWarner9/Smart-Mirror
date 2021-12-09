package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kwabenaberko.newsapilib.models.Article;
import com.kwabenaberko.newsapilib.models.response.ArticleResponse;

import java.util.Date;
import java.util.List;
//Commenting for testing purposes
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



