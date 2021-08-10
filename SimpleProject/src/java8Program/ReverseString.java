package java8Program;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class ReverseString {

	public static void main(String[] args) {
		ReverseString rs= new ReverseString();
		StringBuilder reversedWord= rs.reverseStr("My Name is Anjali");
		System.out.println(reversedWord);
	}
	
	public StringBuilder reverseStr (String str) {
		
		String word[] = str.split(" ");
		StringBuilder sb = new StringBuilder();
		Stream <String> streamOfWords = Arrays.stream(word);
				
		streamOfWords.forEach(w-> {
			Function <String,String> reverse = s -> new StringBuilder(s).reverse().toString();
			String newWord= reverse.apply(w);
			sb.append(newWord + " ");
			});
		
			return sb;
	}

}
