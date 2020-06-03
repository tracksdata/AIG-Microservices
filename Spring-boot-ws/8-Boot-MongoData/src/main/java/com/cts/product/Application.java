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

		ProductService ps = ac.getBean(ProductService.class);

		Product prod = new Product();
		prod.setId(1025);
		prod.setName("Pen");
		prod.setDescription("Red Ink");
		prod.setPrice(125);

		 ps.saveProduct(prod);

		ps.findAll().forEach((product) -> {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());

			System.out.println("-------------------------------");

		});

	}

}
