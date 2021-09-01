package MyGradle.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import MyGradle.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao  {
	
	List<Employee> empList=new ArrayList<Employee>();
	public List<Employee> getEmployees(){
		
    Connection conn =null;
		
		try {
			conn = DBUtil.getDBConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select empno, ename, hiredate from emp");
		 //System.out.println("DAO In getEmployees");
		while (rs.next()) {	
		   Employee employee = new Employee();
		   employee.setEmpNo(rs.getInt("empno"));
		   employee.setEmpName(rs.getString("ename"));
		   employee.setHiredate(rs.getDate("hiredate").toLocalDate());
		   employee.setDeptNo(rs.getInt("deptno"));
		   empList.add(employee);
		}
		   
		/* employee = new Employee();
		 employee.setEmpNo(2);
		 employee.setEmpName("varsha");
		 employee.setHiredate(LocalDate.of(2016,10,02));
		 empList.add(employee);
		 return empList;*/
	
		 
	}catch(SQLException e2) {
		e2.printStackTrace();
	}
		return empList;
	}
	@Override
	public Employee findEmloyeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findEmployeesByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public Employee findEmployeeById(int empId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Employee> findEmployeedByDept() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void insertEmployeeWithValues() {
		Connection conn =null;
		
		try {
			conn = DBUtil.getDBConnection();
			Statement stmt = conn.createStatement();
			
			int count = stmt.executeUpdate("insert into emp values(21,'priya',1,'2018-11-12')");
			System.out.println("record is inserted successfully " + count);
			
		}catch(SQLException e){
			e.printStackTrace();
			
		}
	}
	public void insertEmployee(Employee e) {
		Connection conn = null;
		try {
			conn = DBUtil.getDBConnection();
			String sql = "insert into emp values(?,?,?,?)";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, e.getEmpNo());
			pstmt.setString(2, e.getEmpName());
			pstmt.setInt(3, e.getDeptNo());
			pstmt.setDate(4, Date.valueOf(e.getHiredate()));
			
			int count = pstmt.executeUpdate();
			
			System.out.println("record is inserted successfully" + count);
		}catch(SQLException e1){
			e1.printStackTrace();
			
		}
	}
}
	


