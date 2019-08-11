package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Contractee implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal contracteeId;
	private Boolean category;
	private Long corporateNumber;
	private String contracteeName;
	private String contracteeNameKana;
	private String contracteeNameChineseNotation;
	private Integer registeredAddressPostalCode;
	private String registeredAddressPrefecture;
	private String registeredAddressCity;
	private String registeredAddressStreet;
	private int locationPostalCode;
	private String locationPrefecture;
	private String locationPrefectureKana;
	private String locationCity;
	private String locationCityKana;
	private String locationStreetAddress;
	private String locationStreetAddressKana;
	private String locationBuildingName;
	private String locationBuildingNameKana;
	private Long locationPhoneNumber;
	private Long locationFaxNumber;
	private Date establishmentDate;
	private String capitalStock;
	private String annualSales;
	private String businessLineup;
	private String companyHomepageUrl;
	private String numberOfBusinessShops;
	private String numberOfEmployees;
	private String representativesLastName;
	private String representativesLastNameKana;
	private String representativesName;
	private String representativesNameKana;
	private String representativesTitle;
	private String representativesGender;
	private String representativesDob;
	private Integer representativeResidencePostalCode;
	private String representativeResidencePrefecture;
	private String representativeResidencePrefectureKana;
	private String representativeResidenceCity;
	private String representativeResidenceCityKana;
	private String representativeResidenceStreetAddress;
	private String representativeResidenceStreetAddressKana;
	private String representativeResidenceBuildingName;
	private String representativeResidenceBuildingNameKana;
	private boolean status;
	private Boolean lostTrialExsitFlag;
	private String lostTrialYear;
	private Byte lostTrialDescriptionCode;
	private String lostTrialDetails;
	private boolean enterpriseFlag;
	private Boolean bankruptcyFlag;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
