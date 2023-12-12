package com.practice.cloud_gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
public class LoggingGlobalPreFilter implements GlobalFilter {

    final Logger logger =
            LoggerFactory.getLogger(LoggingGlobalPreFilter.class);

    @Override
    public Mono<Void> filter(
            ServerWebExchange exchange,
            GatewayFilterChain chain) {

        ServerHttpRequest request = exchange.getRequest()
                .mutate()
                .header("Content-Type", "application/json")
                .build();

        logger.info("Global Pre Filter executed");
        return chain.filter(exchange);
    }
}