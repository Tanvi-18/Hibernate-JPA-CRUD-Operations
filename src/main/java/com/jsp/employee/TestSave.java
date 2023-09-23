package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class TestSave {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("tanvi");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		Employee employee = new Employee();
		
		employee.setName("abc");
		employee.setEmail("abc@mail.com");
		employee.setCno(5874456773l);
		
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();
		
				
	}

}
