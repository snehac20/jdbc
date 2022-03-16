package com.example.demo;

import java.util.Date;

//import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.NamedQuery;


//import javax.persistence.Table;

//@Table(name="person")
//@DiscriminatorColumn(name="name")



@Entity
@NamedQuery(name="find_all_persons",query="select p from SnehaPerson p")
public class SnehaPerson {
	@Id
	private int id;
	private String name;
	private String location;
	private Date birth_date;
	public SnehaPerson() {
		
	}
	public SnehaPerson(int id, String name, String location, Date birth_date) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.birth_date = birth_date;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	@Override
	public String toString() {
		return "\n sneha_person [id=" + id + ", name=" + name + ", location=" + location + ", birth_date=" + birth_date
				+ "]";
	}
	
	

}
