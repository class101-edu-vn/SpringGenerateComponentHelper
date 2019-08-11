package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SelectionInformationTermsBySettlementInstitutionId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SelectionInformationTermsBySettlementInstitution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SelectionInformationTermsBySettlementInstitutionId id;
	private BigDecimal termsSetId;
	private BigDecimal priority;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
