package first;

public class split {

	public static void main(String[] args) {
		String str="joseph Engineering college";
		str = str.toLowerCase();
		int count=0;
		for(char c : str.toCharArray()) {
			if("aeiou".indexOf(c) != -1)
				count++;
		}
		System.out.println("No of Vowels are "+ count);
		//split()
		String[] arr = str.split(" ");
		for(int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i].toUpperCase());
		}
		

	}

}
