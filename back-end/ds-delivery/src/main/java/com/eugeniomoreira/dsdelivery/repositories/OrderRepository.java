package com.eugeniomoreira.dsdelivery.repositories;

import com.eugeniomoreira.dsdelivery.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
