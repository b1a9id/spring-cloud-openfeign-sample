package com.b1a9idps.consumer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.consumer.client.SakeClient;
import com.b1a9idps.consumer.request.SakeCreateRequest;
import com.b1a9idps.consumer.response.SakeResponse;

@RestController
@RequestMapping("/sakes")
public class SakeController {

    final SakeClient sakeClient;

    public SakeController(SakeClient sakeClient) {
        this.sakeClient = sakeClient;
    }

    @GetMapping
    public List<SakeResponse> list() {
        return sakeClient.list();
    }

    @GetMapping("{id}")
    public SakeResponse get(@PathVariable Integer id) {
        return sakeClient.get(id);
    }

    @PostMapping
    public SakeResponse create() {
        return sakeClient.create(new SakeCreateRequest("寫樂", "宮泉銘醸"));
    }
}
