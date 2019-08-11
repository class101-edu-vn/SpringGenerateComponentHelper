package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Route implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal routeId;
	private String routeName;
	private BigDecimal partnerId;
	private String businessCategoryLargeId;
	private String businessCategorySmallId;
	private String simpleIndustryCode;
	private String partnerAccountUsageFlag;
	private String serviceStartRequestReceptionCategory;
	private boolean deliveryConfirmationWaitingFlag;
	private boolean deliveryDeliveryWaitingFlag;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
