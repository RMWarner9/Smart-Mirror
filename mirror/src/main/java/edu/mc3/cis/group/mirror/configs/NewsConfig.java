package edu.mc3.cis.group.mirror.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

@Configuration
@ConfigurationProperties(prefix = "news")
public class NewsConfig {

    private String exampleName;
    private URL newsAPIUrl;

    public String getExampleName() {
        return exampleName;
    }

    public URL getNewsAPIUrl() {
        return newsAPIUrl;
    }
    public void setNewsAPIUrl(URL newsAPIUrl)
    {
        this.newsAPIUrl = newsAPIUrl;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }
}
