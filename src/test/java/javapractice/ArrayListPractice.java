package javapractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Thejaswi");
		list.add("Thejaswi123");
		list.add("Thejaswi1234");
		list.add("Thejaswi12345");
		
		Iterator itr=list.iterator();
		
		
	while(itr.hasNext()) {
		System.out.println("Elements in the given list: "+itr.next());
		
	}

	}

}
