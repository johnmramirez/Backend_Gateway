package com.practice.cloud_gateway;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class RestaurantReviewGatewayApplication {

	@Value("${cloud_gateway.forwardToService}")
	private String forwardToService;

	public static void main(String[] args) {
		SpringApplication.run(RestaurantReviewGatewayApplication.class, args);
	}

	@Bean
	public RouteLocator myRoutes(RouteLocatorBuilder builder) {
		String uri = "lb://" + forwardToService;
		return builder.routes()
				.build();
	}

}
