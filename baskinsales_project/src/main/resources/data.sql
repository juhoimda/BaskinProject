-- Product
INSERT INTO product (name, category, price) VALUES
('아몬드봉봉', 'ICE_CREAM', 3500),
('민트초코', 'ICE_CREAM', 3200),
('딸기', 'ICE_CREAM', 3000),
('바닐라', 'ICE_CREAM', 2800),
('초코', 'ICE_CREAM', 3200),
('카라멜', 'ICE_CREAM', 3300),
('레몬', 'ICE_CREAM', 3100),
('쿠키앤크림', 'ICE_CREAM', 3400);

-- User
INSERT INTO user (username, password, role) VALUES
('admin', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa', 'ADMIN'),
('manager', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa', 'MANAGER'),
('staff', '$2a$10$N.zmdr9k7uOCQb376NoUnuTJ8iAt6Z5EHsM8lE9lBOsl7iKTVEFDa', 'STAFF');

-- Inventory (product_id는 실제 product의 id값, 예시로 1~8)
INSERT INTO inventory (product_id, stock, updated_at) VALUES
(1, 150, NOW()),
(2, 80, NOW()),
(3, 45, NOW()),
(4, 120, NOW()),
(5, 0, NOW()),
(6, 35, NOW()),
(7, 95, NOW()),
(8, 110, NOW());

-- Sale (product_id는 실제 product의 id값, sold_at은 최근 날짜 예시)
INSERT INTO sale (product_id, quantity, sold_at) VALUES
(1, 2, '2024-07-01 14:30:00'),
(3, 1, '2024-07-01 14:25:00'),
(5, 1, '2024-07-01 14:20:00'),
(2, 1, '2024-07-01 14:15:00'),
(3, 2, '2024-07-01 14:10:00'),
(1, 1, '2024-07-01 13:45:00'),
(4, 1, '2024-07-01 13:30:00'),
(2, 2, '2024-07-01 13:15:00'),
(6, 1, '2024-07-01 13:00:00'),
(1, 1, '2024-07-01 12:45:00');

-- InventoryHistory (product_id는 실제 product의 id값, changed_at은 최근 날짜 예시)
INSERT INTO inventory_history (product_id, change_amount, type, changed_at) VALUES
(1, 20, 'IN', '2024-07-01 10:15:00'),
(1, -5, 'OUT', '2024-07-01 14:30:00'),
(2, 15, 'IN', '2024-07-01 09:00:00'),
(2, -2, 'OUT', '2024-07-01 14:15:00'),
(3, 10, 'IN', '2024-07-01 08:45:00'),
(3, -1, 'OUT', '2024-07-01 14:25:00'),
(5, 0, 'OUT', '2024-07-01 14:20:00'),
(5, -1, 'OUT', '2024-07-01 14:30:00'); 