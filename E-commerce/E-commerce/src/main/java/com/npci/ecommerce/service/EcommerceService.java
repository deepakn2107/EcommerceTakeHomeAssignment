package com.npci.ecommerce.service;

import java.util.List;


import com.npci.ecommerce.entity.Product;

public interface EcommerceService {
	public List<Product> findAll();

	public Product findByProductId(int productid);
	
	public void save(Product product);

	public void saveOrUpdate(Product product);

	public void deleteById(int productid);

}
