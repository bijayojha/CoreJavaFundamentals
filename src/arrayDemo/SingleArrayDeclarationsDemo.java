package arrayDemo;

public class SingleArrayDeclarationsDemo {
	public static void main(String[] args) {
		// int arr[] = new int[4];
		// int []arr=new int[4];
		// int[] arr=new int[4];
		int[] arr = new int[4];
		int[] arr1=new int[0];
		System.out.println(arr1.length);
//		arr1[0]=15;
		//System.out.println(arr[0]);

		// insert the values into the array

		for (int i = 0; i < 4; i++) {
			arr[i] = i;
		}
		// Dispaly the values present in the array

		for (int i = 0; i < 4; i++) {
			System.out.print(arr[i] + "  ");
		}
		System.out.println(arr);

	}

}