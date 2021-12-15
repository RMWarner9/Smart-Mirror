package edu.mc3.cis.group.mirror.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.net.URL;

/**
 * NewConfig is a configuration class that allows us to store properties in the application.properties file and allows
 * us to use those values
 */
@Configuration
@ConfigurationProperties(prefix = "news")
public class NewsConfig {

    private String exampleName;
    private URL newsAPIUrl;

    /**
     * getExampleName is a method that allows us to get the exampleName from the application.properties file
     * @return String name in application.properties file
     */
    public String getExampleName() {
        return exampleName;
    }

    /**
     * getNewsAPIUrl is a method that allows us to get the URL from the application.properies file
     * @return URL newsapi url
     */
    public URL getNewsAPIUrl() {
        return newsAPIUrl;
    }

    /**
     * setNewsAPIUrl method Sets the NewsAPIURL
     * @param newsAPIUrl
     */
    public void setNewsAPIUrl(URL newsAPIUrl)
    {
        this.newsAPIUrl = newsAPIUrl;
    }

    /**
     * setExampleName method Sets the exampleName
     * @param exampleName
     */
    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }
}
