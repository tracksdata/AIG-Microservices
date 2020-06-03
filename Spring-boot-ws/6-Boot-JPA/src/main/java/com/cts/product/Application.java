package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		Product prod = new Product();
		prod.setId(28);
		prod.setName("Book");
		prod.setDescription("White Pages");
		prod.setPrice(128);

		ProductService ps = ac.getBean(ProductService.class);

		ps.saveProduct(prod);

	}

}
