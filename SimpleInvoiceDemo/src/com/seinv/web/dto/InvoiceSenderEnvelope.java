package com.seinv.web.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class InvoiceSenderEnvelope implements Serializable{
	private Integer envType;
	private String  senderIdentifier;
	private Integer senderType;
	private String senderName;
	private String senderEmail;
	private String targetId;
	private Integer targetType;
	private String targetName;
	private String targetEmail;
	private Integer totalCost;
	private String comments;
	
	public Integer getEnvType() {
		return envType;
	}
	public void setEnvType(Integer envType) {
		this.envType = envType;
	}
	public String getSenderIdentifier() {
		return senderIdentifier;
	}
	public void setSenderIdentifier(String senderIdentifier) {
		this.senderIdentifier = senderIdentifier;
	}
	public Integer getSenderType() {
		return senderType;
	}
	public void setSenderType(Integer senderType) {
		this.senderType = senderType;
	}
	public String getSenderName() {
		return senderName;
	}
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getTargetId() {
		return targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}
	public Integer getTargetType() {
		return targetType;
	}
	public void setTargetType(Integer targetType) {
		this.targetType = targetType;
	}
	public String getTargetName() {
		return targetName;
	}
	public void setTargetName(String targetName) {
		this.targetName = targetName;
	}
	public String getTargetEmail() {
		return targetEmail;
	}
	public void setTargetEmail(String targetEmail) {
		this.targetEmail = targetEmail;
	}
	public Integer getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Integer totalCost) {
		this.totalCost = totalCost;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	
	
	
}
