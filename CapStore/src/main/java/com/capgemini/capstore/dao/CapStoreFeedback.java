package com.capgemini.capstore.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.capstore.beans.Feedback;

public interface CapStoreFeedback extends JpaRepository<Feedback, Integer>{

}
