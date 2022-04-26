package a2_setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class A2_TreeSetTest {
	
	public static void main(String[] args) {
		
		TreeSet s= new TreeSet();
				
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("B");
		s.add("B");
		s.add("D");
		s.add("C");
		s.add("A");
		//s.add(null); - not allows, since allows homogeneous datatype
		
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
