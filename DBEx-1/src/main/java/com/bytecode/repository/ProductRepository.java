package com.bytecode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bytecode.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

	//Product findBypName(String pname);

}
