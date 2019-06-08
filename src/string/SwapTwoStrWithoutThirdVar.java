package string;

class SwapTwoStrWithoutThirdVar {
	public static void main(String args[]) {
		String firstString = "Bijay";
		String secondString = "Kumar";

		System.out.println("Strings before swap: First Sring = " + firstString + " and Second String = " + secondString);

		firstString = firstString + secondString;

		secondString = firstString.substring(0, firstString.length() - secondString.length());

		firstString = firstString.substring(secondString.length());

		System.out.println("Strings after swap: First String = " + firstString + " and Second String = " + secondString);
	}
}