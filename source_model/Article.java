package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Article implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal articleCode;
	private String modelNumber;
	private String name;
	private String articleType;
	private BigDecimal standardPrice;
	private String deliveryRequestCompanyId;
	private String connectionGw;
	private Boolean simPresence;
	private Boolean simConfirmation;
	private BigDecimal posSystem;
	private BigDecimal bodyArticleCode;
	private String nameDisplay;
	private String descriptionDisplay;
	private String articleImageFilePath;
	private String itemDetailedDescriptionUrl;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
