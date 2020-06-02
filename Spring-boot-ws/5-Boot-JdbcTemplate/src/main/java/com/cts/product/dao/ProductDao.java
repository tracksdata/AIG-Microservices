package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	List<Product> listAll();
	public void saveProduct(Product prod);

}