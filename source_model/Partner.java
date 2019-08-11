package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Partner implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String partnerId;
	private String partnerName;
	private String partnerCode;
	private String initialKickbackFee;
	private String kickbackMethod;
	private String kickbackRate;
	private String kickbackPeriod;
	private String bankAccountId;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
