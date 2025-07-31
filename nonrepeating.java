package first;

public class nonrepeating {

	public static void main(String[] args) {
         String str="hello";
         int[] c=new int[256]; 
         for(int i=0;i<str.length();i++)
         {
        	 c[str.charAt(i)]++;
         }
         for(int i=0;i<str.length();i++)
         {
        	 if(c[str.charAt(i)]==1)
        	 {
        		 System.out.println(str.charAt(i));
        		 break;
        	 }
         }
         
       
	}

}
