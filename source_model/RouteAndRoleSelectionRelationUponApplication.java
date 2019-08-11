package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.RouteAndRoleSelectionRelationUponApplicationId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class RouteAndRoleSelectionRelationUponApplication implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RouteAndRoleSelectionRelationUponApplicationId id;

}
