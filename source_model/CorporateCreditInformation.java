package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CorporateCreditInformation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal corporateInformationId;
	private Long corporateNumber;
	private Short tsrScores;
	private String tsrResponse;
	private Boolean creditRating;
	private Short riskScore;
	private String riskScoreResponse;
	private Date createdDate;
	private String createdBy;
	private Date updateDate;
	private String updatedBy;
	private boolean removalFlag;

}
