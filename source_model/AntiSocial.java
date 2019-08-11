package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class AntiSocial implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean corporateSelfEmployedCategory;
	private Date criterionDate;
	private BigDecimal dataProviderCategory;
	private BigDecimal controlNumber;
	private String nameKanji;
	private String nameKana;
	private Byte age;
	private String corporateName;
	private String address;
	private String disposalSource;
	private String informationSource;
	private String attributeGangStatus;
	private String reason;
	private String antiSocialInformation;
	private String remarks;
	private Date irrelevantDateOfBirth;
	private Date createdDate;
	private String createdBy;
	private Date updateDate;
	private String updatedBy;
	private boolean removalFlag;


}
