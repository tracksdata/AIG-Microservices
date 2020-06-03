package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		ProductDao prodDao = ac.getBean(ProductDao.class);

		Product prod = new Product();
		prod.setId(30);
		prod.setName("Mouse");
		prod.setDescription("Wired USB Mouse");
		prod.setPrice(1200);

		// prodDao.save(prod);

		/*
		 * prodDao.findAll().forEach((product) -> { System.out.println(product.getId());
		 * System.out.println(product.getName());
		 * System.out.println(product.getDescription());
		 * System.out.println(product.getPrice());
		 * System.out.println("-------------------------------"); });
		 */

		// prodDao.deleteById(26);

		// find product

		/*
		Product product = prodDao.findById(176).orElse(null);

		if (product != null) {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("-------------------------------");

		} else {
			System.out.println("product id not found");
		}
		*/
		Product product = prodDao.findById(16).orElse(null);
		if (product != null) {
			product.setDescription("Wired Mouse with Track ball");
			prodDao.save(product);
		}
		
		
		

	}

}
