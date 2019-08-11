package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class CommonSettlement implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String commonSettlementId;
	private String segmentId;
	private String comissionChargeMethod;
	private String nonClosingCarryForwardSettingAmount;
	private String monthlyClosingMinimumComission;
	private String kickBackDestinationId1;
	private String kickbackMethod1;
	private String kickbackPeriod1;
	private String kickBackDestinationId2;
	private String kickbackMethod2;
	private String kickbackPeriod2;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
