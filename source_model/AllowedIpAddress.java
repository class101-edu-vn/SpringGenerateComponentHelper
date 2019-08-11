package com.lyquyduong2;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class AllowedIpAddress implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal allowedIpAddressId;
	private String ipAddress;
	private BigDecimal ipAddressType;
	private String createdDate;
	private String createdBy;
	private String updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
