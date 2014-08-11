package com.cd.web.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="helloInputDTO")
public class HelloInputDTO implements Serializable {
	private String name;
	private String helloMsg;
	private String owner;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHelloMsg() {
		return helloMsg;
	}
	public void setHelloMsg(String helloMsg) {
		this.helloMsg = helloMsg;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
