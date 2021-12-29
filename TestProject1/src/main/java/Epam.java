
public class Epam {

	public static void main(String[] args) {
		m1("India");
	}
	public static void m1(String input) {
//		List[] l= new List[] {"India [IND]","Australia [AUS]"};

		String s= "India [IND]";
		String[] x=s.split(" ",2);
		String output="";
		if(input.equalsIgnoreCase(x[0])) {
			for(int i=1; i<x[1].length()-1;i++) {
				output=output + x[1].charAt(i);
			}
		}
		System.out.print(output);
	}

}
