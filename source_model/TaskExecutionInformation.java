package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.TaskExecutionInformationId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TaskExecutionInformation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TaskExecutionInformationId id;
	private BigDecimal updateCounter;
	private BigDecimal runningNodeId;
	private BigDecimal runningStatus;
	private BigDecimal transitionBitGroup;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
