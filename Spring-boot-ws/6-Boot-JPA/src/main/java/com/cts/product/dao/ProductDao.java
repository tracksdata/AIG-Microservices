package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	//save product
	void saveProduct(Product prod);

	//list all products
	List<Product> listAll();

}