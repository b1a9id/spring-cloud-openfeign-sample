package com.b1a9idps.consumer.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableFeignClients(basePackages = {"com.b1a9idps.consumer.client"})
public class FeignConfig {
}
