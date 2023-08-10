package com.example.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutingConfig {
    @Bean
    // 어떤 식으로 요청을 사용자에게서 다른 서버로 잘 보낼 것인지
    // http://localhost:8080/articles/** -> http://localhost:8082/articles/**
    public RouteLocator gatemyRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("articles", predicate -> predicate
                        .path("/articles/**")
                        .uri("http://localhost:8082"))
                .route("auth", predicate -> predicate
                        .path("/auth/**")
                        .filters(filter -> filter
                                // 정규 표현식을 활용하여 경로의 일부분 추출
                                .rewritePath("/auth/(?<path>.*)", "/${path}"))
                        .uri("http://localhost:8081"))
                .build();
    }
}
