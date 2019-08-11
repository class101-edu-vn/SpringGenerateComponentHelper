package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class NegativePostalCodeDb implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String postalCode;
	private Date createdDate;
	private String createdBy;
	private Date updateDate;
	private String updatedBy;
	private boolean removalFlag;

}
