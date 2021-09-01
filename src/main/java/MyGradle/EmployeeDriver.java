package MyGradle;

import MyGradle.dao.EmployeeDao;
import MyGradle.dao.EmployeeDaoImpl;
import MyGradle.dto.Employee;
import MyGradle.service.EmployeeService;
import MyGradle.service.EmployeeServiceImpl;

import java.time.LocalDate;
import java.util.List;

public class EmployeeDriver {
	Employee emp;
	public static void main(String args[]) {
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		EmployeeService employeeService = new EmployeeServiceImpl(employeeDao);
		
		Employee emp = new Employee();
		emp.setEmpNo(9);
		emp.setEmpName("magesh");
		emp.setDeptNo(1);
        emp.setHiredate(LocalDate.of(2019,6,30));
		
		/*List<Employee> empList = employeeService.getEmployees();
		System.out.println("back with employee list " + empList.size());
		for(Employee employee : empList) {
			System.out.println(employee);
		}*/

		employeeService.insertEmployeeWithValues();
		//employeeService.insertEmployee(emp);
	}

}
