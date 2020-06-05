package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductRestControllee {

	@Autowired
	private ProductService ps;

	@GetMapping
	public List<Product> f1() {
	
		return ps.findAll();
	}

	@GetMapping("/{id}")
	public Product findProduct(@PathVariable int id) {
		return ps.findById(id);
	}

	@GetMapping("/byName/{name}")
	public List<Product> findByName(@PathVariable String name) {
		return ps.findProductByName("%" + name + "%");
	}

	@PostMapping
	public Product f2(@RequestBody Product prod) {
		return ps.saveProduct(prod);
	}

	@PutMapping
	public Product f3(@RequestBody Product prod) {

		return ps.saveProduct(prod);
	}

	@DeleteMapping("/{id}")
	public String f4(@PathVariable int id) {
		ps.deleteById(id);
		return ("Product Deleted");
	}

	@PatchMapping
	public String f5() {
		return ("PATCH request received");
	}

}
