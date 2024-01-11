package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import methods.Product;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,String> users = new HashMap<String,String>();
		
		users.put("parul@gmail.com", "password");
		
		users.put("archi@gmail.com", "password");
		users.put("ankit@gmail.com", "abcd1234");
		users.put("Jimna@gmail.com", "p@ssword");
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter user name");
//		
//		String userName = sc.next();
//		
//		System.out.println("Enter the password");
//		
//		String password = sc.next();
//		
//		String pass_word = "";
//		pass_word = users.get(userName);
//		
//		if(pass_word.equals(password)) {
//			System.out.println("User authentication successful");
//		}else {
//			System.out.println("invalid username or password");
//		}
		
		
		HashMap<String,Product> products = new HashMap<String,Product>();
		
		products.put("A1B236", new Product("S13",10 , "Samsung"));
		
		System.out.println((products.get("A1B236")).getName());
	}

}
