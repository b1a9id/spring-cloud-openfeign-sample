package com.b1a9idps.consumer.request;

public final class SakeCreateRequest {
    final String name;
    final String brewingName;

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
