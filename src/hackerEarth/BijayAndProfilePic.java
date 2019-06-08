package hackerEarth;

import java.util.Scanner;

public class BijayAndProfilePic {

	public static void main(String[] args) {
		int minDimension;
		int widthOfPhoto;
		int heightOfPhoto;
		int numberOfPhoto;
		Scanner sc = new Scanner(System.in);
		minDimension = sc.nextInt();
		numberOfPhoto = sc.nextInt();

		for (int i = 0; i < numberOfPhoto; i++) {
			widthOfPhoto = sc.nextInt();
			heightOfPhoto = sc.nextInt();

			if ((widthOfPhoto < minDimension) | (heightOfPhoto < minDimension)) {
				System.out.println("UPLOAD ANOTHER");

			}
			if (((widthOfPhoto >= minDimension) & (heightOfPhoto >= minDimension))) {
				if ((widthOfPhoto == heightOfPhoto)) {
					System.out.println("ACCEPTED");
				} else {
					System.out.println("CROP IT");
				}
			}

		}
	}
}