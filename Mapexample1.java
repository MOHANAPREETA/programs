package first;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
class Student{
	
}
public class Mapexample1 {

	public static void main(String[] args) {
		Map<String,Student>hm=new HashMap<String,Student>();
		hm.put("first",new Student(01,"Mythili",88));
		hm.put("second",new Student(02,"Preeta",88));
		hm.put("third",new Student(03,"Dharshini",88));
		
		Set<Entry<String,Student>> both=hm.entrySet();
		System.out.println(both);
		

	}

}
