package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TransferAccount implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal transferAccountId;
	private boolean merchantPartnerCategory;
	private BigDecimal businessUnitId;
	private BigDecimal partnerId;
	private String name;
	private String paymentPendingFlag;
	private String transferErrorFlag;
	private String mainFlag;
	private String accountFinancialInstitutionName;
	private String accountFinancialInstitutionCode;
	private String accountBranchName;
	private String accountBranchCode;
	private String accountType;
	private Integer accountNumber;
	private String accountHolderName;
	private String accountHolderNameKana;
	private Boolean invoiceDeliveryDestinationSelection;
	private String invoiceDeliveryDestinationCompanyName;
	private String invoiceDeliveryDestinationDepartmentName;
	private String invoiceDeliveryDestinationPostalCode;
	private String invoiceDeliveryDestinationPrefecture;
	private String invoiceDeliveryDestinationCity;
	private String invoiceDeliveryDestinationStreetAddress;
	private String invoiceDeliveryDestinationBuildingName;
	private String invoiceDeliveryDestinationPersonInChargeName;
	private String invoiceAddressDestinationPhoneNumber;
	private String invoiceDeliveryDestinationFaxNumber;
	private String invoiceDeliveryDestinationEmail;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
