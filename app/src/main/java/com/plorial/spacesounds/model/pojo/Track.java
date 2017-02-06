package com.plorial.spacesounds.model.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Track {

    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("license")
    @Expose
    private String license;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("download_url")
    @Expose
    private String downloadUrl;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("stream_url")
    @Expose
    private String streamUrl;
    @SerializedName("tag_list")
    @Expose
    private String tagList;
    @SerializedName("id")
    @Expose
    private Integer id;

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getStreamUrl() {
        return streamUrl;
    }

    public void setStreamUrl(String streamUrl) {
        this.streamUrl = streamUrl;
    }

    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}