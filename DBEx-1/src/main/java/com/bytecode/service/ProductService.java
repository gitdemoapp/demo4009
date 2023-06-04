package com.bytecode.service;

import java.util.List;

import com.bytecode.entity.Product;

public interface ProductService {
       public Product addProduct(Product product);
       public List<Product>  addProudcts(List<Product> product);
       
       public Product getProductById(int id);
       
     //  public Product getProductByPname(String pname);
       
       public List<Product> getProducts();
       
       public void deleteProductById(int  id);
       
       public Product updateProductById(Product product);
       
}
