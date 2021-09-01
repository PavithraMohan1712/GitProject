package MyGradle.dto;

import java.time.LocalDate;

public class Employee {
	private int empNo;
	private String empName;
	//private String job;
	private LocalDate hiredate;
	//private double salary;
	private int deptNo;
	public int getEmpNo() {
		return empNo;
	}
	public String getEmpName() {
		return empName;
	}
	/*public String getJob() {
		return job;
	}*/
	public LocalDate getHiredate() {
		return hiredate;
	}
	/*public double getSalary() {
		return salary;
	}*/
	public int getDeptNo() {
		return deptNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/*public void setJob(String job) {
		this.job = job;
	}*/
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	/*public void setSalary(double salary) {
		this.salary = salary;
	}*/
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public void setJob(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
