package com.b1a9idps.producer.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public final class SakeCreateRequest {
    final String name;
    final String brewingName;

    @JsonCreator
    public SakeCreateRequest(String name, String brewingName) {
        this.name = name;
        this.brewingName = brewingName;
    }

    public String getName() {
        return name;
    }

    public String getBrewingName() {
        return brewingName;
    }
}
