package MyGradle.dao;

import java.util.List;
import MyGradle.dto.*;

public interface EmployeeDao {
	public Employee findEmployeeById(int empId);
	public static List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Employee> findEmployeedByDept();
	public void deleteEmployee(Employee emp);
	Employee findEmloyeeById(int empId);
	List<Employee> findEmployeesByDept();
	void insertEmployeeWithValues();
	public void insertEmployee(Employee emp);
	


}


