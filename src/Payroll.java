public class Payroll {
	public static void showEmployee(Employee tempEmployee) {
		
		if(tempEmployee instanceof Employee)
			System.out.println("Name\t=\t" + tempEmployee.getFirstName() + " " + tempEmployee.getLastName()
					+ "\nCompany ID\t=\t" + tempEmployee.getEmployeeMainId()
					+ "\nMain Salary\t=\t" + tempEmployee.getSalary()
					+ "\nEmail ID\t=\t" + tempEmployee.getEmailId());
		
		if(tempEmployee instanceof SalesPerson)
			System.out.println("Employees Captured\t=\t" + ((SalesPerson)tempEmployee).getNumberOfCustomersCaptured());
		
		if(tempEmployee instanceof Developer)
			System.out.println("Current Project\t=\t" + ((Developer)tempEmployee).getCurrentProject());
		
	}	
	
}
