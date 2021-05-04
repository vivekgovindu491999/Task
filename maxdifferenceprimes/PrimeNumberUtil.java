package maxdifferenceprimes;

import java.util.ArrayList;

public class PrimeNumberUtil {

	/**
	 * To check condition for the prime number
	 * 
	 * @param num The number to be verified
	 * @return True if prime else return false
	 */
	public static boolean isPrime(int givenNumber) {

		if (givenNumber <= 1)
			return false;
		for (int number = 2; number <= Math.sqrt(givenNumber); number++) {
			if (givenNumber % number == 0)
				return false;
		}
		return true;
	}

	/**
	 * Finding the maximum difference between primes
	 * 
	 * @param start The begin number
	 * @param end   The last number
	 * @return The maximum difference
	 */
	public static int maxDifferenceBetweenPrimes(int startingNumber, int lastNumber) {

		ArrayList<Integer> primeNumbers = new ArrayList<>();
		for (int number = startingNumber; number <= lastNumber; number++) {

			if (isPrime(number)) {
				primeNumbers.add(number);
			}
		}
		if (primeNumbers.size() == 0) {
			return -1;
		}
		return primeNumbers.get(primeNumbers.size() - 1) - primeNumbers.get(0);
	}
}
