package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class OfacSanctionerDb implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal ofacSanctionerId;
	private String name;
	private Boolean corporateSelfEmployedCategory;
	private String others;
	private Date createdDate;
	private String createdBy;
	private Date updateDate;
	private String updatedBy;
	private boolean removalFlag;

	public OfacSanctionerDb() {
	}

	public OfacSanctionerDb(BigDecimal ofacSanctionerId, Date createdDate, String createdBy, Date updateDate,
			String updatedBy, boolean removalFlag) {
		this.ofacSanctionerId = ofacSanctionerId;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
		this.updatedBy = updatedBy;
		this.removalFlag = removalFlag;
	}

	public OfacSanctionerDb(BigDecimal ofacSanctionerId, String name, Boolean corporateSelfEmployedCategory,
			String others, Date createdDate, String createdBy, Date updateDate, String updatedBy, boolean removalFlag) {
		this.ofacSanctionerId = ofacSanctionerId;
		this.name = name;
		this.corporateSelfEmployedCategory = corporateSelfEmployedCategory;
		this.others = others;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
		this.updateDate = updateDate;
		this.updatedBy = updatedBy;
		this.removalFlag = removalFlag;
	}

	public BigDecimal getOfacSanctionerId() {
		return this.ofacSanctionerId;
	}

	public void setOfacSanctionerId(BigDecimal ofacSanctionerId) {
		this.ofacSanctionerId = ofacSanctionerId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getCorporateSelfEmployedCategory() {
		return this.corporateSelfEmployedCategory;
	}

	public void setCorporateSelfEmployedCategory(Boolean corporateSelfEmployedCategory) {
		this.corporateSelfEmployedCategory = corporateSelfEmployedCategory;
	}

	public String getOthers() {
		return this.others;
	}

	public void setOthers(String others) {
		this.others = others;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public boolean isRemovalFlag() {
		return this.removalFlag;
	}

	public void setRemovalFlag(boolean removalFlag) {
		this.removalFlag = removalFlag;
	}

}
