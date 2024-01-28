package com.bestpractice.api.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoResponse {

    @JsonProperty("id")
    private final Long id;

    @JsonProperty("title")
    private final String title;

    @JsonProperty("description")
    private final String description;

    public InfoResponse(Long id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
