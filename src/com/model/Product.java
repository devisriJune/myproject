package com.model;

public class Product {
	// Model package
	    private String name;
	    public double price;

	    public Product(String name, double price) {
	        this.name = name;
	        this.price = price;
	    }
	    public String getName() {
	        return name;
	    }
	    public double getPrice() {
	        return price;
	    }
	    @Override
	    public String toString() {
	        return "Product{" +
	                "name='" + name + '\'' +
	                ", price=" + price +
	                '}';
	    }
	}

	


