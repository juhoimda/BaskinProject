package com.baskinsales.baskinsales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    // 재고가 특정 값 이하인 상품 목록
    List<Inventory> findByStockLessThan(int stock);
    // 재고가 정확히 일치하는 상품 목록
    List<Inventory> findByStock(int stock);
    // 특정 상품의 재고 조회
    List<Inventory> findByProduct(Product product);
    // minStock 관련 메서드는 실제 필드가 없으므로 주석 처리
    // long countByCurrentStockLessThanMinStock();
    // List<Inventory> findByCurrentStockLessThanMinStock();
} 