package com.wildcodeschool.spring.bookstore.entity.carpool;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.wildcodeschool.spring.bookstore.entity.Customer;

import lombok.Getter;
import lombok.Setter;

@Entity
//@Table(name = "transportation")
@Getter
@Setter
public class Transportation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "transportation_end", nullable = true)
	private LocalDateTime transportationEnd;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@Column(name = "transportation_start", nullable = true)
	private LocalDateTime transportationStart;
	
	@ManyToOne
	//@MapsId("carId")	
	private Car car;	
	
	@ManyToOne
    //@MapsId("passengerId")
	private Customer customer;	

}
