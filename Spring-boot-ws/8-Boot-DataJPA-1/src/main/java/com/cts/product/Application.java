package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);
		
		ProductService ps= ac.getBean(ProductService.class);

		/*
		prodDao.findProductByNameLike("%a%").forEach((product) -> {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("-------------------------------");
		});
		
		*/
		
		/*
		prodDao.findProductByPriceGreaterThanEqual(10000).forEach((product) -> {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("-------------------------------");
		});
		*/
		
		/*
		prodDao.findProductByPriceBetween(15000, 40000).forEach((product) -> {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("-------------------------------");
		});
		
		*/
		
		ps.findProductByName("%k%").forEach((product) -> {
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getDescription());
			System.out.println(product.getPrice());
			System.out.println("-------------------------------");
		});
		
		
		
		
		
		
		
		
		
		
		

	}

}
