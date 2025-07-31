package first;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;


public class Mapexample {

	public static void main(String[] args) {
		Map<String, String> hm=new HashMap<String, String>();
		hm.put("name","Ramesh");
		hm.put("age" , "21");
		hm.put("city", "Chennai");
		int age=Integer.parseInt(hm.get("age"));
		Set<String> keys=hm.keySet();
		Collection<String> values=hm.values();
		Set<Entry<String,String>> both=hm.entrySet();
		System.out.println(age);
		System.out.println(keys);
		System.out.println(values);
		System.out.println(both);
		
	}

}

	
