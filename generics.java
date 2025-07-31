package first;
class Box<T>{//type
	private T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
}

public class generics {

	public static void main(String[] args) {
		Box<Integer> bi=new Box();
		bi.set(120);//passes value to T
		System.out.println(bi.get());
		Box<String> bs=new Box();
		bs.set("preeta");
		System.out.println(bs.get());
		

	}

}
