package com.capg.spring.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("sbu")
@Scope("singleton")
public class SBU {
	
	
	@Value("PES-BU")
	private String sbuCode;
	
	@Value("Product Engineering Services")
	private String sbuName;
	
	@Value("Kiran Rao")
	private String sbuHead;
	
	
	public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	

}
