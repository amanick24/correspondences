package com.avinash.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="BATCH_SUMMARY")
public class BatchSummary {
	
	@Id
	@GeneratedValue
	@Column(name="SUMMARY_ID")
	private Integer summaryId;
	
	@Column(name="BATCH_NAME")
	private String batchName;
	
	@Column(name="FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	
	@Column(name="SUCCESS_TRIGGER_COUNT")
	private Integer successTriggerCount;
	
	@Column(name="TOTAL_TRIGGER_PROCESSED")
	private Integer totalTriggerProcessed;

	public Integer getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Integer getFailureTriggerCount() {
		return failureTriggerCount;
	}

	public void setFailureTriggerCount(Integer failureTriggerCount) {
		this.failureTriggerCount = failureTriggerCount;
	}

	public Integer getSuccessTriggerCount() {
		return successTriggerCount;
	}

	public void setSuccessTriggerCount(Integer successTriggerCount) {
		this.successTriggerCount = successTriggerCount;
	}

	public Integer getTotalTriggerProcessed() {
		return totalTriggerProcessed;
	}

	public void setTotalTriggerProcessed(Integer totalTriggerProcessed) {
		this.totalTriggerProcessed = totalTriggerProcessed;
	}
	
	

}
