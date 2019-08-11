package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementMeans implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal settlementMeansCode;
	private String nameOfSettlementMeans;
	private BigDecimal settlementCategoryCode;
	private String productCode;
	private boolean connectionMethodLinkTypeFlag;
	private boolean connectionMethodApiTypeSupportFlag;
	private boolean billingMethodEachFlag;
	private boolean billingMethodContinueSimpleFlag;
	private boolean billingMethodContinueRegularConstantFlag;
	private boolean salesMethodAutomaticSalesFlag;
	private boolean salesMethodDesignatedSalesFlag;
	private String settlementNameDisplay;
	private String helpWordingDisplay;
	private String logoImageFilePath;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
