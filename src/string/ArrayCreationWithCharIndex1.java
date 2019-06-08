package string;

public class ArrayCreationWithCharIndex1 {
	
	public static void main(String[] args) {
				
		String word1 = "Sabita";
		String word=word1.toUpperCase();
		char[] eachCharInWord = word.toCharArray();
		int[][] container = new int[eachCharInWord.length][];
		int[] eachArray;
		for(int i= 0;i<eachCharInWord.length;i++){
			int position = eachCharInWord[i]-64;
			eachArray= new int[position];
			container[i] = eachArray;
		}
		for(int i = 0 ; i<container.length;i++){
			System.out.println(container[i].length);
		}
	}


	
}