package com.iza.formalization.product;

import com.iza.formalization.customer.domain.CustomerEntity;
import com.iza.formalization.product.domain.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {
}
