package chapter2;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Implement an algorithm to find the nth to last element of a singly linked
 * list.
 * 
 * @author Kane.Sun
 * @version Sep 4, 2013 11:05:52 AM
 * 
 */

// seems that this question is not for java
public class Chapter2_2 {

	static Random random = new Random();

	public static void main(String... args) {

		List<Comparable<Integer>> testList = new LinkedList<>();

		for (int i = 0; i < 50; i++) {
			int tmp = random.nextInt();
			testList.add(tmp);
			System.out.print(tmp + " ");
		}

		System.out.println();

	}

	public int getNthFromEnd(LinkedList<Integer> targetList, int position) throws IllegalArgumentException {
		if (position >= targetList.size()) {
			throw new IllegalArgumentException("position is not in the list");
		}

		int length = targetList.size();

		return targetList.get(length - position);
	}
}
