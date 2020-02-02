package com.Efort.demo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private String id;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
private String name;
private String phonenumber;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
}
