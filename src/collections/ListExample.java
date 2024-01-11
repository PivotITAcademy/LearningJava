package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

	
	public static void main(String arg[]) {
		
		int[] num = new int[10];
		
		//Parent ref variable and child object
		List<Integer> parentRefListVariable = new ArrayList<Integer>();
		
		ArrayList<Integer> number = new ArrayList<Integer>();
		
		
		parentRefListVariable.add(2);
		
		//Populate the list
		
		for(int i=0;i<10;i++) {
			number.add(i);
		}
		
		System.out.println(number.toString());
		
		//number.add(5,10);
		
		number.set(5, 10);
		
		System.out.println(number.toString());
		
		//Find an element in array
		
		System.out.println("Does the list contains 10 :"+number.contains(10));
		
		 Object[] obj =  number.toArray();
		 
		//Retrieve the value 
		 
		System.out.println(number.get(number.indexOf(4)));
		 
		
		//Sort an list
		
		Collections.sort(number);
				
		System.out.println("After sorting :"+number.toString());
		
		
		//Object Example
		boolean isPresent=false;
		String enteredName = "Tresa";
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Parul",16));
		
		students.add(new Student("Tresa",15));
		
		Student student= null;
		//Find if Himal exists in the student list
		for(int i =0; i<students.size();i++) {
			if(	students.get(i).getName().equals(enteredName)) {
				isPresent=true;
				student= students.get(i);
				break;
			}
		}
		
		if(isPresent) {
		System.out.println(enteredName+" is present in the list ");
		System.out.println("and his/her age is "+student.getAge());
		
		}else {
			System.out.println(enteredName+" is not present in the list");
		}
		
	}
}
