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

		// save Product

		Product product = new Product();
		product.setId(23);
		product.setName("Toy");
		product.setDescription("Remote car");
		product.setPrice(5000);

		ps.saveProduct(product);

		for (Product prod : ps.listAll()) {
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getDescription());
			System.out.println(prod.getPrice());
			System.out.println("---------------------------");
		}

	}

}
