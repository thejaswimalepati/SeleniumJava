package javapractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map= new HashMap<Integer, String>();

		map.put(1,"Thejaswi");
		map.put(2,"Tej1");
		map.put(3,"Tej2");

		Set set=map.entrySet();

		Iterator itr=set.iterator();

		while(itr.hasNext()){
		     Map.Entry entry=(Map.Entry)itr.next();

		    System.out.println(entry.getKey()+" : "+entry.getValue());

		     
		}


	}

}
