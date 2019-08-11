package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class ApplicationInformation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal receptionManagementNumber;
	private BigDecimal applicationType;
	private BigDecimal applicationCategory;
	private String projectTitle;
	private String caseDetails;
	private String applicationReceptionDateAndTime;
	private String desiredChangeDate;
	private String desiredInstallationDate;
	private String internalExaminationStatus;
	private String merchantInputStateContracteeInformation;
	private Date membershipRegistrationConfirmationDateContracteeInformation;
	private String businessUnitInputStatus;
	private String merchantInputStatusBankAccountInformation;
	private Date merchantRegistrationConfirmationDateBankAccountInformation;
	private String memberStoreInputStatusSiteInformation;
	private Date membershipRegistrationConfirmationDateSiteInformation;
	private String merchantInputStatusApplicationItems;
	private Date merchantRegistrationConfirmationDateAndTimeAppliedGoods;
	private String merchantInputStatusOptional;
	private String segmentInputStatus;
	private String merchantInputStatusSystemSetting;
	private Date membershipRegistrationConfirmationDateSystemSetting;
	private BigDecimal siteId;
	private BigDecimal businessUnitId;
	private BigDecimal contracteeId;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
