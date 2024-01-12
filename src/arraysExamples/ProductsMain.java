package arraysExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ProductsMain {

	public static void main(String[] args) {

		Products products = new Products();
		
		//products.findProductExists();

		ArrayList list = new ArrayList();
		System.out.println("is list empty : "+list.isEmpty());
		list.add(1);
		list.add(new Integer(18));
		list.remove(1);
		System.out.println(list.toString());
		
		list.contains(1);
		list.clear();
		
		System.out.println(list.toString());
		
		Set<String> strings = new HashSet<String>();
		strings.add("a");
		strings.add("b");
		strings.add("a");
		System.out.println(strings.toString());
		
		Collections.sort(list);
		
	}

}
