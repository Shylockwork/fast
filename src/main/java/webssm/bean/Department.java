package webssm.bean;

import java.io.Serializable;

public class Department implements Serializable{

	private static final long serialVersionUID = -5144752246304871572L;
	private Integer deptId;
	private String deptName;
	private String deptLocation;
	
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
}
