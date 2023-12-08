package stringExamples;

import java.util.Arrays;
import java.util.Scanner;

public class StringExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Ketaki Pillay teaches Java";
		
		char[] charactersinString = s.toCharArray();
		
		System.out.println(Arrays.toString(charactersinString));
		
		System.out.println("Does string contains java : "+s.contains("Java"));
		
		System.out.println("I exist in string :"+s.indexOf('i'));
		
		System.out.println("z exist in string :"+s.indexOf('z'));
		
		System.out.println(s.concat(" and Automation Course"));
		
		String v = "Teaching";
		
		String b = "Playing";
		
		if(v.endsWith("ing")) {
			System.out.println("V ends with ing");
		}
		
		int lastIndex = s.lastIndexOf('i');
		
		System.out.println(lastIndex);
		
		
		
		System.out.println(s.replace('a', 'z'));
		
		String zip = "L4Z1C6";
		
		String str = "abc,bxs,css,def";
		
		System.out.println(Arrays.toString(str.split(",")));
		
		int index = s.indexOf("Java");
		String subject = s.substring(s.indexOf("Java"));
		System.out.println(subject);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter student name");
		String name = sc.nextLine();
		
		System.out.println("name :"+name.substring(18));
		
	}

}
