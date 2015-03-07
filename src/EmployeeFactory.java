public class EmployeeFactory {

	private static int incrementalID = 1;

	public static Developer create(String firstName, String lastName, double salary, String currentProject) {

		Developer tempDeveloper = new Developer();

		updateEmployee(firstName, lastName, salary, tempDeveloper);

		tempDeveloper.setCurrentProject(currentProject);

		return tempDeveloper;
	}

	public static SalesPerson create(String firstName, String lastName, double salary, int numberOfEmployeesCaptured) {

		SalesPerson tempSalesPerson = new SalesPerson();

		updateEmployee(firstName, lastName, salary, tempSalesPerson);

		tempSalesPerson.setNumberOfEmployeesCaptured(numberOfEmployeesCaptured);

		return tempSalesPerson;
	}

	public static Employee create(String firstName, String lastName, double salary) {

		Employee tempEmployee = new Employee();

		updateEmployee(firstName, lastName, salary, tempEmployee);

		return tempEmployee;
	}

	private static void updateEmployee(String firstName, String lastName, double salary, Employee tempEmployee) {

		tempEmployee.setEmailId(firstName.toLowerCase() + "." + lastName.toLowerCase() + "@snailark.in");
		tempEmployee.setEmployeeMainId(incrementalID++);
		tempEmployee.setFirstName(firstName);
		tempEmployee.setLastName(lastName);
		tempEmployee.setSalary(salary);
	}

}