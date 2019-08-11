package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class LpParameter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String lpParameters;
	private BigDecimal routeId;
	private BigDecimal corporateSelfEmployedCode;
	private BigDecimal businessCode;
	private BigDecimal planCategoryCode;
	private BigDecimal planCode;
	private boolean membershipInformationRegistrationScreenUsageFlag;
	private String description;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
