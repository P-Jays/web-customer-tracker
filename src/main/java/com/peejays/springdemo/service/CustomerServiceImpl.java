package com.peejays.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.peejays.springdemo.dao.CustomerDAO;
import com.peejays.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired 
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional // karena service tempat kita mulai dan selesai transaksi  // so we dont need to begin transaction or commit from hibernate
	public List<Customer> getCustomers() {
		
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int id) {
		Customer customer = customerDAO.getCustomer(id);
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		
	}

}
