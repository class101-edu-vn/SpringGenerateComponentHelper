package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CostRateBySettlementInstitution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String costRateIdBySettlementInstitution;
	private String costIdBySettlementInstitution;
	private Integer minimumAmount;
	private Integer maximumAmount;
	private Integer costRate;
	private Integer salesUnitPrice;
	private Integer cancellationUnitPrice;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
