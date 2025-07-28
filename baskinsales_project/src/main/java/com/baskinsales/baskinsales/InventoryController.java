package com.baskinsales.baskinsales;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @GetMapping
    public String getCurrentInventory() {
        return "현재 재고";
    }

    @GetMapping("/history")
    public String getInventoryHistory(@RequestParam Long productId) {
        return "입출고 기록";
    }

    @PostMapping("/update")
    public String updateInventory(@RequestBody String req) {
        return "재고 입출고";
    }
} 