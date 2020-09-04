package com.b1a9idps.producer.service;

import java.util.List;

import com.b1a9idps.producer.request.SakeCreateRequest;
import com.b1a9idps.producer.response.SakeResponse;

public interface SakeService {

    List<SakeResponse> list();

    SakeResponse get(Integer id);

    SakeResponse create(SakeCreateRequest request);
}
