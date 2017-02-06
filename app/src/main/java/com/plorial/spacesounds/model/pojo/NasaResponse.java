package com.plorial.spacesounds.model.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NasaResponse {

    @SerializedName("count")
    @Expose
    private Integer count;

    @SerializedName("results")
    @Expose
    private List<Track> results = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Track> getResults() {
        return results;
    }

    public void setResults(List<Track> results) {
        this.results = results;
    }
}