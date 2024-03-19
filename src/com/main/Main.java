package com.main;

import java.util.List;


import com.dao.ProductDaoImpl;
import com.model.Product;
import com.service.ProductService;

public class Main {
	// Main package
	    public static void main(String[] args) {
	        // Initialize ProductDao and ProductService
	        ProductDaoImpl productDao = new ProductDaoImpl();
	        ProductService productService = new ProductService(productDao);

	        // Display existing product list
	        System.out.println("Existing product list:");
	        List<Product> productList = productService.getAllProducts();
	        for (Product product : productList) {
	            System.out.println(product);
	        }

	        // Add list of 3 products into existing list
	        productService.addProduct(new Product("Product 4", 40.0));
	        productService.addProduct(new Product("Product 5", 50000.0));
	        productService.addProduct(new Product("Product 6", 60.0));
	        productService.addProduct(new Product("Product 7", 60000.0));

	        // Display updated product list
	        System.out.println("\nUpdated product list:");
	        productList = productService.getAllProducts();
	        for (Product product : productList) {
	            System.out.println(product);
	        }

	        // Delete a data from list
	        productService.deleteProduct("Product 2");

	        // Display updated product list after deletion
	        System.out.println("\nUpdated product list after deletion:");
	        productList = productService.getAllProducts();
	        for (Product product : productList) {
	            System.out.println(product);
	        }

	        // Update list with given product name and display it again
	        productService.updateProduct("Product 3", 35.0);

	        // Display updated product list after update
	        System.out.println("\nUpdated product list after update:");
	        productList = productService.getAllProducts();
	        for (Product product : productList) {
	            System.out.println(product);
	        }
	        productList.stream().filter(p1 -> p1.getPrice() > 30000).forEach(p1 -> System.out.println(p1.getPrice()));
	    }
	}


