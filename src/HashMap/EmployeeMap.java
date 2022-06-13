package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap {

	public static void main(String[] args) {

		//<k,v>
		//non order based --> does not maintan index/order
		//can have only one null key but multiple null values
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Tom", "SDET1");
		map.put("Peter", "SDET2");
		map.put("Lisa", "SDET3");
		map.put("Naveen", "QA Manager");
		map.put(null, "Fresher1");
		
		map.forEach((k,v) -> System.out.println(k + ":" + v));
		
		
		
//		map.put(null, "Fresher2");
//		map.put("Lisa", "SDET4");
//		map.put("Shifa", null);
//		map.put("Ravi", null);

		
//		System.out.println(map.get("Tom"));
//		System.out.println(map.get("Jay"));
//		System.out.println(map.get(null));
//		System.out.println(map.get("Lisa"));
//		System.out.println(map.get("Shifa"));
//		System.out.println(map.get("Ravi"));

		Map<Integer, Integer> marksMap = new HashMap<Integer, Integer>();
		marksMap.put(1,100);
		marksMap.put(2,300);
		marksMap.put(3,400);
		marksMap.put(4,500);
		marksMap.put(null,600);

		marksMap.forEach((k,v) -> System.out.println(k+":"+v));
		
		//
		//Map<String, Double> brMap = new HashMap<String, Double>();   // no sorting when key is string
		//Map<String, Double> brMap = new LinkedHashMap<String, Double>();   // while fetching data is sorted as it was supplied.
		Map<String, Double> brMap = new TreeMap<String, Double>();   // while fetching data is sorted based on keys

		brMap.put("chrome", 91.1);
		brMap.put("firefox", 89.1);
		brMap.put("edge", 19.2);
		brMap.put("safari", 9.9);

		brMap.forEach((k,v) -> System.out.println(k+":"+v));
		
	}

}
