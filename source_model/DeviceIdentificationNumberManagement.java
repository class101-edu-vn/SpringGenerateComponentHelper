package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class DeviceIdentificationNumberManagement implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String deviceIdentificationNumber;
	private String siteId;
	private String type;

}
