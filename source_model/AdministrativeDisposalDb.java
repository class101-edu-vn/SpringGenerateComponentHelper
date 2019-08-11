package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.AdministrativeDisposalDbId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class AdministrativeDisposalDb implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private AdministrativeDisposalDbId id;
	private String companyName;
	private String companyAddressPostalCode;
	private String companyAddressPrefecture;
	private String companyAddressCity;
	private String companyAddressStreetAddress;
	private String companyAddressBuildingName;
	private Long phoneNumber;
	private String representativesName;
	private String dispositionDescription;
	private String dispositionDetails;
	private String publishedSiteName;
	private String dispositionDescriptionUrl;
	private Date createdDate;
	private String createdBy;
	private Date updateDate;
	private String updatedBy;
	private boolean removalFlag;
}
