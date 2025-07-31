package first;
interface logger{
	void log(String message);
}
interface levellogger extends logger{
	void loginfo(String message);
	void logWarning(String message);
	void logerror(String message);
	
	
}
interface formatlogger extends levellogger
{
	String format(String message, String level);
}
class consolelogger implements formatlogger{

	@Override
	public void loginfo(String message) {
		// TODO Auto-generated method stub
		System.out.println(format(message,"LoggingInfo"));
		
	}

	@Override
	public void logWarning(String message) {
		// TODO Auto-generated method stub
		System.out.println(format(message,"LoggingWarning"));	
	}

	@Override
	public void logerror(String message) {
		// TODO Auto-generated method stub
		System.err.println(format(message,"Default"));	
	}

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(format(message,"Logging"));	
	}

	@Override
	public String format(String message, String level) {
		// TODO Auto-generated method stub
		return "Message["+message+"] Level"+level+"-"+java.time.LocalDateTime.now();
	}
	
}

public class test1 {
	public static void main(String[]args)
	{
		formatlogger log =new consolelogger();
		log.log("Basic Log");
		log.loginfo("Application started");
		log.logWarning("BatteryLow");
		log.logerror("Null pointer exception");
	}

}
