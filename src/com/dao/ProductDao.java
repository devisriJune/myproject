package com.dao;

import java.util.List;

import com.model.Product;

public interface ProductDao {
	//Dao package
	    List<Product> getAllProducts();
	    void addProduct(Product product);
	    void deleteProduct(String productName);
	    void updateProduct(String productName, double newPrice);
}

	


