package MyGradle;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import MyGradle.dao.EmployeeDao;
import MyGradle.dto.Employee;
import MyGradle.service.EmployeeService;
import MyGradle.service.EmployeeServiceImpl;

class TestEmployeeSet {
	static EmployeeService employeeService = null;
	static EmployeeDao mockEmployeeDao =null;
	private static Employee emp1;
	private static Employee emp2;

		@BeforeAll
		static void setUpBeforeClass() throws Exception {
			mockEmployeeDao = Mockito.mock(EmployeeDao.class);
			employeeService = new EmployeeServiceImpl(mockEmployeeDao);
			emp1=new Employee();
			emp1.setEmpNo(1);
			emp1.setEmpName("Hemant");
			emp1.setHiredate(LocalDate.of(2018,11,22));
			emp2=new Employee();
			emp2.setEmpNo(2);
			emp2.setEmpName("Varsha");
			emp2.setHiredate(LocalDate.of(2018,12,02));
			Mockito.when(mockEmployeeDao.getEmployees()).thenReturn(Arrays.asList(emp1,emp2));
			
		}

		@Test
		void getAllEmployeetest() {
			List<Employee> allEmployee=employeeService.getEmployees();
			assertNotNull(allEmployee);
			assertEquals(2,allEmployee.size());
			assertNotEquals(3, allEmployee.size());
			
		}

	}



