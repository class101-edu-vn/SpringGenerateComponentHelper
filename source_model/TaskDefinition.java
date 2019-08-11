package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TaskDefinition implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal taskId;
	private BigDecimal flowId;
	private BigDecimal operationOptionGroup;
	private String cronScheduleDescription;
	private String implementationClassName;
	private String argumentsToBePassedToTheImplementation;
	private String name;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
