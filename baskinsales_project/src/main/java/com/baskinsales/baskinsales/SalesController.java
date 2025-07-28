package com.baskinsales.baskinsales;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/sales")
public class SalesController {
    @GetMapping("/stats")
    public String getSalesStats(@RequestParam String period, @RequestParam(required = false) String date) {
        return "매출 통계";
    }

    @GetMapping("/hourly")
    public String getHourlySales(@RequestParam String date) {
        return "시간대별 판매";
    }

    @GetMapping("/top-products")
    public String getTopProducts(@RequestParam String period) {
        return "인기 상품 순위";
    }
} 