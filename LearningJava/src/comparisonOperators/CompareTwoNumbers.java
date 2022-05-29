package comparisonOperators;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		
		int a= 1;
		int b =7;
		
		//If a is equal to b : yes or no 
		// Compare primitive data types , we use == operator
		//Resultant of any comparison/condition is always a boolean value 
		
		 boolean areTwoNumsEqual = a == b;
		 
		 boolean isGreaterThan = a>b;
		 
		 System.out.println("a is greater than b :"+isGreaterThan);
		 
		 //is or has
		 
		 boolean isSmallerThan = a<b;
		 
		 System.out.println("a is smaller than b :"+isSmallerThan);
		 
		 //Compare laxmi and athira age to find if its equal 
		 
		 int laxmiAge =20;
		 int athiraAge =20;
		 
		boolean  areAgesEqual = laxmiAge == athiraAge;
		
		System.out.println("Laxmi and athira age is equal : "+areAgesEqual);

	}

}
