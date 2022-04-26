package a2_setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class A1_HashsetTest {
	
	public static void main(String[] args) {
		
		//HashSet a= new HashSet();
		
		Set s= new HashSet();
		
		s.add("A");
		s.add("C");
		s.add("D");
		s.add("B");
		s.add("B");
		s.add("D");
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
