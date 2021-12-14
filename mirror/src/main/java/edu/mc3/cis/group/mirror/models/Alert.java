package edu.mc3.cis.group.mirror.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Alert {

    @JsonProperty("sender_name")
    private String sender_name;
    @JsonProperty("event")
    private String event;
    @JsonProperty("start")
    private int start;
    @JsonProperty("end")
    private int end;
    @JsonProperty("description")
    private String description;
    @JsonProperty("tags")
    private List<String> tags;

    @Override
    public String toString()
    {
        return "Alert{" +
                "sender_name='" + sender_name + '\'' +
                ", event='" + event + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", description='" + description + '\'' +
                ", tags=" + tags +
                '}';
    }
}