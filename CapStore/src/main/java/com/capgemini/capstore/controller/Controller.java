package com.capgemini.capstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.capstore.dao.CapStoreCustomer;

@RestController
public class Controller {

	@Autowired
	CapStoreCustomer cust;
	
	void xyz() {
		cust.existsById(100);
	}
}
