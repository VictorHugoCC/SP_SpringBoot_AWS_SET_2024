package org.example.repositories;

import org.example.entities.OrderItem;
import org.example.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
