package HashMap;

import java.util.HashMap;

public class HashMapExample {
	
	static boolean answer=false;

	public static void main(String[] args) {
		HashMap<String, String> hashMap=new HashMap<String, String>();
		hashMap.put("Name", "Perumal");
		hashMap.put("Age", "23");
		hashMap.put("Gender", "Male");
		hashMap.put("State", "TamilNadu");
		
		System.out.println(hashMap.keySet());
		
		System.out.println(hashMap.values());
		
		System.out.println(hashMap.entrySet());
		

		 System.out.println(hashMap.remove("Name"));
		System.out.println(hashMap.get("Age"));
		System.out.println(hashMap.get("Gender"));
		System.out.println(hashMap.get("State"));
		System.out.println(hashMap.size());
		System.out.println("contains : "+hashMap.containsKey("Address"));
		System.out.println("contains: "+hashMap.containsKey("Name"));
		System.out.println("contains: "+hashMap.remove("Name"));
		System.out.println("contains: "+hashMap.containsKey("Name"));
		
		HashMap<Integer, String> hashMap2=new HashMap<Integer, String>();
		hashMap2.put(10, "Arun");
		System.out.println(hashMap2.get(10));
		
		HashMap<String, Integer> hashMap3=new HashMap<String, Integer>();
		hashMap3.put("test", 29);
		System.out.println(hashMap3.get("test"));
		
		HashMap<Integer, Double> hashMap4=new HashMap<Integer, Double>();
		hashMap4.put(11, 23.98);
		System.out.println(hashMap4.get(11)); 
		
		
		String search="34w";
		hashMap.forEach((key,value)->{
			if(key.contains(search)|| value.contains(search)) {
				
				answer=true;
			}
			
		});
		System.out.println(search+" : "+answer);
		
	}
}