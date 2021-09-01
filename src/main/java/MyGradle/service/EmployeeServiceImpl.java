package MyGradle.service;

import java.util.List;

import MyGradle.dao.EmployeeDao;
import MyGradle.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeDao empDao;
	public EmployeeServiceImpl(EmployeeDao empDao)
	{
		this.empDao=empDao;
	}
	public Employee getEmployeeById(int empId)
	{
		Employee emp=empDao.findEmloyeeById(empId);
		return emp;
	}
	public List<Employee> getEmployees(){
		System.out.println("Service -In getEmployees");
		List<Employee> empList=EmployeeDao.getEmployees();
		return empList;
	}
	public List<Employee> getEmployeeByDept(){
		return null;
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void insertEmployeeWithValues() {
		// TODO Auto-generated method stub
		
	}
	public void insertEmployee(Employee e) {
		
	}


}
