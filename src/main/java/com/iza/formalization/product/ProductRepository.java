package com.iza.formalization.product;

import com.iza.formalization.customer.domain.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<CustomerEntity, Integer> {
}
