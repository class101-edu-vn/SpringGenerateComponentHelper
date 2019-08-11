package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class Segment implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String segmentId;
	private String mid;
	private String sid;
	private BigDecimal siteId;
	private BigDecimal transferAccountIdByBusinessUnit;
	private String accesstokenKey;
	private String segmentName;
	private String businessUnitId;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
