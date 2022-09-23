package com.p1;

public class Department {
	int deptId;
	String deptName;
	String deptType;
	int deptMembers;
	int ratings;
	
	public Department() {
		
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptType() {
		return deptType;
	}
	public void setDeptType(String deptType) {
		this.deptType = deptType;
	}
	public int getDeptMembers() {
		return deptMembers;
	}
	public void setDeptMembers(int deptMembers) {
		this.deptMembers = deptMembers;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public Department(int deptId, String deptName, String deptType, int deptMembers, int ratings) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptType = deptType;
		this.deptMembers = deptMembers;
		this.ratings = ratings;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + ", deptType=" + deptType + ", deptMembers="
				+ deptMembers + ", ratings=" + ratings + "]";
	}
	
}
