package comparisonOperators;

public class ComparisonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compare phone password
		int phonePassword =1234;
		int enteredPassword =1234;
		
		boolean isPasswordCorrect = phonePassword==enteredPassword;
		
		System.out.println("is password correct :"+isPasswordCorrect);
		
		// Are two discounts same
		
		int discount =10;
		
		int exactDiscount =14;
		
		boolean isDiscountSame = discount == exactDiscount;
		
		System.out.println("are the discounts same : "+isDiscountSame);
		
		
		// Compare speed of cars to optimum speed
		
		int optimumSpeed = 50;
		int currentSpeed = 60;
		
		boolean isSpeeding = currentSpeed>optimumSpeed;
		
		System.out.println("is the person speeding"+isSpeeding);
		
		//Compare results of two operations
		
		int a = 5;
		int b=10;
		
		int sum = a+b;
		System.out.println("sum : "+sum);
		
		int multiply = a*b;
		
		System.out.println("multiply : "+multiply);
		
		boolean isCalculation = sum != multiply;
		
		System.out.println("is calculation equals : "+isCalculation);
		
		//Find if the employee is eligible for paid vacation
		
		int requiredDaysWorked = 365;
		
		int daysWorkedByEmployee = 390;
		
		double salaryEarned = 70000;
		
		double requiredSalary = 60000;
		
		boolean isDayConditionMet = daysWorkedByEmployee>=requiredDaysWorked; // Find if the employee has worked the required no of days?
		
		boolean isSalaryConditionMet = salaryEarned>=requiredSalary; // Find if the employee is earning the min required salary?
		
		boolean isEligibleForPaidVacation = isDayConditionMet && isSalaryConditionMet;
		
		System.out.println("Is employee elgible for paid vacation :"+isEligibleForPaidVacation);
		
		
		
	}

}
