package com.syne.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_EMPLOYEE")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="city")
	private String city;
	
	@Column(name="salary")
	private double salary;
	
	@Column(name="bonus_percentage")
	private double bonusPercentage;
	
	@Column(name="gross_salary")
	private double grossSalary;
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the bonusPercentage
	 */
	public double getBonusPercentage() {
		return bonusPercentage;
	}
	/**
	 * @param bonusPercentage the bonusPercentage to set
	 */
	public void setBonusPercentage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}
	/**
	 * @return the grossSalary
	 */
	public double getGrossSalary() {
		return grossSalary;
	}
	/**
	 * @param grossSalary the grossSalary to set
	 */
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

}
