package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class NotificationQueue implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal queueId;
	private BigDecimal userId;
	private BigDecimal sentBy;
	private String sentTo;
	private String cc;
	private String bcc;
	private String contentMessage;
	private String attachmentPath;
	private BigDecimal status;
	private BigDecimal mailTemplateId;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private BigDecimal removalFlag;

}
