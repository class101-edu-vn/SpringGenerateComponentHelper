package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SettlementClassificationBySettlementMeansId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementClassificationBySettlementMeans implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SettlementClassificationBySettlementMeansId id;

}
