package a2_setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class A4_LinkedHashSet {
	
	public static void main(String[] args) {
		
		LinkedHashSet s= new LinkedHashSet();
				
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("B");
		s.add(null);
		s.add(1);
		s.add("C");
		s.add("A");
		
		Iterator it= s.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		
		/*
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next());
		
		System.out.println(it.hasNext());
		System.out.println(it.next()); <- reads memory until this
		
		System.out.println(it.hasNext()); <- error will occur as no such element
		System.out.println(it.next());
		
		*/
		
	}

}
