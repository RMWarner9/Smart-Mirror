package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * The Result class is a class that holds the values for articles that are returned by the news
 */
public class Result{
    @JsonProperty("title")
    private String title;
    @JsonProperty("link")
    private String link;
    @JsonProperty("keywords")
    private List<String> keywords;
    @JsonProperty("creator")
    private List<String> creator;
    @JsonProperty("video_url")
    private Object video_url;
    @JsonProperty("description")
    private String description;
    @JsonProperty("full_description")
    private String full_description;
    @JsonProperty("content")
    private String content;
    @JsonProperty("pubDate")
    private String pubDate;
    @JsonProperty("image_url")
    private String image_url;
    @JsonProperty("source_id")
    private String source_id;

    /**
     * toString method to return a String formatted version of the Results object
     * @return Result object in a String form
     */
    @Override
    public String toString() {
        return "Result{" +
                "\ntitle='" + title + '\'' +
                ", \nlink='" + link + '\'' +
                ", \nkeywords=" + keywords +
                ", \ncreator=" + creator +
                ", \nvideo_url=" + video_url +
                ", \ndescription='" + description + '\'' +
                ", \nfull_description='" + full_description + '\'' +
                ", \ncontent='" + content + '\'' +
                ", \npubDate='" + pubDate + '\'' +
                ", \nimage_url='" + image_url + '\'' +
                ", \nsource_id='" + source_id + '\'' +
                '}';
    }
}