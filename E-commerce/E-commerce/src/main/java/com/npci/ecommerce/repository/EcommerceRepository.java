package com.npci.ecommerce.repository;

import java.util.List;

import com.npci.ecommerce.entity.Product;

public interface EcommerceRepository {
	
	public List<Product> findAll();

	public Product findById(int productid);

	public void save(Product product);

	public void saveOrUpdate(Product product);

	public void deleteById(int productid);

}
