package com.example.demo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Database1jdbcApplication implements CommandLineRunner{
	  private Logger logger=LoggerFactory.getLogger(this.getClass());
	  
	  @Autowired    
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(Database1jdbcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		logger.info("All users ->{}",dao.findAll());
//		logger.info("user id 1001->{}",dao.findByid(1001));
//		logger.info("Deleting 1002 ->No of Rows Deleted - {}",dao.deleteByid(1002));
//		
//		logger.info("All users ->{}",dao.findAll());
//		
//		logger.info("inserting 1004 ->{}",
//		  dao.insert(new sneha_person(1005, "hrushi", "nashik", new Date())));
//		
//		logger.info("update 1003 ->{}",
//				dao.update(new sneha_person( 1003, "sneha","anand", new Date())));
//				
		
		System.out.println("All users ->{}"+dao.findAll());
		// TODO Auto-generated method stub
		
	}

}
