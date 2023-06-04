package com.bytecode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bytecode.entity.Product;
import com.bytecode.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> addProudcts(List<Product> products) {
		
		return productRepository.saveAll(products);
	}

	@Override
	public Product getProductById(int id) {
		
		return productRepository.findById(id).orElse(null);
	}

	/*
	 * @Override public Product getProductByPname(String pname) {
	 * 
	 * return productRepository.findBypName(pname); }
	 */

	@Override
	public List<Product> getProducts() {
		
		return productRepository.findAll();
	}

	@Override
	public void deleteProductById(int id) {
		
		 productRepository.deleteById(id);
	}

	@Override
	public Product updateProductById(Product product) {
		
		Product existingProduct=productRepository.findById(product.getPid()).orElse(null);
		existingProduct.setPname(product.getPname());
		existingProduct.setPrice(product.getPrice());
		existingProduct.setQuantity(product.getQuantity());
		return productRepository.save(existingProduct);
	}

}
