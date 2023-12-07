package com.practice.cloud_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestaurantReviewGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantReviewGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("reviews", p -> p
						.path("/reviews")
						.uri("http://localhost:8081/reviews"))
				.route("reviewsById", p -> p
						.path("/reviews/**")
						.filters(rw -> rw.rewritePath("/reviews/(?<segment>.*)", "/reviews/${segment}"))
						.uri("http://localhost:8081/reviews/"))
				.build();
	}

}
