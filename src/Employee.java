public class Employee {

	private int employeeMainId;

	private String firstName;

	private String lastName;

	private String emailId;

	private double salary;

	public int getEmployeeMainId() {
		return employeeMainId;
	}

	public void setEmployeeMainId(int employeeMainId) {
		this.employeeMainId = employeeMainId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double calculateSalary()
	{
		return getSalary();
	}

}
