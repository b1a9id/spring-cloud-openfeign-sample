package com.b1a9idps.producer.response;

public final class SakeResponse {
    final Integer id;
    final String name;
    final String brewingName;

    public SakeResponse(Integer id, String name, String brewingName) {
        this.id = id;
        this.name = name;
        this.brewingName = brewingName;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrewingName() {
        return brewingName;
    }
}
