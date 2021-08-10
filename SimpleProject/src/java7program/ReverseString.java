package java7program;

public class ReverseString {
	
	public String reverseStr (String str) {
		
		int leng=str.length();
		String newStr="";
		for(int i = leng -1; i>=0; i--) {
			newStr= newStr+str.substring(i,i+1);
			
		}
		
		return newStr;
	}

	public static void main(String[] args) {
		
		ReverseString rs= new ReverseString();
		
		System.out.println(rs.reverseStr("Anjali"));

	}

}
