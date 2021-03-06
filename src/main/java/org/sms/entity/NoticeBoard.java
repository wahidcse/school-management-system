package org.sms.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class NoticeBoard {
	@Id
	@GeneratedValue
	private int id;
	private String notice;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "published_date", columnDefinition="TIMESTAMP")
	private Date publishedDate;
	

}
