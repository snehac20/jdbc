package com.example.demo;

import java.sql.Timestamp;
import java.util.List;

import org.apache.tomcat.jni.Time;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;



@Repository
public class PersonJdbcDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
   //select*from person
	public List<SnehaPerson> findAll(){
		return jdbcTemplate.query("select * from sneha_person",new  BeanPropertyRowMapper(SnehaPerson.class));
		
		
	}
	public SnehaPerson findByid(int id){
		return jdbcTemplate.queryForObject("select * from sneha_person where id=?",new Object[]{id},
				new BeanPropertyRowMapper<SnehaPerson>(SnehaPerson.class));
		
}
//	public int  deleteByid(int id){
//		return jdbcTemplate.update
//				("delete from sneha_person where id=?",new Object[]{id});
//			
//		
//}
//	public int  insert(sneha_person person){
//		return jdbcTemplate.update
//				("insert into sneha_person(id,name,location,birth_date)"
//			    +"values(?,?,?,?)",
//			new Object[] {
//			person.getId(),person.getName(),
//			 person.getLocation(),
//			 new Timestamp(person.getBirth_date().getTime())});
//			
//		
//}
	public int  update(SnehaPerson person){
		return jdbcTemplate.update(
				"update sneha_person"
				+ " set name = ?,location = ?,birth_date = ?"
			    + "where id = ?",
			new Object[] {
			person.getName(),
			 person.getLocation(),
			 new Timestamp(person.getBirth_date().getTime()),person.getId()});
			
		
}
}