package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementRateBySettlementMeans implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String settlementRateIdBySettlementMeans;
	private String settlementClassificationIdBySettlementMeans;
	private Integer minimumAmount;
	private Integer maximumAmount;
	private Integer settlementComissionRate;
	private Integer settlementPriceRate;
	private Integer settlementKickbackRate1;
	private Integer settlementKickbackRate2;
	private Integer sbpsComissionRate;
	private Integer sbpsSettlementPriceRate;
	private Integer sbpsKickbackRate1;
	private Integer sbpsKickbackRate2;
	private Integer salesBillingUnitPrice;
	private Integer salesSettlementUnitPrice;
	private Integer salesKickbackRate1;
	private Integer salesKickbackRate2;
	private Integer cancellationChargeRate;
	private Integer cancellationSettlementUnitPrice;
	private Integer cancellationKickbackRate1;
	private Integer cancellationKickbackRate2;
	private Integer earlyPaymentRateForBi;
	private Integer spare1;
	private Integer spare2;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
