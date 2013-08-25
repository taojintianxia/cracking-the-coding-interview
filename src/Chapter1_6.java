

import java.util.Random;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 * 
 * @author Kane.Sun
 * 
 */
public class Chapter1_6 {

	public static void main(String... args) {

		int length = 5;
		int[][] twoDemensionArray = generateTwoDemensionArray(length);

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(twoDemensionArray[i][j] + " ");
			}

			System.out.println();
		}

		turnOverTwoDemensionArray(twoDemensionArray);
		System.out.println();
		System.out.println();

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print(twoDemensionArray[i][j] + " ");
			}

			System.out.println();
		}
	}

	private static int[][] generateTwoDemensionArray(int length) {
		Random random = new Random();
		int[][] twoDemensionArray = new int[length][length];
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				twoDemensionArray[i][j] = random.nextInt(100);
			}
		}

		return twoDemensionArray;
	}

	public static int[][] turnOverTwoDemensionArray(int[][] twoDemensionArrray) {
		int length = twoDemensionArrray[0].length;

		return twoDemensionArrray;
	}

}
