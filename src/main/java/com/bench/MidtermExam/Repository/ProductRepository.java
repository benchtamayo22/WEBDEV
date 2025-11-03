package com.bench.MidtermExam.Repository;

import com.bench.MidtermExam.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
