package string;

public class StringImmutableCheck {

	public static void main(String[] args) {
		String fstString="Bijay";
		//for checking the immutable lets modify the string by using uppercase method. if the string will show BIJAY then its immutable else not
		
		fstString.toUpperCase();
		String secString=fstString.toUpperCase(); 
		System.out.println(secString);
		System.out.println(fstString);
		System.out.println(fstString.toUpperCase());
		System.out.println(fstString);
	}
	
}