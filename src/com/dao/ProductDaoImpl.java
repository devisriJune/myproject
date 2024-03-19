package com.dao;
import java.util.ArrayList;
import java.util.List;

import com.model.Product;

public class ProductDaoImpl implements ProductDao {
	// Implementation package
	    private List<Product> productList;

	    public ProductDaoImpl() {
	        productList = new ArrayList<>();
	        // Initialize with some sample data
	        productList.add(new Product("Product 1", 10.0));
	        productList.add(new Product("Product 2", 20.0));
	        productList.add(new Product("Product 3", 30.0));
	    }

	    @Override
	    public List<Product> getAllProducts() {
	        return productList;
	    }

	    @Override
	    public void addProduct(Product product) {
	        productList.add(product);
	    }

	    @Override
	    public void deleteProduct(String productName) {
	        for (int i = 0; i<productList.size();i++) {
	            Product product = productList.get(i);
	            if (product.getName().equals(productName)) {
	                productList.remove(i);
	                return;
	            }
	        }
	    }

	    @Override
	    public void updateProduct(String productName, double newPrice) {
	        for (int i = 0; i < productList.size(); i++) {
	            Product product = productList.get(i);
	            if (product.getName().equals(productName)) {
	                productList.get(i).price = newPrice;
	                return;
	            }
	        }
	    }
}
	        