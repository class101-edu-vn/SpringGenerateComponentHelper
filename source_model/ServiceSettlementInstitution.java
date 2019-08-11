package com.lyquyduong2;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.lyquyduong2.key.ServiceSettlementInstitutionId;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class ServiceSettlementInstitution implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ServiceSettlementInstitutionId id;
	private String receptionControlNumber;
	private String applicationStartDate;
	private String contractType;
	private String deliveryStatus;
	private String deliveryRequestDate;
	private String deliveryCompletionDate;
	private String acqVFlag;
	private String acqMFlag;

}
