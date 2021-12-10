package edu.mc3.cis.group.mirror.models;
import java.util.*;
public class Alert{
    public String sender_name;
    public String event;
    public int start;
    public int end;
    public String description;
    public List<String> tags;

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