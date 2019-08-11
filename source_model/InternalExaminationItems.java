package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class InternalExaminationItems implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal internalExaminationItemId;
	private String examinationName;
	private boolean manualAutomaticExecutionFlag;
	private String automaticExecutionBatch;
	private BigDecimal decisionMakerDecisionFlag;
	private boolean batchStopFlag;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
