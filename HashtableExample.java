package first;
import java.util.Hashtable;
public class HashtableExample {

	public static void main(String[] args) {
		Hashtable<Integer,String> table=new Hashtable<Integer,String>(10);
		Hashtable<String,String> table1=new Hashtable<String,String>(10);
		table.put(103,"Trichy");
		table.put(123,"Salem");
		table.put(278,"Karur");
		table.put(566,"Chennai");
		table1.put("103", "Trichy");
		table1.put("123","Salem");
		table1.put("278","Karur");
		table1.put("566","Chennai");
		
		for(Integer key:table.keySet())
			System.out.println(key.hashCode()%10+"\t"+key+"\t"+table.get(key));
		   // System.out.println(key.hashCode()+"\t"+key+"\t"+table.get(key));............return the index as 5 digit number
		//the output will be as 56212   103   Trichy
		
		
		for(String key:table1.keySet())
			System.out.println(key.hashCode()+"\t"+key+"\t"+table1.get(key));
	}

}
