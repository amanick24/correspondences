package com.avinash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CO_PDFS")
public class CorrespondencesPDF {
	
	@Id
	@GeneratedValue
	@Column(name = "CO_PDF_ID")
	private Integer coPDFId;
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	@Column(name = "CASE_NUMBER")
	private String caseNumber;
	@Column(name = "PDF_DOCUMENT")
	private byte[] pdfDocument;
	@Column(name = "PLAN_NAME")
	private String planName;
	public Integer getCoPDFId() {
		return coPDFId;
	}
	public void setCoPDFId(Integer coPDFId) {
		this.coPDFId = coPDFId;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(String caseNumber) {
		this.caseNumber = caseNumber;
	}
	public byte[] getPdfDocument() {
		return pdfDocument;
	}
	public void setPdfDocument(byte[] pdfDocument) {
		this.pdfDocument = pdfDocument;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	 

}
