package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	Product saveProduct(Product prod);

	Product findById(int id);

	List<Product> findAll();

	List<Product> findProductByName(String name);

	List<Product> findProductByPrice(double price);

	List<Product> findProductFilterByprice(double startRange, double endRange);

	void deleteById(int id);

	void deleteByProduct(Product prod);

	long count();

}