package chapter9;

public class Employee extends Person{ 
	
	// now the Employee class has access to all of the methods that we created in the Person class.
	private String employeeId;
	private String title;
	
	public Employee() {
		super("Agie");
		System.out.println("Default constructor in Employee");
	}
	
	
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

}
