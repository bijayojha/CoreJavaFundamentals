package string;

public class SwapTwoStrWithoutThirdVar1 {

	public static void main(String[] args) {
		String s1 = "Bijay", s2 = "Ojha"; 
		
		System.out.println("The value before swap s1= "+ s1 +"  And s2 = " + s2);
		s1 = s1+s2;
		s2 = s1.substring(0,(s1.length()-s2.length()));
		s1 = s1.substring(s2.length());
		System.out.println("The value after swap s1= "+ s1 +"  And s2 = " + s2);
	}

}