package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.data.repository.query.Param;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	
	List<Product> findProductByNameLike(String name);
	List<Product> findProductByPriceGreaterThanEqual(double price);
	List<Product> findProductByPriceBetween(double startRange,double endRange);
	
	// Query methods
	
	@Query(name = "q1",value = "from Product p where p.name like:name ")
	List<Product> listAllByName(@Param("name") String pname);
	
	
	
	

}
