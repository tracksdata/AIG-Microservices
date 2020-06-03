package com.cts.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager em;

	// save product
	@Override
	public void saveProduct(Product prod) {
		em.persist(prod);
	}

	// list all products
	@Override
	public List<Product> listAll() {
		String fetchQry = "from Product";
		return em.createQuery(fetchQry).getResultList();
	}

}
