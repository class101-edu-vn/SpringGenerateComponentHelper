package com.lyquyduong2;


import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="")
public class MailTemplate implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BigDecimal mailTemplateId;
	private String fromEmail;
	private String subject;
	private String body;
	private String cc;
	private String bcc;
	private String returnPath;
	private Date createdDate;
	private String createdBy;
	private Date updatedDate;
	private String updatedBy;
	private BigDecimal removalFlag;

}
