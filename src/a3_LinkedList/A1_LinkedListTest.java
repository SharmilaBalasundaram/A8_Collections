package a3_LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class A1_LinkedListTest {
	
	public static void main(String[] args) {
		
		LinkedList s= new LinkedList();
		
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
		
	}

}
