package java7program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IdentifyDeletedRecordOfList {	
	
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(4);
		list.add(6);
		list.add(23);
		list.add(45);
		list.add(69);
		list.add(35);
		list.add(8);
		list.add(23);
		list.add(57);
		list.add(78);
		list.add(44);
		list.add(13);
		list.add(99);
		list.add(85);
		
		ArrayList<Integer> newList = new ArrayList<Integer>(list);
		
		list.remove(5);
		newList.removeAll(list);
		System.out.println(newList);

	}

}
