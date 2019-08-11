package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementMeansByPlan implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal planCode;
	private BigDecimal settlementMeansCode;
	private boolean defaultValue;
	private boolean defaultChangeFlag;
	private String displayOrder;
	private boolean contractForm;
	private boolean recommendedFlag;
	private String recommendedWording;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
