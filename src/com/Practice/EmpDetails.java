package com.Practice;

public class EmpDetails {
	//Attributes
	int eid;
	String ename;
	int esalary;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	public EmpDetails(int eid, String ename, int esalary) {
		
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public EmpDetails() {
		
	}
	@Override
	public String toString() {
		return "EmpDetails [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	

}