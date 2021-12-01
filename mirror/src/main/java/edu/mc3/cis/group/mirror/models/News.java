package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class News  {
    public String status;
    public int totalResults;
    public List<Result> results;
    public int nextPage;

    @Override
    public String toString() {
        return "News{" +
                "status='" + status + '\'' +
                ", \ntotalResults=" + totalResults +
                ", \nresults=" + results +
                ", \nnextPage=" + nextPage +
                '}';
    }
}



