package maxdifferenceprimes;

import java.util.Scanner;

/**
 * Main class will take the input and produce the output of max difference
 * between the two prime numbers
 * 
 * @author vivek
 *
 */
class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int noOfTestCases = sc.nextInt();
			int[] outputArray = new int[noOfTestCases];
			for (int number = 0; number < noOfTestCases; number++) {
				/*
				 * input of starting number and last number
				 */
				int startingNumber = sc.nextInt();
				int lastNumber = sc.nextInt();
				outputArray[number] = PrimeNumberUtil.maxDifferenceBetweenPrimes(startingNumber, lastNumber);
			}
			/*
			 * printing of output
			 */
			for (int number = 0; number < noOfTestCases; number++) {
				System.out.println(outputArray[number]);
			}
		}
	}
}