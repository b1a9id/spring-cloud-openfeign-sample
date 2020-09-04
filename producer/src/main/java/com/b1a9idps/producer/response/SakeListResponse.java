package com.b1a9idps.producer.response;

import java.util.List;

public final class SakeListResponse {
    final List<SakeResponse> content;

    public SakeListResponse(List<SakeResponse> content) {
        this.content = content;
    }

    public List<SakeResponse> getContent() {
        return content;
    }
}
