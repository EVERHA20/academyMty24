package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

public class EnumerationIteratorTestDrive {
	public static void main (String args[]) {
		
		String[] nombres = {"Patrobas","Tercio","Andronico"};
		
		Vector<String> v = new Vector<String>(Arrays.asList(nombres));
		
		Enumeration<String> enumeration = v.elements();
		
		Iterator<?> iterator = new EnumerationIterator(enumeration);
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
