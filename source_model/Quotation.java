package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Quotation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal quotationId;
	private String quotationNumber;
	private BigDecimal branchNumber;
	private BigDecimal receptionManagementNumber;
	private String quotationDateAndTime;
	private String quotationCreatedBy;
	private Date quotationExpirationDate;
	private String quotationProjectName;
	private String priceListCode;
	private String fileId;
	private String totalInitialCost;
	private String totalMonthlyCost;
	private String incomeAndExpenditureCalculationResult;
	private String quotationApprovalRequired;
	private String quotationStatus;
	private String checkoutRequired;
	private String checkoutConfirmationStatus;
	private Date merchantConsentDate;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
