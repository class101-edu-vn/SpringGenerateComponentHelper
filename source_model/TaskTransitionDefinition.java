package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.TaskTransitionDefinitionId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TaskTransitionDefinition implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TaskTransitionDefinitionId id;
	private BigDecimal transitionType;
	private BigDecimal operationOptionGroup;
	private BigDecimal optionalIntegerValue;
	private String name;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
