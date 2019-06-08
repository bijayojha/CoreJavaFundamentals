package string;

public class StringReverseLessIteration {
	public static void main(String[] args) {
		String str = "BijayKumarA";
		char[] orgArray=str.toCharArray();
		for(int i =0,j=orgArray.length-1;i<(orgArray.length/2);i++,j--){
			char temp=orgArray[j];
			orgArray[j]=orgArray[i];
			orgArray[i]=temp;
			
			
		}
		System.out.println("This is the Array");
		
		for(char ch:orgArray){
			System.out.print(ch);
		}
	}

}