package abstraction;

public abstract class CovidRestrictions {

	static int a = 1;
//	 enforce capacity limit - concrete method
//	public void ensureCapcityLimit(int storelimit) {
//		 if(storelimit <50) {
//			 System.out.println("Allow user");
//			 
//		 }else {
//			 System.out.println("Stop people from entering the store");
//		 }
//	}
	
	//Abstract Method 
	public abstract  void ensureCapcityLimit(int storeLimit);
	
	public static void method1() {
		
	}
}
