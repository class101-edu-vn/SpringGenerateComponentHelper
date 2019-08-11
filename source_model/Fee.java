package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Fee implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal costId;
	private BigDecimal priceListCode;
	private String productCode;
	private String costItemCode;
	private boolean temporaryMonthlyCode;
	private String invoiceAmountListPrice;
	private String discountAmount;
	private String partition;
	private String kickbackRate1;
	private String kickbackRate2;
	private String fixedKickbackAmount1;
	private String fixedKickbackAmount2;
	private String applicationStartDateAndTime;
	private String applicationEndDateAndTime;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
