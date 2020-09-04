package com.b1a9idps.producer.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import com.b1a9idps.producer.request.SakeCreateRequest;
import com.b1a9idps.producer.service.SakeService;

@Component
public class SakeHandler {

    final SakeService sakeService;

    public SakeHandler(SakeService sakeService) {
        this.sakeService = sakeService;
    }

    public ServerResponse handleList(ServerRequest request) {
        return ServerResponse.ok().body(sakeService.list());
    }

    public ServerResponse handleGet(ServerRequest request) {
        int id = Integer.parseInt(request.pathVariable("id"));
        return ServerResponse.ok().body(sakeService.get(id));
    }

    public ServerResponse handleCreate(ServerRequest request) throws Exception {
        SakeCreateRequest sakeCreateRequest = request.body(SakeCreateRequest.class);
        return ServerResponse.ok().body(sakeService.create(sakeCreateRequest));
    }
}
