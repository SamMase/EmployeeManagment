public class EmployeeTest {

	public static void main(String[] args) {

		Employee firstEmployee = EmployeeFactory.create("Pulkit", "Shukla", 900000.0);
		Developer firstDeveloper = EmployeeFactory.create("Madhur", "Bhatnagar", 800000.0, "Mota Madhur");
		SalesPerson firstSalesPerson = EmployeeFactory.create("Shubham", "Verma", 700000.0, 88);

		showEmployee(firstEmployee);
		showEmployee(firstDeveloper);
		showEmployee(firstSalesPerson);

	}

	private static void showEmployee(Employee tempEmployee) {

		if (tempEmployee instanceof Employee)
			System.out.println("Name\t=\t" + tempEmployee.getFirstName() + " " + tempEmployee.getLastName()
					+ "\nCompany ID\t=\t" + tempEmployee.getEmployeeMainId() + "\nMain Salary\t=\t"
					+ tempEmployee.getSalary() + "\nEmail ID\t=\t" + tempEmployee.getEmailId());

		if (tempEmployee instanceof SalesPerson)
			System.out.println("Employees Captured\t=\t" + ((SalesPerson) tempEmployee).getNumberOfEmployeesCaptured());

		if (tempEmployee instanceof Developer)
			System.out.println("Current Project\t=\t" + ((Developer) tempEmployee).getCurrentProject());

	}

}
