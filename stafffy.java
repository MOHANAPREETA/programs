package first;
record Staff(int id,String name)
{
	
}

public class stafffy {

	public static void main(String[] args) {
		Staff st=new Staff(11,"ramesh");
		System.out.println(st.id());
		System.out.println(
				st.name());

	}

}
