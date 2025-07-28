package com.baskinsales.baskinsales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
    // 특정 기간의 판매 데이터 조회
    List<Sale> findBySoldAtBetween(LocalDateTime startDate, LocalDateTime endDate);
    // 특정 날짜 이후의 판매 데이터 조회
    List<Sale> findBySoldAtAfter(LocalDateTime startDate);
    // 상품별 판매 데이터 조회
    List<Sale> findByProduct(Product product);
    // 특정 기간의 상품별 판매 데이터 조회
    List<Sale> findByProductAndSoldAtBetween(Product product, LocalDateTime startDate, LocalDateTime endDate);
} 