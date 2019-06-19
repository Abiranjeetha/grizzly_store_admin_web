package com.pack.dao;

import java.util.List;

import com.pack.model.Product;

public interface ProductDao {
	public int addProduct(Product p);
	public List<Product> listProduct();
	public Product viewProduct(int pid);
	public int removeProduct(int id);
}
