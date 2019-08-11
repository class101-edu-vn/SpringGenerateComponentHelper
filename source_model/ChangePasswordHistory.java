package com.lyquyduong2;


import java.math.BigDecimal;
import java.sql.Blob;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class ChangePasswordHistory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal userId;
	private Blob password;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private BigDecimal removalFlag;

}
