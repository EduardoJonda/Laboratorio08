package com.tecsup.lab08.crud.dao;

import java.util.ArrayList;

import com.tecsup.lab08.crud.bean.Employee;

public interface EmployeeDAO {

	/**
	 * 
	 * @return
	 */
	ArrayList<Employee> findAll();

	/**
	 * 
	 * @param string2 
	 * @param string 
	 * @param id
	 * @param i 
	 */
	Employee findById(int id); 
	 
		
	/**
	 * 
	 * @param pFirstname
	 * @param pLastname
	 * @param pSalary
	 * @param pAge
	 */
	int create(String pFirstname, String pLastname, Double pSalary, int pAge);

	/**
	 * 
	 * @param id
	 */
	void delete(int id);

	/**
	 * 
	 * @param id
	 * @param pFirstname
	 * @param pLastname
	 * @param pSalary
	 * @param pAge
	 */
	void update(int id, String pFirstname, String pLastname, Double pSalary, int pAge);
 
} 
