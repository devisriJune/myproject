package com.service;
import java.util.List;



import com.dao.ProductDao;
import com.model.Product;


public class ProductService {
	 private ProductDao productDao;

	    public ProductService(ProductDao productDao) {
	        this.productDao = productDao;
	    }

	    public List<Product> getAllProducts() {
	        return productDao.getAllProducts();
	    }

	    public void addProduct(Product product) {
	        productDao.addProduct(product);
	    }

	    public void deleteProduct(String productName) {
	        productDao.deleteProduct(productName);
	    }

	    public void updateProduct(String productName, double newPrice) {
	        productDao.updateProduct(productName, newPrice);
	    }
}
	
	

		   