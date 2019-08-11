package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.SettlementAttributeParameterId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class SettlementAttributeParameter implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SettlementAttributeParameterId id;
	private String receptionControlNumber;
	private String settingValue;

}
