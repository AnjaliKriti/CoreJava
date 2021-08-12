package java7program;

public class Single {
	private String name="Anjali";
	private int id=1;
	private Single () {
		
	}
	
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	
	static Single getInstance () {
		Single s= new Single();
		return (s);
	}
}
