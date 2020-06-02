package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	public List<Product> listAll();

	public void saveProduct(Product prod);
}