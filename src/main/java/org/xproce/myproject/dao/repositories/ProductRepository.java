package org.xproce.myproject.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.xproce.myproject.dao.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
