package edu.mc3.cis.group.mirror.models;

<<<<<<< Updated upstream
import com.fasterxml.jackson.annotation.JsonProperty;
=======
>>>>>>> Stashed changes

import java.util.Date;
import java.util.List;

<<<<<<< Updated upstream
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



=======


public class News {// import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
    // import com.fasterxml.jackson.annotation.JsonProperty; // version 2.11.1
/* ObjectMapper om = new ObjectMapper();
Root root = om.readValue(myJsonString), Root.class); */
    public class Source{
        public String id;
        public String name;
    }

    public class Article{
        public Source source;
        public String author;
        public String title;
        public String description;
        public String url;
        public String urlToImage;
        public Date publishedAt;
        public String content;
    }

    public class NewsRoot{
        public String status;
        public int totalResults;
        public List<Article> articles;
    }


}
>>>>>>> Stashed changes
