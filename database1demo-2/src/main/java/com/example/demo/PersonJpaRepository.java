package com.example.demo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository

public class PersonJpaRepository {
	@PersistenceContext
	EntityManager entityManager;
	
	public List<SnehaPerson>findAll(){
		TypedQuery<SnehaPerson>namedQuery= entityManager.createNamedQuery("find_all_persons",
				SnehaPerson.class);
		return namedQuery.getResultList();
		
	}
	
	public SnehaPerson findByid(int id) {
		return entityManager.find(SnehaPerson.class,id);//JPA
		}
	public SnehaPerson insert(SnehaPerson person) {
		return entityManager.merge(person);
	}
	public SnehaPerson update(SnehaPerson person) {
		return entityManager.merge(person);
	}
	public  void deleteById(int id) {
		SnehaPerson person = findByid(id);
		entityManager.remove(person);
	}
	
}
