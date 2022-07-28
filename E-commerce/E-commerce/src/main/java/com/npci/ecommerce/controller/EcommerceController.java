package com.npci.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.npci.ecommerce.entity.Product;
import com.npci.ecommerce.service.EcommerceService;

@RestController
@RequestMapping("/ecommerce")
public class EcommerceController {

	@Autowired
	EcommerceService ecommService;

	@GetMapping("/productList")
	public List<Product> findAll() {
		return ecommService.findAll();

	}

	@GetMapping("/productById/{productid}")
	public Product findByProductId(@PathVariable int productid) {
		return ecommService.findByProductId(productid);

	}
	
	@PostMapping("/addProduct")
	public String saveProduct(@RequestBody Product product) {
		
		ecommService.save(product);
		return "Product details is added to DataBase";
		
	}

	@PutMapping("/updateProduct")
	public String saveorUpdateProduct(@RequestBody Product product) {
		
		ecommService.saveOrUpdate(product);
		return "Product details is updated in DataBase";
		
	}
	
	@DeleteMapping("/deleteProductById/{productid}")
	public String deleteById(@PathVariable int productid) {
		ecommService.deleteById(productid);
		
		return " Product details deleted with empNo: " +productid;
	}
}
