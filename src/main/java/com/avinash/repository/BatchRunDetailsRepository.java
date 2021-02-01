package com.avinash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avinash.entity.BatchRunDetails;

@Repository
public interface BatchRunDetailsRepository extends JpaRepository<BatchRunDetails, Serializable> {

}
