package first;
import java.util.*;
class Salary{
	 HashMap<String,Integer> emplist=new HashMap<>();
	 public  int totalSalary()
	 {
		 int total=0;
		 for(Integer i:emplist.values())
			 total+=i;
		 return total;
		 
	 }
	 public String getSalary(String designation)
	 {
		 if(emplist.containsKey(designation))
			 return "Salary is "+emplist.get(designation);
		 else
			 return "No designation Match";
	 }
	 public void updateSalary(String designation,int newSalary)
	 {
		 emplist.put(designation, newSalary);
	 }
			 
}

public class empM1 {

	public static void main(String[] args) {
		Salary obj=new Salary();
		obj.emplist.put("CEO", 20000);
		obj.emplist.put("DEVELOPER", 5000);
		System.out.println(obj.totalSalary());
		obj.updateSalary("DEVELOPER", 6000);
		System.out.println(obj.getSalary("DEVELOPER"));

	}

}
