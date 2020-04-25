package com.capg.spring.beans;

import java.util.Iterator;
import java.util.List;

public class SBU {
		private String sbuCode;
		private String sbuName;
		private String sbuHead;
		
		private List<Employee> emp;
		
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
		public List<Employee> getEmp() {
			return emp;
		}
		public void setEmp(List<Employee> emp) {
			this.emp = emp;
		}
		
		
		@Override
		public String toString() {
			return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "\nEmployee Details \n ------------------------- \n"+emp;
		}
		
		
}



