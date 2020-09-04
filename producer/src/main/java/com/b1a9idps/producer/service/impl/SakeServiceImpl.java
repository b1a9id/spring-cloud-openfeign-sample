package com.b1a9idps.producer.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.b1a9idps.producer.response.SakeResponse;
import com.b1a9idps.producer.service.SakeService;

@Service
public class SakeServiceImpl implements SakeService {

    @Override
    public List<SakeResponse> list() {
        return List.of(
                new SakeResponse(1, "若波", "若波酒造"),
                new SakeResponse(2, "新政", "新政酒造"),
                new SakeResponse(3, "十四代", "高木酒造"));
    }
}
