package a4_hashTableAndHashMap;

import java.util.Enumeration;
import java.util.Hashtable;

public class A1_HashTableTest {
	
	public static void main(String[] args) {
		
		
		Hashtable table= new Hashtable();
		table.put("username", "Sharmila");
		table.put("password", "12345");
		table.put("domain", "Testing");
		table.put("company", "infosys");
		table.put("location", "pune");
		table.put("location", "guindy");
		table.put("city", "guindy");

		//table.put("username", null); - error
		//table.put(null, "Guindy"); - error
		
		//System.out.println(table.get("company"));
		//System.out.println(table);
		
		Enumeration e= table.keys();
		//System.out.println(e.hasMoreElements());
		//System.out.println(e.nextElement());
		
		while (e.hasMoreElements()){
        String keys=(String) e.nextElement();
        System.out.println(keys+" - "+table.get(keys));
		}
		
	}

}
