package com.example.recommendservice.integrations;

import com.geekbrains.spring.web.api.core.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Component
@AllArgsConstructor
public class CartServiceIntegration {
    private final WebClient cartServiceWebClient;

    public List<ProductDto> getMostPopularOrderedProducts() {
        List<ProductDto> mostPopularOrderedProducts = cartServiceWebClient.get()
                .uri("/api/v1/orders/most_popular_ordered_products")
                .retrieve()
                .bodyToMono(List.class)
                .block();
        return mostPopularOrderedProducts;
    }
}
