package com.lyquyduong2;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class ServiceSettlementGw implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal segmentId;
	private String settlementGwid;
	private String receptionControlNumber;
	private String applicationStartDate;
	private String settingStatus;

}
