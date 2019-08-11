package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CommonCostBySettlementMeans implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commonCostIdBySettlementMeans;
	private String commonSettlementIdBySettlementMeans;
	private String displayOrder;
	private String initialFixedCostFlag;
	private String costItemCode;
	private String billingAmount;
	private String settlementPrice;
	private String partition;
	private String kickbackRate1;
	private String kickbackRate2;
	private String fixedKickbackAmount1;
	private String fixedKickbackAmount2;

}
