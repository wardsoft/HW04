package Employees;

public class ContractEmployee extends Employee{
	
	public String federalTaxIdmember;
	public double hourlyRate;
	public double hoursWorked;
	
	public ContractEmployee(String federalTaxIdmember,double hourlyRate,double hoursWorked){
		super(federalTaxIdmember);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	public double calculatePay(){
		return this.hourlyRate * this.hoursWorked;
	}
	
}
