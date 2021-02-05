package com.tat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PersonalInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonalInfo {
	@Id
	@GeneratedValue
	private int id;
	@Column
	private String firstName;
	private String lastName;
	private char gender;
	private String address;
	private String email;
	private long phone;
	private int dateOfBirth;
	
}
