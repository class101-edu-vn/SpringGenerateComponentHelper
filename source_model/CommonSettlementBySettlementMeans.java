package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CommonSettlementBySettlementMeans implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commonSettlementIdBySettlementMeans;
	private String segmentId;
	private String settlementGwid;
	private String settlementMeansCode;
	private String settlementMeansSettlementClassification;
	private String numberOfPayments;
	private String minimumFee;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
