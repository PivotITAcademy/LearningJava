package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExamples {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		
		set.add(2);
		
		set.add(3);
		
		set.add(1);
	
		System.out.println(set.toString());
		
		Set<Integer> treeset = new TreeSet<Integer>();
		
		treeset.add(5);
		
		treeset.add(1);
		
		treeset.add(4);
		
		treeset.add(2);
		
		treeset.add(1);
		
		System.out.println(treeset);
		
		
		Set<String> names = new TreeSet<String>();
		
		names.add("Parul");
		names.add("Lijosh");
		names.add("Ankit");
		
		names.add("Tresa");
		names.add("Jimna");
		
		System.out.println(names);
		
		
	}
}
