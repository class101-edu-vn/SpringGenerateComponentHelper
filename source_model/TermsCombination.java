package com.lyquyduong2;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.TermsCombinationId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class TermsCombination implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TermsCombinationId id;
	private Date createdDateTime;
	private String createdBy;
	private Date updatedDateTime;
	private String updatedBy;
	private boolean removalFlag;

}
