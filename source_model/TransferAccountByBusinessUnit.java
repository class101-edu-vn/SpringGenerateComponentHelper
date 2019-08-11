package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TransferAccountByBusinessUnit implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal transferAccountIdByBusinessUnit;
	private BigDecimal businessUnitId;
	private BigDecimal transferAccountId;
	private BigDecimal partnerId;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
