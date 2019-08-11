package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SettlementMeansSolutionId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementMeansSolution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SettlementMeansSolutionId id;
	private char receptionControlNumber;
	private Character settingValue;

}
