package arrays;

import java.util.Arrays;

public class ListOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//40 Students identified by rollno
		//100 addresses
		
		
		
		String day1="Monday";
		String day2="Tuesday";
		String day3="Wednesday";
		String day4="Thursday";
		String day5="Friday";
		String day6="Saturday";
		String day7="Sunday";
		//Declared a variable
		String day10 = null;
		
		System.out.println(day10);
		
		//Define array 
//		String daysInAWeek  = "Monday";
//		daysInAWeek = "Tuesday";
		
		//Declaring and initializing an array
		String[] daysInAWeek = new String[7]; //length of an array
		
		int[] firstTenNumbers = new int[10];
		
		int[] rollNos = new int[40]; 
		
		String[] addresses = new String[100];
		
		double[] salaries = new double[10];
		
		System.out.println(daysInAWeek);
		
		System.out.println("Days in a week "+Arrays.toString(daysInAWeek));
		
//		System.out.println(Arrays.toString(firstTenNumbers));
//		
//		System.out.println(Arrays.toString(salaries));
//		
//		System.out.println(day1);
		
		//Filling in/ Populate an array 
		int index =1;
		
		daysInAWeek[1] = "Monday";
		daysInAWeek[1]="Tuesday";
		
		daysInAWeek[7]="Sunday";
		
		System.out.println("Days in a week "+Arrays.toString(daysInAWeek));
		
		
		
		rollNos[0] = 1;
		
		
		
	}

}
