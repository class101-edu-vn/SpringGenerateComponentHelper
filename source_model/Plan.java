package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Plan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal planCode;
	private String planName;
	private String planExplanation;
	private Date applicationStartDateAndTime;
	private Date applicationEndDateAndTime;
	private String businessCode;
	private String planCategoryCode;
	private String corporateOfferFlag;
	private String selfEmployedProvideFlag;
	private String nameDisplay;
	private String featuresDisplay;
	private String initialCostDisplay;
	private String monthlyFeeDisplay;
	private String remarksColumnDisplay;
	private String notesDisplay;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
