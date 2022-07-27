package com.npci.ecommerce.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.npci.ecommerce.entity.Product;

@Repository
public class EcommerceRepositoryImpl implements EcommerceRepository {

	@Autowired
	EntityManager entityManager;
	
	
	@Override
	public List<Product> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

		Query<Product> query = currentSession.createQuery("select p from Product p ", Product.class);
		
		List<Product> productlist = query.getResultList();
		return productlist ;
	}


	public Product findById(int productid) {
		Session currentSession = entityManager.unwrap(Session.class);
		return currentSession.get(Product.class, productid);
	}


	@Override
	public void save(Product product) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(product);
		
		
	}


	@Transactional
	public void saveOrUpdate(Product product) {
		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(product);
		
	}


	@Transactional
	public void deleteById(int productid) {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<Product> query = currentSession.createQuery("delete from Product where id = :productId");
		query.setParameter("productId", productid);
		
		query.executeUpdate();
		
	}

}
