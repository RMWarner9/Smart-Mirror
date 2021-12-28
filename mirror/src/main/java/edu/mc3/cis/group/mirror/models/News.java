
package edu.mc3.cis.group.mirror.models;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * This is a News class that holds the values for the returned json string from the NewsService class.
 * The fields are populated through an API call.
 * The fields are annotated with JsonProperty for the program to return the json string
 */
public class News {
    @JsonProperty("status")
    private String status;

    @JsonProperty("totalResults")
    private int totalResults;

    @JsonProperty("results")
    private List<Result> results;

    @JsonProperty("nextPage")
    private int nextPage;

    public List<Result> getResults()
    {
        return results;
    }

    public int getTotalResults() {
        return totalResults;
    }
}


