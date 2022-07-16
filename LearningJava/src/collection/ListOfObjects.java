package collection;

import java.util.ArrayList;
import java.util.List;

import inheritanceAssignment.Employee;
import inheritanceAssignment.PermanentEmployee;

public class ListOfObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> employees = new ArrayList<Employee>();
		
	//	Employee emp = new PermanentEmployee();
		
		employees.add(new Employee("Shijo", "Joesph"," 98797897979"));
		employees.add(new Employee("Rintu", "Joy"," 456645"));
		employees.add(new Employee("Gurmeen", "Kaur"," 21312"));
		employees.add(new Employee("Salinder", "Poswal"," 123142"));
		
		//Get details of Shijo
		
	//	System.out.println(employees.get(0).getFirstName()+ "  "+employees.get(0).getLastName() + "  "+employees.get(0).getSalary());
		
		for(Employee emp :employees) {
			System.out.println(emp.getFirstName());
			if(emp.getFirstName().equals("Rintu")) {
				System.out.println("Sin no of rintu : "+emp.getSinNumber());
				emp.setSinNumber("987879");
				System.out.println("Sin no of rintu : "+emp.getSinNumber());
			}
			
		}
		
	}

}
