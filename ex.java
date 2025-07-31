package first;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       try {
		FileReader r = new FileReader("C:\\Users\\preeta\\Desktop\\capgemini\\first\\src\\first");
		char[] ch = null;
		while((r.read(ch))!= -1) {
			System.out.println(ch);
			r.read(ch);
		}
	   } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }catch(IOException e)
       {
		   e.printStackTrace();
       }
	}

}
