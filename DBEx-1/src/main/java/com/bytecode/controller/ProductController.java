package com.bytecode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bytecode.entity.Product;
import com.bytecode.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/addProduct")
	public Product addProduct(@RequestBody Product product) {

		Product p1 = productService.addProduct(product);
		return p1;
	}

	@PostMapping("/addProducts")
	public List<Product> addProducts(@RequestBody List<Product> products) {

		List<Product> listProducts = productService.addProudcts(products);
		return listProducts;
	}

	@GetMapping("/allProducts")
	public List<Product> getAllProducts() {
		List<Product> list = productService.getProducts();
		return list;
	}

	@GetMapping("/productId/{id}")
	public Product getAllProducts(@PathVariable int id) {

		Product p1 = productService.getProductById(id);
		return p1;
	}

	/*
	 * @GetMapping("/productName/{name}") public Product
	 * getAllProducts(@PathVariable String pname) {
	 * 
	 * Product p1 = productService.getProductByPname(pname); return p1; }
	 */

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
       productService.deleteProductById(id);
		
	}

	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		Product p1=productService.updateProductById(product);
		return p1;
	}
}
