package com.b1a9idps.consumer.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.b1a9idps.consumer.request.SakeCreateRequest;
import com.b1a9idps.consumer.response.SakeResponse;

@FeignClient(value = "sakes", url = "${producer.url}")
public interface SakeClient {
    @GetMapping(value = "/sakes")
    List<SakeResponse> list();

    @GetMapping(value = "/sakes/{id}")
    SakeResponse get(@PathVariable Integer id);

    @PostMapping(value = "/sakes")
    SakeResponse create(SakeCreateRequest request);
}
