package Employees;

public class SalariedEmployee extends Employee{
	
	public String socialSecurityNumber;
	public double monthlyPayment;
	
	public SalariedEmployee(String socialSecurityNumber,double monthlyPayment){
		super(socialSecurityNumber);
		this.monthlyPayment = monthlyPayment;
	}
	
	public double calculatePay(){
		return this.monthlyPayment;
	}
	
}
