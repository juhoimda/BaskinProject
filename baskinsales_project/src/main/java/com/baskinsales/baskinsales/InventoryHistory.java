package com.baskinsales.baskinsales;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class InventoryHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Product product;
    private int changeAmount;
    private String type; // IN, OUT
    private LocalDateTime changedAt;
    // getter/setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }
    public int getChangeAmount() { return changeAmount; }
    public void setChangeAmount(int changeAmount) { this.changeAmount = changeAmount; }
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    public LocalDateTime getChangedAt() { return changedAt; }
    public void setChangedAt(LocalDateTime changedAt) { this.changedAt = changedAt; }
} 