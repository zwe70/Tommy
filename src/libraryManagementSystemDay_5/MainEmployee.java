package libraryManagementSystemDay_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MainEmployee {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static Employee[] employeeArray = new Employee[100];
	
	public static Employee getEmployeeInfo() throws IOException {
		System.out.print("Enter employee name : ");
		String name = br.readLine();
		System.out.print("Enter employee age : ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("Enter employee address : ");
		String address = br.readLine();
		
		Employee employee = new Employee(name,age,address);
		
		 return employee;
	}
	
	public static void displayEmployeeInfo() {
		System.out.println("\nEmployee Information : ");
		for(int i = 0;i < Employee.getEmployeeCount();i++) {
			Employee emp = employeeArray[i];
			emp.display();
		}
	}
	
	

	public static void main(String[] args) throws IOException {
		String flag;
		do {
			Employee emp = getEmployeeInfo();
			employeeArray[Employee.getEmployeeCount()] = emp;  
			System.out.println("Do you want to add more 'yes' or 'no' : ");
			flag = br.readLine();
		}
		while(flag.equalsIgnoreCase("yes"));
		displayEmployeeInfo();
		

	}

}
