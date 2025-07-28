package com.baskinsales.baskinsales;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/ai")
public class AIController {
    @GetMapping("/predict-sales")
    public String predictSales(@RequestParam Long productId) {
        return "다음 주 판매 예측";
    }

    @GetMapping("/order-recommendation")
    public String recommendOrder(@RequestParam Long productId) {
        return "발주 수량 추천";
    }

    @GetMapping("/recommend-products")
    public String recommendProducts(@RequestParam(required = false) String weather) {
        return "인기메뉴 추천";
    }
} 