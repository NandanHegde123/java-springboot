package com.coordinate.SpringEcom.repository;

import com.coordinate.SpringEcom.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query("select p from Product p where " +
            "lower(p.name) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.brand) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.description) like lower(concat('%', :keyword, '%')) or " +
            "lower(p.category) like lower(concat('%', :keyword, '%'))  ")
    List<Product> searchProductsByKeyword(String keyword);
}
