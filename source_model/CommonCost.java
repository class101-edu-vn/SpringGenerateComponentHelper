package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CommonCost implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commonCostId;
	private String commonSettlementId;
	private String displayOrder;
	private String initialOrFixedCostFlag;
	private String costItemCode;
	private String billingAmount;
	private String settlementPrice;
	private String kickbackRate1;
	private String kickbackRate2;
	private String fixedKickbackAmount1;
	private String fixedKickbackAmount2;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
