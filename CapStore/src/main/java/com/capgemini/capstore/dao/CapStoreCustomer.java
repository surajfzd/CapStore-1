package com.capgemini.capstore.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Customer;
@Transactional
public interface CapStoreCustomer extends JpaRepository<Customer, Integer>{

}
