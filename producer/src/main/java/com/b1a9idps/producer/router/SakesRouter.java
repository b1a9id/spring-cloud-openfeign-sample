package com.b1a9idps.producer.router;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import com.b1a9idps.producer.handler.SakeHandler;

import static org.springframework.web.servlet.function.RouterFunctions.route;

@Configuration(proxyBeanMethods = false)
public class SakesRouter {

    @Bean
    public RouterFunction<ServerResponse> routes(SakeHandler handler) {
        return route()
                .path("/sakes", builder -> builder
                        .GET("", handler::handleList)
                        .GET("/{id}", handler::handleGet)
                        .POST("", handler::handleCreate))
                .filter((serverRequest, handlerFunction) -> handlerFunction.handle(serverRequest))
                .build();

    }
}
