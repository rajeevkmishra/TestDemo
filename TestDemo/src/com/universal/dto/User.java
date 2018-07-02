package com.universal.dto;

import javax.persistence.*;

@Entity
@Table
public class User {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
int id;

@Column
String name;
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

}
