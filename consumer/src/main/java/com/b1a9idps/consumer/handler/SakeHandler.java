package com.b1a9idps.consumer.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import com.b1a9idps.consumer.client.SakeClient;
import com.b1a9idps.consumer.request.SakeCreateRequest;

@Component
public class SakeHandler {

    final SakeClient sakeClient;

    public SakeHandler(SakeClient sakeClient) {
        this.sakeClient = sakeClient;
    }

    public ServerResponse handleList(ServerRequest request) {
        return ServerResponse.ok().body(sakeClient.list());
    }

    public ServerResponse handleGet(ServerRequest request) {
        int id = Integer.parseInt(request.pathVariable("id"));
        return ServerResponse.ok().body(sakeClient.get(id));
    }

    public ServerResponse handleCreate(ServerRequest request) throws Exception {
        return ServerResponse.ok().body(sakeClient.create(new SakeCreateRequest("寫樂", "宮泉銘醸")));
    }
}
