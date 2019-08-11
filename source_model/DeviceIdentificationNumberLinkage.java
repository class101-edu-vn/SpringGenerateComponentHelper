package com.lyquyduong2;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class DeviceIdentificationNumberLinkage implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal deviceIdentificationNumber;
	private String settlementInstitutionCode;
	private String merchantNumber;
	private String deviceIdentificationNumberNotificationDate;

}
