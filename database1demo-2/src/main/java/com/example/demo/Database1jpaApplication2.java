package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Database1jpaApplication2 implements CommandLineRunner{
	  private Logger logger=LoggerFactory.getLogger(this.getClass());
	  
	  @Autowired    
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Database1jpaApplication2.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		logger.info("user id 1001->{}",repository.findByid(1001));
		
		logger.info("inserting -> 1004 {}",
		repository.insert(new SnehaPerson( 1005 ,"ruchi", "baroda", new Date())));
				
	    logger.info("update 1003 ->{}",
	   repository.update(new SnehaPerson(1003, "sneha","USA", new Date())));
	   repository.deleteById(1003);
	   logger.info("All users ->{}",repository.findAll());
						
		
		/*
		 * logger.info("Deleting 1002 ->No of Rows Deleted - {}",dao.deleteByid(1002));
		
		logger.info("All users ->{}",dao.findAll());
		
		logger.info("inserting 1004 ->{}",
		  dao.insert(new sneha_person(1005, "hrushi", "nashik", new Date())));
		
		logger.info("update 1003 ->{}",
				dao.update(new sneha_person( 1003, "sneha","anand", new Date())));
				
		
		System.out.println("All users ->{}"+dao.findAll());
		// TODO Auto-generated method stub
		*/
	}

}
