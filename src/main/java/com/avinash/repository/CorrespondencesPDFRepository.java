package com.avinash.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.entity.CorrespondencesPDF;

public interface CorrespondencesPDFRepository  extends JpaRepository<CorrespondencesPDF,Serializable>{

}
