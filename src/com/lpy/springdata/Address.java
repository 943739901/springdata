package com.lpy.springdata;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Table(name="JPA_ADDRESSES")
@Entity
public class Address {

	@GeneratedValue
	@Id
	private Integer id;
	private String province;
	private String city;
}
