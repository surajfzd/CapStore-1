package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.MerchantProduct;

public interface CapStoreMerchantProduct extends JpaRepository<MerchantProduct, Integer>{

}
