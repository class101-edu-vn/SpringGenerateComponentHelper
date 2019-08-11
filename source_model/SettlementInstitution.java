package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementInstitution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal settlementInstitutionCode;
	private String settlementInstitutionName;
	private BigDecimal settlementMeansCode;
	private BigDecimal applicationPriority;
	private BigDecimal basicParameterSet;
	private BigDecimal downloadFileType;
	private BigDecimal reExaminationFlag;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
