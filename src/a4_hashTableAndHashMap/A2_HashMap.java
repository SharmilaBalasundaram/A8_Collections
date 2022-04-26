package a4_hashTableAndHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class A2_HashMap {

	public static void main(String[] args) {
		
		HashMap map= new HashMap();
		map.put("username", "Sharmila");
		map.put("password", "12345");
		map.put("domain", "Testing");
		map.put("company", "infosys");
		map.put("location", "pune");
		map.put("username", null);
		map.put(null, "Guindy"); 
		map.put(null, "Saligramam"); 
		map.put("location", "guindy");
		map.put("city", "guindy");


		
		System.out.println(map.get("password"));
		
		Set s=map.keySet();
		Iterator it=s.iterator();
		while (it.hasNext()){
		Object keys=it.next();
		System.out.println(keys+" - "+map.get(keys));
		}
		
		
	}
}
