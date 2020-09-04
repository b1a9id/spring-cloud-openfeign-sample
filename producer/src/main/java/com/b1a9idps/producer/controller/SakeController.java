package com.b1a9idps.producer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.producer.response.SakeResponse;
import com.b1a9idps.producer.service.SakeService;

@RestController
@RequestMapping("/sakes")
public class SakeController {

    private final SakeService sakeService;

    public SakeController(SakeService sakeService) {
        this.sakeService = sakeService;
    }

    @GetMapping
    public List<SakeResponse> list() {
        return sakeService.list();
    }
}
