package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SettlementInstitutionAndUserRelationId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementInstitutionAndUserRelation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SettlementInstitutionAndUserRelationId id;
	private String roleId;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
