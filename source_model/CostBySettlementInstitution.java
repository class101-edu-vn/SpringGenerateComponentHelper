package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CostBySettlementInstitution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String costIdBySettlementInstitution;
	private String paymentIdBySettlementInstitution;
	private String costClassification;
	private Integer displayOrder;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;


}
