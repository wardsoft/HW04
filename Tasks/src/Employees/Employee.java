package Employees;

public abstract class Employee implements EmployeeInterface{
	
	public String employeeId;
	public double monthlyPayment;

	public static void main(String[] args){
		
		Employee [] employees = new Employee[4];
		
		employees[0] = new SalariedEmployee("CTW31432",35000);
		employees[1] = new ContractEmployee("NHF43242", 24, 20);
		employees[2] = new ContractEmployee("LOI734324", 52, 41);
		employees[3] = new SalariedEmployee("AAFGF34234", 22000);
		
		
		for (Employee emp : employees){
			System.out.println(emp.toString());
		}
	
	}
	
	public Employee(String employeeId){
		this.employeeId = employeeId;
	}
	
	public String getEmployeeID(){
		return this.employeeId;
	}
	
	public String toString(){
		return "[EmployeeID = " + getEmployeeID() + ", Monthly Payment = " + calculatePay() + "]";
	}
	
	
}
