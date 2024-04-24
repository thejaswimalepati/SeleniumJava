package javapractice;

import java.util.HashSet;
import java.util.Iterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class SetCollectionPractice {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();
		
		set.add("Thejaswi");
		set.add("Ripal");
		set.add("Tulica");
		set.add("Thejaswi");
		
		Iterator<String> itr=set.iterator();
		
		while(itr.hasNext()) {
			System.out.println("Elements in the given set: "+itr.next());
			
		}

	}

}
