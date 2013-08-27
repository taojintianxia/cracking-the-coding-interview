package chapter1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire
 * row and column is set to 0.
 * 
 * @author Kane.Sun
 * @version Aug 27, 2013 10:58:05 AM
 * 
 */
public class Chapter1_7 {

	static Random random = new Random();

	public static void main(String... args) {
		int[][] intArray = generateRandomArrayContainsZero(10);
		printOutIntArray(intArray);
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		replaceRowAndCollumnElementContainsZero(intArray);
		printOutIntArray(intArray);
	}

	/**
	 * generate a random array with scope , and there must be an element is 0
	 * 
	 * @param scope
	 * @return
	 */
	private static int[][] generateRandomArrayContainsZero(int scope) {
		int row = 2 + random.nextInt(scope);
		int column = 2 + random.nextInt(scope);
		boolean isZeroGenerated = false;
		int[][] tmpArray = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				tmpArray[i][j] = random.nextInt(100);
				if (tmpArray[i][j] == 0) {
					isZeroGenerated = true;
				}
			}
		}

		if (!isZeroGenerated) {
			tmpArray[random.nextInt(row)][random.nextInt(column)] = 0;
		}

		return tmpArray;
	}

	private static void printOutIntArray(int[][] intArray) {
		int row = intArray.length;
		int column = intArray[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(intArray[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void replaceRowAndCollumnElementContainsZero(int[][] intArray) {
		Set<Integer> columnSet = new HashSet<>();
		int rowLength = intArray.length;
		int columnLength = intArray[0].length;
		boolean isThisRowContainsZero = false;

		for (int i = 0; i < rowLength; i++) {
			for (int j = 0; j < columnLength; j++) {
				if (intArray[i][j] == 0) {
					columnSet.add(j);
					if (!isThisRowContainsZero) {
						for (int pre = 0; pre < j; pre++) {
							intArray[i][pre] = 0;
						}
					}
					isThisRowContainsZero = true;
				}

				if (isThisRowContainsZero) {
					intArray[i][j] = 0;
				}
			}
			isThisRowContainsZero = false;
		}

		Iterator<Integer> it = columnSet.iterator();
		while (it.hasNext()) {
			int column = it.next();
			for (int i = 0; i < rowLength; i++) {
				intArray[i][column] = 0;
			}
		}
	}
}
