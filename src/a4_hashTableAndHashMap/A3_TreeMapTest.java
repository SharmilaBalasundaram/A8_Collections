package a4_hashTableAndHashMap;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class A3_TreeMapTest {

	public static void main(String[] args) {
		
		TreeMap map= new TreeMap();
		map.put("username", "Sharmila");
		map.put("password", "12345");
		map.put("domain", "Testing");
		map.put("company", "infosys");
		map.put("location", "pune");
		map.put("username", null);
		map.put("location", "guindy");
		map.put("city", "guindy");
		//map.put(null, "Guindy"); 

		
		System.out.println(map.get("password"));
		
		Set s=map.keySet();
		Iterator it=s.iterator();
		while (it.hasNext()){
		Object keys=it.next();
		System.out.println(keys+" - "+map.get(keys));
		}
		
		
	}
}
