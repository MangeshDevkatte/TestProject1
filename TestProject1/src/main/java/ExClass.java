
public class ExClass {
	public static void main(String[] args) {
		String s="   m a ng  e   s h";
		//		String x="";
		//		for(int i=0;i<s.length();i++) {
		//			if(s.charAt(i)!=' ') {
		//				x=x+s.charAt(i);
		//			}
		//		}
		s=s.replaceAll(" ","");
		System.out.println(s);

		String s2 = "      Geeks     for    Geeks        ";
		s2=s2.replaceAll(" ","");
		System.out.println(s2);

		int [] arr = new int [] {5, 2, 8, 7, 1};     
		int temp = 0;    
  
		System.out.println("Elements of original array: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");    
		}    
 
		for (int i = 0; i < arr.length; i++) {     
			for (int j = i+1; j < arr.length; j++) {     
				if(arr[i] > arr[j]) {    
					temp = arr[i];    
					arr[i] = arr[j];    
					arr[j] = temp;    
				}     
			}     
		}         
        System.out.println("\nElements of array sorted in descending order: ");    
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }   
        String r="";
        for (int i = s.length()-1; i >=0 ; i--) {   
        	r=r+s.charAt(i);    
		}    
        System.out.println("\n"+r);
	}

}
