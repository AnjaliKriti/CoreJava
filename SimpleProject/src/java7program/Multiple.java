package java7program;

public class Multiple {

	public static void main(String[] args) {
		//Creating object of Employee class and printing that object
		Employee e = new Employee("Anjali");
		System.out.println(e); // output: java7program.Employee@7de26db8
		
		//Printing a string
		String s = new String ("Anjali");
		System.out.println(s); // output : Anjali
		
		//Creating object of SuperClass
		SuperClass sup = new SuperClass();
		sup.printing("Anjali", 1); // It's a superclass. Name: Anjali id: 1
		
		//Creating object of SubClass
		SuperClass sub = new SubClass();
		sub.printing("Kriti", 2);  //It's a subclass. Name: Kriti id: 2

		//Calling  getter of SingletonClass Single
		
		System.out.println(Single.getInstance().getId());
		
		//trying to create Singleton class object
		//Single s2 = new Single();  Compile time error- constructor is not visible
		
	}

}
