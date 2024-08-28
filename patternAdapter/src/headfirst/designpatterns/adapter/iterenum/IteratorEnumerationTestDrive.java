package headfirst.designpatterns.adapter.iterenum;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		
		System.out.println("IteratorEnumeration");
		
		String[] nombres = {"Patrobas","Tercio","Andronico"};
		
		//List<String> l = new ArrayList<>(Arrays.asList(nombres));
		
		List<String> l = Arrays.asList(nombres);
		
//		l.add("Filologo");
//		l.remove(0);
		
		Iterator<String> ite = l.iterator();
		
		Enumeration<?> enumeration = new IteratorEnumeration(ite);
		
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
