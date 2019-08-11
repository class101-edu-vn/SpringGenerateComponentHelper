package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TaskLogInformation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal logId;
	private Date logTime;
	private BigDecimal runNodeId;
	private BigDecimal workId;
	private BigDecimal taskId;
	private BigDecimal resultCode;
	private BigDecimal nextTastId;
	private BigDecimal optionalIntegerValue;
	private String optionalMemo;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
