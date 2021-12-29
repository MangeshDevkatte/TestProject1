
public class StringOper {

	public static void main(String[] args) {
		String cities= "Nagpur Pune Bangalore Chennai Hyderabad Delhi Mumbai";
//		char s=' ';
//		int count=1;
//		int l= cities.length();
//		
//		for(int i=0; i<l; i++) {
//			if(s==cities.charAt(i)) {
//				count++;
//			}
//		}
//		System.out.println(count);
		
		String[] arr= cities.split(" ");
		
		for(String a:arr) {
			System.out.println(a);
		}
		System.out.println(arr.length);

	}

}
