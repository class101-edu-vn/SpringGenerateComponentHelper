package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.NegativeInformationId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class NegativeInformation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private NegativeInformationId id;
	private String contractorName;
	private Boolean merchantStatusClassification;
	private Boolean cancellationCategory;
	private Date createdDate;
	private String createdBy;
	private Date updateDate;
	private String updatedBy;
	private boolean removalFlag;

}
