package com.capgemini.capstore.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.capgemini.capstore.beans.Customer;
@Transactional
public interface CapStoreCustomer extends CrudRepository<Customer, Integer>{

}
