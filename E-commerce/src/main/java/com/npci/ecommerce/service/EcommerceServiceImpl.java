package com.npci.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npci.ecommerce.entity.Product;
import com.npci.ecommerce.repository.EcommerceRepository;

@Service
public class EcommerceServiceImpl implements EcommerceService {
	
	@Autowired
	EcommerceRepository ecommRepo;
	
	@Override
	public List<Product> findAll() {
		
		return ecommRepo.findAll();
	}

	@Override
	public Product findByProductId(int productid) {
		
		return ecommRepo.findById(productid);
	}
	
	@Override
	public void save(Product product) {
		 ecommRepo.save(product);
		
	}

	@Override
	public void saveOrUpdate(Product product) {
		ecommRepo.saveOrUpdate(product);
		
		
	}

	@Override
	public void deleteById(int productid) {
		ecommRepo.deleteById(productid);
		
		
	}

	

}
