package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MasterClass {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(202, "Suraj", 12, "ABC");
		Employee emp2 = new Employee(101, "Amol", 20, "PQR");
		Employee emp3 = new Employee(506, "Pramod", 18, "XYZ");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		Collections.sort(empList);
		
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		
		NameCompare nc = new NameCompare();
		Collections.sort(empList, nc);
		System.out.println("---");
		for (Employee employee : empList) {
			System.out.println(employee);
		}
		//System.out.println(empList);
		
	}
}
