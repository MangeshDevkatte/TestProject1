
public class x1 {

	public static void main(String[] args) {
		int [] a=new int[] {1,0,0,2,3,0,4,0,9};
		int[] b=new int[a.length];
		int n=0;
		for(int i=0; i<a.length; i++) {
			System.out.print(" "+a[i]);
			if(a[i]!=0) {
				b[n]=a[i];
				n++;
			}
		}
		
		System.out.println();
		for(int i=0; i<b.length; i++) {
			System.out.print(" "+b[i]);
		}
		

	}

}
