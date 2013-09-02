package chapter1;

import util.KaneUtil;

/**
 * Assume you have a method isSubstring which checks if one word is a substring
 * of another. Given two strings, s1 and s2, write code to check if s2 is a
 * rotation of s1 using only one call to isSubstring ( i.e., ¡°waterbottle¡± is a
 * rotation of ¡°erbottlewat¡±).
 * 
 * @author Kane.Sun
 * @version Aug 27, 2013 4:38:37 PM
 * 
 */
public class Chapter1_8 {

	public static void main(String... args) {
		String originalStr = KaneUtil.generateRamdomString(5);
		String targetStr = KaneUtil.generateRotationString(originalStr);
		System.out.println(originalStr);
		System.out.println(targetStr);
		System.out.println(isRotation(originalStr, targetStr));
	}

	public static boolean isSubString(String original, String target) {

		return original.contains(target);
	}

	// this is most elegant way I have never seen
	public static boolean isRotation(String original, String target) {
		return isSubString(original + original, target);
	}

}
