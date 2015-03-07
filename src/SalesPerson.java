public class SalesPerson extends Employee {

	private int numberOfEmployeesCaptured;

	public int getNumberOfEmployeesCaptured() {
		return numberOfEmployeesCaptured;
	}

	public void setNumberOfEmployeesCaptured(int numberOfEmployeesCaptured) {
		this.numberOfEmployeesCaptured = numberOfEmployeesCaptured;
	}

    public double calculateSalary() {
    
    	return super.calculateSalary() + 1000 * getNumberOfEmployeesCaptured();
    }
    
}
