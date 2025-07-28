package com.baskinsales.baskinsales;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface InventoryHistoryRepository extends JpaRepository<InventoryHistory, Long> {
    List<InventoryHistory> findByProduct(Product product);
} 