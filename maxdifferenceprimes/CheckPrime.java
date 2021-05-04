package maxdifferenceprimes;

public class CheckPrime {

	/**
	 * To check condition for the prime number
	 * 
	 * @param num The number to be verified
	 * @return True if prime else false
	 */
	public static boolean isPrime(int num) {

		if (num <= 1)
			return false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}
}
