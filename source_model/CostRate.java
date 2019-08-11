package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CostRate implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal costRateId;
	private BigDecimal priceListCode;
	private String settlementCode;
	private String settlementMeansCode;
	private String costClass;
	private String minimumAmount;
	private String maximumAmount;
	private String rate;
	private String salesAmount;
	private String cancellationAmount;
	private String applicationStartDateAndTime;
	private String applicationEndDateAndTime;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
