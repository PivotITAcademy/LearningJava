package abstraction;

public class ConvenienceStore extends CovidRestrictions {

	@Override
	public void ensureCapcityLimit(int storelimit) {
		// TODO Auto-generated method stub
		 if(storelimit <5) {
			 System.out.println("Allow user");
			 
		 }else {
			 System.out.println("Stop people from entering the store");
		 }
	}

	
	
	
//	public void ensureCapacity(){
//		//We cannot create an object of abstract class
//		CovidRestrictions cr = new CovidRestrictions() ;
//		cr.ensureCapcityLimit(0);
//	}
}
