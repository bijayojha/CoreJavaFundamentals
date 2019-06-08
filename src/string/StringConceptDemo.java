package string;

public class StringConceptDemo {

	public static void main(String[] args) {
		String orgString = "Bijay";
		int strLen = orgString.length();
		String s = "";
		for (int i = strLen - 1; i >= strLen - 3; i--) {
			s = s + orgString.charAt(i) + " ";
		}
		System.out.println(s);
	}
}