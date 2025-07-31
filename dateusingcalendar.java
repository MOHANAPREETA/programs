package first;

import java.util.Calendar;

public class dateusingcalendar {

	
		  public static void main(String[] args) {
			    Calendar calendar = Calendar.getInstance();
			    calendar.set(2022, 0, 18); 
			    System.out.println(calendar.getTime());
			    
			    //Get Calendar Date Info

			    System.out.println("Year: " + calendar.get(Calendar.YEAR));
			    System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); 
			    System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));
			    System.out.println("Hour: " + calendar.get(Calendar.HOUR_OF_DAY));
			    System.out.println("Minute: " + calendar.get(Calendar.MINUTE));
			    
			    //Get Calendar Max Values

			    System.out.println("Max Year: " + calendar.getMaximum(Calendar.YEAR));
			    System.out.println("Max Month: " + (calendar.getMaximum(Calendar.MONTH) + 1)); 
			    System.out.println("Max Week: " + calendar.getMaximum(Calendar.WEEK_OF_YEAR));
			    System.out.println("Max Date: " + calendar.getMaximum(Calendar.DAY_OF_MONTH));
			    
			   // Get Calendar Min Values

			    System.out.println("Min Year: " + calendar.getMinimum(Calendar.YEAR));
			    System.out.println("Min Month: " + (calendar.getMinimum(Calendar.MONTH) + 1)); 
			    System.out.println("Min Week: " + calendar.getMinimum(Calendar.WEEK_OF_YEAR));
			    System.out.println("Min Date: " + calendar.getMinimum(Calendar.DAY_OF_MONTH));




	}

}
