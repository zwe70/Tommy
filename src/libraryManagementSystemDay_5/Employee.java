package libraryManagementSystemDay_5;

public class Employee {
	private String name;
	private int age;
	private String address;
	private static int employeeCount = 0;
	
	public Employee() {
		
	}
	
	public Employee(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
		employeeCount++;
	}
	
	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
		System.out.println("______________________" );
	}

	public static int getEmployeeCount() {
		return employeeCount;
	}


}
