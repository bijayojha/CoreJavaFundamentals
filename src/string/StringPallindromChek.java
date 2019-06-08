package string;

public class StringPallindromChek {
	public static void main(String[] args) {
		String str = "ABBA";
		char[] orgArray = str.toCharArray();
		int count = 0;
		for (int i = 0, j = orgArray.length - 1; i < (orgArray.length / 2); i++, j--) {
			if (orgArray[i] != orgArray[j]) {
				System.out.println("String is NOT a pallindrom ");
				break;
			} else {
				count++;
				
			}
		}
		if (count == (orgArray.length / 2)) {
			System.out.println("Pallindrom");
		}

	}

}