package arraysExamples;

import java.util.Arrays;

public class StringArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringsArrayExample saExample = new StringsArrayExample();
		
		saExample.populateTheArray();
		
		System.out.println("Names in the array : "+Arrays.toString(saExample.names));
	}

}
