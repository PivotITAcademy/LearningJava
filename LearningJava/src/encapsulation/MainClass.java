package encapsulation;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee employee = new Employee(89795);
		boolean isCRA = true;
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
		//Reference variable = object 
		// CRA craUser = new CRA(true);
		
		employee.setSinNumber(23456,new CRA(true) ,6666);

		System.out.println("Sin num :"+employee.getSinNumber());
		
		//employee.setSinNumber(342432,false,1234);
		
		System.out.println("Sin num :"+employee.getSinNumber());
		
		//only CRA can change the SIN Number
		
		//employee.setSinNumber(23456, true,1234);

		System.out.println("Sin num :"+employee.getSinNumber());
		
		
		
		
		
	}

}
