package edu.mc3.cis.group.mirror.models;

import java.util.List;

public class Result{
    public String title;
    public String link;
    public List<String> keywords;
    public List<String> creator;
    public Object video_url;
    public String description;
    public String full_description;
    public String content;
    public String pubDate;
    public String image_url;
    public String source_id;

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