package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArrayListExamples {

	public static void main(String arg[]) {
		
		// Creating a arraylist
		ArrayList<String> list = new ArrayList<String>();

		// Wrapper Classes
//		Integer i = 10;
//		Double d = 10.9;

		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		//List<Integer> integerList = List.of(1,2,3,4,5,6);
		
		Integer[] arr = {1,2,3,4,5,6};

		// Put elements in a list
		intList.add(10);
		
		//Add another list to your list
		intList.addAll(Arrays.asList(arr));
	
		
		//Size of list 
		System.out.println(intList.size());
		
		//Find a element exists in the arraylist
		System.out.println(intList.contains(3));
		
		//Retrieve an element from array
		System.out.println(arr[2]);
		
		//Retrieve an element from arraylist
		System.out.println(intList.toString());
		
		System.out.println(intList.get(3));
		
		
		//Traditional for loop
		for(int i=0;i<intList.size();i+=2) {
			System.out.println("Traditional for loop values :"+intList.get(i));
		}
		
		//Advance for loop example or For each loop
		for(Integer pooja: intList) {
			System.out.println("For each values :"+pooja);
		}
		
		//indexOf
		
		System.out.println(intList.indexOf(10));
		
		String[] s = {"Batman","MsMarvel","WonderWomen","Heman","CaptainMarvel", "WonderWomen"};
		
		ArrayList<String> movies = new ArrayList<String>();
		
		boolean hasListAdded = movies.addAll(Arrays.asList(s));
		
		System.out.println("hasListAdded :"+hasListAdded);
		
		System.out.println(movies.contains("Spiderman"));
		System.out.println(movies.indexOf("Spiderman"));
		
		//Remove element 
		Object intRemoved = intList.remove(1);
		
		System.out.println(intList.toString());
		
		boolean movieRemoved =  movies.remove("Batman");
		
		System.out.println(movies);
	}

}
