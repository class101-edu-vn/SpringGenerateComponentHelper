package com.lyquyduong2;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class DeviceManagement implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal deviceManagementId;
	private String siteId;
	private String receptionControlNumber;
	private String deviceIdentificationNumber;
	private String deviceId;
	private String serialNumber;
	private String expectedStartDate;
	private String expectedCancellationDate;

}
