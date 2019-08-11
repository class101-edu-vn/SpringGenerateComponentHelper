package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class ApplicableSettlementRate implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal applicableSettlementRateId;
	private BigDecimal quotationId;
	private String settlementMeansCode;
	private String costItemCode;
	private boolean minimumAmount;
	private String maximumAmount;
	private String settlementFeeRate;
	private String settlementFeeRateChange;
	private String settlementPartitionRate;
	private String settlementKickbackRate1;
	private String settlementKickbackRate2;
	private String sbpsFeeRate;
	private String sbpsPartitionFeeRate;
	private String sbpsKickbackRate1;
	private String sbpsKickbackRate2;
	private String salesBillingUnitPrice;
	private String salesPartitionUnitPrice;
	private String salesKickbackRate1;
	private String salesKickbackRate2;
	private String cancellationChargeUnitPrice;
	private String cancellationPartitionUnitPrice;
	private String cancellationKickbackRate1;
	private String cancellationKickbackFeeRate2;
	private String earlyPaymentRateForBi;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;


}
