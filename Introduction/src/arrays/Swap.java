package arrays;

import java.util.Arrays;

public class Swap {

	public static void main(String[] args) {

		int[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// //swaps first n last
		// swap(arr, 0, arr.length-1);

		// longestConsecutiveSequence(arr);
	}

	private static void testPrimes(int numberToTest) {
		int lastToCheck = (int) (Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for (int i = 0; i < numberToTest; i++) {
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;

		for (int prime = 2; prime <= lastToCheck; prime++) {
			if (theNumbers[prime]) {

				int increment = prime;
				boolean first = true;

				System.out.println("\n"+ prime+ " is prime. Crossing off:");
				
				for (int test = prime; test < numberToTest; test = test + increment) {
					if (!first) {
						System.out.print(test + ", ");
						theNumbers[test] = false;
					} else {
						first = false;
					}
				}
			}

		}
		for (int i = 0; i < theNumbers.length; i++) {
			if (theNumbers[i]) {
				System.out.println(i + " is prime");
			}
		}
	}

	// -----------------------------------------------------------------CLASS
	// ASSIGNMENT

	// public static int[] makeRandom(int[] arrae){
	// int[] arr = new int[arrae.length-1];
	// for (int i = 0; i < arr.length; i++) {
	// arr[i] = arrae[(int)(Math.random()* (arr.length) + 1)];
	//
	// for (int j = 0; j < i; j++) {
	// if (arr[i] == arr[j]) {
	// i--;
	// break;
	// }
	// }
	// }
	// return arr;
	//
	// }
	// -----------------------------------------------------------------------------------------
	// public static int longestConsecutiveSequence(int[] array1){
	// /**This method counts the longest consecutive sequence in an array.
	// * It does not matter where the sequence begins
	// * If there are no consecutive numbers, the method should return '1'
	// *
	// * Examples:
	// * longestSequence({1,2,3,4,5,8,9}) returns '5', since the sequence
	// '1,2,3,4,5' is 5 integers long
	// * longestSequence({0,9,10,11,4,3,8,9}) returns '3', since '9,10,11' is 3
	// integers long
	// * longestSequence({0,9,8,11,4,3,7,9}) returns '1', since there are no
	// consecutive integers
	// * */
	//
	// int counter = 1;
	// int longest = 1;
	// for(int i = 0; i<array1.length -1; i++){
	// if(array1[i] + 1==array1[i+1]){
	// counter++;
	// if(counter>longest){
	// longest = counter;
	// }
	// } else {
	// counter = 1;
	// }
	// }
	//
	//
	// System.out.println(longest);
	// return longest;
	// }

}
