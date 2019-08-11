package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SegmentAndUserRelationId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SegmentAndUserRelation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SegmentAndUserRelationId id;
	private String createdDate;
	private String createdBy;
	private String updatedDate;
	private String updatedBy;
	private boolean removalFlag;

}
