package com.jsp.employee;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAll {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("tanvi");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "SELECT e FROM Employee e";  // HQL Query
		Query query = entityManager.createQuery(sql); 		// used to create custom query
		
		List<Employee> employees = query.getResultList();	// used to get multiple values
		
		for(Employee e : employees) {
			System.out.println("================");
			System.out.println(e.getId());
			System.out.println(e.getName());
			System.out.println(e.getEmail());
			System.out.println(e.getCno());
			System.out.println("================");
			
		}
		
		
		
	}
	
	
}
