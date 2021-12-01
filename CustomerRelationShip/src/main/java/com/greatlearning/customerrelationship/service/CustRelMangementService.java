package com.greatlearning.customerrelationship.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.greatlearning.customerrelationship.model.Customers;

@Service
public interface CustRelMangementService {
	public List<Customers> findAll();

	public Customers findById(int theId);

	public void save(Customers theBook);

	public void deleteById(int theId);

	public List<Customers> searchBy(String name, String author);

}
