package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.ServiceSettlementMeansId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class ServiceSettlementMeans implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ServiceSettlementMeansId id;
	private String receptionControlNumber;
	private String applicationStartDate;
	private String settingStatus;
	private String installationLinkageControlParameter;
	private String installationAwaitFlag;

}
