package java7program;

public class SuperClass {

	SubClass sb = new SubClass();
	public void printing (String n, int i) {
	
		System.out.println("It's a superclass. Name: "+ n + " id: "+i);
		sb.printing(n, i);
	}
	
}
