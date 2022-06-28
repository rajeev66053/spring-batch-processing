package com.java.spring.batch.config;

import org.springframework.batch.item.ItemProcessor;

import com.java.spring.batch.entity.Customer;

public class CustomerProcessor implements ItemProcessor<Customer,Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		/*
		 * //If only need record from specific country
		 * if(customer.getCountry().equals("United States")) { return customer; }else{
		 * return null; }
		 */
		 
		 return customer;
	}

}
