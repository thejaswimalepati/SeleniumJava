package javapractice;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueuePractice {

	public static void main(String[] args) {
		
	
	PriorityQueue<String> queue=new PriorityQueue<String>();

		queue.add("Amit");
		queue.add("Vijay");
		queue.add("Jai");
		queue.add("Raj");

		System.out.println("Head:"+queue.peek());

		Iterator<String> itr=queue.iterator();

		while(itr.hasNext()){

			System.out.println("elements"+itr.next());
		}

		queue.remove();
		
		System.out.println("After using remove method");
		Iterator<String> itr1=queue.iterator();
		
		while(itr1.hasNext()){

			System.out.println("elements"+itr1.next());
		}



	}

}
