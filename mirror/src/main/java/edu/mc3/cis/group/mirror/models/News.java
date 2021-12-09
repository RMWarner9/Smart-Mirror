package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class News {// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
    // import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
    public String status;
    public int totalResults;
    public List<Result> results;
    public int nextPage;
    }


