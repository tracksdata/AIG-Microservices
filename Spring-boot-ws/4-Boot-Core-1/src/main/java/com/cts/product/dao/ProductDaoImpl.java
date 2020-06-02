package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {
	@Override
	public void listAll() {
		System.out.println("=====> DAO: Listing all products");
	}

}
