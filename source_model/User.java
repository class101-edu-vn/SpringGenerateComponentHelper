package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal userId;
	private String userLastName;
	private String userFirstName;
	private String userFamilyNameKana;
	private String userGivenNameKana;
	private String phoneNumber;
	private String faxNumber;
	private String corporateNumber;
	private String email;
	private String password;
	private String passwordExpiredDate;
	private boolean temporaryPasswordFlag;
	private BigDecimal invalidPasswordUseCount;
	private BigDecimal lockFlag;
	private boolean temporaryRegisterationFlag;
	private Date temporaryRegisterationExpiredDate;
	private BigDecimal pushNotificationPermit;
	private BigDecimal mailNotificationPermit;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
