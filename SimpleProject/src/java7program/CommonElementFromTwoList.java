package java7program;

import java.util.ArrayList;

public class CommonElementFromTwoList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		ArrayList<Integer> secondList = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);
		
		secondList.add(1);
		secondList.add(2);
		secondList.add(3);
		secondList.add(4);
		secondList.add(5);
		
		secondList.retainAll(list);
		System.out.println(secondList);

	}

}
