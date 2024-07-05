package com.news;
import jakarta.persistence.*;
@Entity
@Table(name = "EMPDATA100")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="category",discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="general")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
String name;

public Employee(String name) {
	super();
	this.name = name;
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


}
