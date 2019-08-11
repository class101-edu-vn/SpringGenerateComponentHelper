package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class ApplicableCost implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal applicableCostId;
	private BigDecimal quotationId;
	private String productCode;
	private String costCode;
	private boolean oneTimeMonthlyCode;
	private String billingAmountListPrice;
	private String chargeAmountChange;
	private String discountAmount;
	private String partition;
	private String kickbackRate1;
	private String kickbackRate2;
	private String fixedKickbackAmount1;
	private String fixedKickbackAmount2;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
