package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class BusinessType implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal businessTypeId;
	private String largeCategory;
	private String mediumCategory;
	private String businessTypeName;
	private BigDecimal handlingClassificationCode;
	private BigDecimal documentId;
	private BigDecimal executionPlan;
	private BigDecimal fraudRisk;
	private BigDecimal complaintRisk;
	private BigDecimal otherRisks;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
