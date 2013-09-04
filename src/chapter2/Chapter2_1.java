package chapter2;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * Write code to remove duplicates from an unsorted linked list.
 * 
 * @author Kane.Sun
 * @version Aug 30, 2013 11:13:38 AM
 * 
 */
public class Chapter2_1 {

	private final static int LENGTH = 50;

	static Random random = new Random();

	public static void main(String... args) {

		List<Comparable<Integer>> testList = new LinkedList<>();

		for (int i = 0; i < LENGTH; i++) {
			int tmp = random.nextInt((int) (LENGTH * 0.75));
			testList.add(tmp);
			System.out.print(tmp + " ");
		}

		System.out.println();

		removeDupulidateElementInList(testList);

		int length = testList.size();

		for (int i = 0; i < length; i++) {
			System.out.print(testList.get(i) + " ");
		}

		System.out.println();

	}

	public static void removeDupulidateElementInList(List<Comparable<Integer>> testList) {
		Map<Comparable<?>, Boolean> storeMap = new HashMap<>();
		for (int i = 0; i < testList.size(); i++) {
			Comparable<Integer> element = testList.get(i);
			if (storeMap.get(element) == null) {
				storeMap.put(element, true);
			} else {
				testList.remove(i);
			}
		}
	}
}
