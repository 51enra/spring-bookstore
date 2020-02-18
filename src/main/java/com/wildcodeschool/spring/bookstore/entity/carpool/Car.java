package com.wildcodeschool.spring.bookstore.entity.carpool;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;

import com.wildcodeschool.spring.bookstore.entity.Customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String model;
	
	@OneToMany(mappedBy = "car", cascade = CascadeType.REMOVE)
	private Set<Transportation> transportations;
	
	@ManyToMany
	@JoinTable(name = "owner_car", joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "customer_id"))
//	@NotEmpty(message = "Es muss mindestens einen Car Owner geben.")
	private Set<Customer> owners = new HashSet<>();
	

}
