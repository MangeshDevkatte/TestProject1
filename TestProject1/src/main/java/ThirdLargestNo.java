import java.util.Arrays;

public class ThirdLargestNo {

	public static void main(String[] args) {

		int[] a=new int[]{-23,34,12,45,36,34,34,665,67};
		Arrays.sort(a);
		//		for(int x: a) {//int i=0;i<a.length;i++
		//			System.out.println(x);
		//		}
		//		System.out.println();
		System.out.println(a[a.length-3]);
	}
}
