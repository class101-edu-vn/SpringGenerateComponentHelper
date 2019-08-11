package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SiteAndUserRelationId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SiteAndUserRelation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SiteAndUserRelationId id;
	private BigDecimal roleId;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private boolean removalFlag;
}
