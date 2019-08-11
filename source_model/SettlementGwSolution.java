package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SettlementGwSolutionId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementGwSolution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SettlementGwSolutionId id;
	private String receptionControlNumber;
	private String settingValue;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
