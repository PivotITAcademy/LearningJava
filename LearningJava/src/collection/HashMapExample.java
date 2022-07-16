package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> map = new HashMap<String, String>();
		
		//Add elements in map
		
		map.put("88686", "Shijo");
		
		map.put("97979", "Rintu");
		
		map.put("8974", "Gurmeen");
		
		map.put("97979", "Neetu");
		
		System.out.println("Map size : "+map.size());
		
		System.out.println("Get details of 8974  : "+map.get("97979"));
//		
//		System.out.println("Does map contains key   876: " +map.containsKey("8974"));
//		
//		List< HashMap<String,String> > mapList = new ArrayList <HashMap<String,String>>();
//		
//		mapList.add(map);
//		
//		HashMap<String, List<String>> mapofList;
		
		//Phone Number list 
		
		Map<String, List<String>> phoneNumbers = new HashMap<String, List<String>>();
		
		String[] numbers = {"87687686","97777"};
		
		phoneNumbers.put("Manvir", Arrays.asList(numbers));
		
		List<String> s = phoneNumbers.get("Manvir");
		
		System.out.println(s.get(0));
		
		//Retrieve all the keys - use those keys to iterate over the map
		
	}

}
