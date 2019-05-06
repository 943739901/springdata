package com.lpy.springdata;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Table(name="JPA_PERSONS")
@Entity
public class Person {

	@GeneratedValue
	@Id
	private Integer id;
	private String lastName;
	private int age;

	private String email;
	private Date birth;

	@Column(name="ADD_ID")
	private Integer addressId;

	@JoinColumn(name="ADDRESS_ID")
	@ManyToOne
	private Address address;
}
