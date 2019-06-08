package string;

public class ArrayCreationWithCharIndex {
	
	static char[] englishAlphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

	public static void main(String[] args) {
		
		
		String word1 = "FABI";
		String word=word1.toUpperCase();
		char[] eachCharInWord = word.toCharArray();
		int[][] container = new int[eachCharInWord.length][];
		int[] eachArray;
		for(int i= 0;i<eachCharInWord.length;i++){
			int position = getPositionOfChar(eachCharInWord[i]);
			eachArray= new int[position];
			container[i] = eachArray;
		}
		for(int i = 0 ; i<container.length;i++){
			System.out.println(container[i].length);
		}
	}

	private static int getPositionOfChar(char c) {
		int position =0;
		for(int i = 0;i <englishAlphabet.length ; i++){
			if(englishAlphabet[i] == c){
				position = i+1;
			}
		}
		return position;
	}
	//verify result
	
}
