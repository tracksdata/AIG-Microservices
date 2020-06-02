package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Override
	public List<Product> listAll() {
		return prodDao.listAll();
	}

	public void saveProduct(Product prod) {
		prodDao.saveProduct(prod);
	}

}
