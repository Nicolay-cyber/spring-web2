package com.example.recommendservice.controllers;

import com.example.recommendservice.integrations.CartServiceIntegration;
import com.geekbrains.spring.web.api.core.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/recommends")
@AllArgsConstructor
public class RecommendController {
    private final CartServiceIntegration cartServiceIntegration;
    @GetMapping("/most_popular_ordered_products")
    public List<ProductDto> getMostPopularOrderedProducts(){
        return cartServiceIntegration.getMostPopularOrderedProducts();
    }
}
