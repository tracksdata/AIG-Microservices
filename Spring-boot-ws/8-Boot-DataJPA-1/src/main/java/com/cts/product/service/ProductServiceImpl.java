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
	public Product saveProduct(Product prod) {
		return prodDao.save(prod);
	}

	@Override
	public Product findById(int id) {
		return prodDao.findById(id).orElse(null);
	}

	@Override
	public List<Product> findAll() {
		return prodDao.findAll();
	}

	@Override
	public List<Product> findProductByName(String name) {
		return prodDao.findProductByNameLike(name);
	}

	@Override
	public List<Product> findProductByPrice(double price) {
		return prodDao.findProductByPriceGreaterThanEqual(price);
	}

	@Override
	public List<Product> findProductFilterByprice(double startRange, double endRange) {
		return prodDao.findProductByPriceBetween(startRange, endRange);
	}

	@Override
	public void deleteById(int id) {
		prodDao.deleteById(id);
	}

	@Override
	public void deleteByProduct(Product prod) {
		prodDao.delete(prod);
	}

	@Override
	public long count() {
		return prodDao.count();
	}
	
	
	
	
	
	
	

}
