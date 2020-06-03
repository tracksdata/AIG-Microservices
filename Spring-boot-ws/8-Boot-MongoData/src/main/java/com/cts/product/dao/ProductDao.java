package com.cts.product.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cts.product.entity.Product;

public interface ProductDao extends MongoRepository<Product, Object> {

	List<Product> findProductByNameLike(String name);

	List<Product> findProductByPriceGreaterThanEqual(double price);

	List<Product> findProductByPriceBetween(double startRange, double endRange);

}
