package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TermsBySettlementInstitution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal routeId;
	private BigDecimal settlementMeansId;
	private BigDecimal contractFormId;
	private BigDecimal settlementInstitutionId;
	private Date createdDateTime;
	private String createdBy;
	private Date updateDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
