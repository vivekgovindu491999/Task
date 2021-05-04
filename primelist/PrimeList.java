package primelist;

import java.util.ArrayList;
import java.util.Collection;

/**
 * class will use behavior of ArrayList and adds only prime numbers
 * 
 * @author Dell
 *
 */
public class PrimeList extends ArrayList<Integer> {

	private static final long serialVersionUID = 1L;

	/**
	 * checks whether given input is prime or not
	 * 
	 * @param givenNumber number to be checked
	 * @return True if prime else return false
	 */
	public boolean isPrime(int givenNumber) {

		if (givenNumber <= 1)
			return false;
		for (int number = 2; number <= Math.sqrt(givenNumber); number++) {
			if (givenNumber % number == 0)
				return false;
		}
		return true;
	}

	/**
	 * default constructor calls the ArrayList()
	 */
	public PrimeList() {
		super();
	}

	/**
	 * initial capacity is passed to ArrayList constructor
	 * 
	 * @param size initial capacity
	 */
	public PrimeList(int size) {
		super(size);
	}

	/**
	 * adds collection of integers to ArrayList constructor
	 * 
	 * @param collection collection of integers
	 */
	public PrimeList(Collection<? extends Integer> collection) {
		addAll(collection);
	}

	/**
	 * adds element to list if only prime
	 */
	@Override
	public boolean add(Integer e) {

		if (isPrime(e)) {
			return super.add(e);
		} else {
			throw new UnsupportedOperationException("The number is not prime");
		}
	}

	/**
	 * replace the element at given index if element is prime
	 */
	@Override
	public Integer set(int index, Integer element) {
		if (isPrime(element)) {
			return super.set(index, element);
		} else {
			throw new UnsupportedOperationException("The number is not prime");
		}
	}

	/**
	 * adds element at given index if only prime
	 */
	@Override
	public void add(int index, Integer element) {

		if (isPrime(element)) {
			super.add(index, element);
		} else {
			throw new UnsupportedOperationException("The number is not prime");
		}

	}

	/**
	 * adds the collection of elements to the list at given index if all the
	 * elements are prime
	 */
	@Override
	public boolean addAll(int index, Collection<? extends Integer> collection) {
		for (Integer element : collection) {
			if (!isPrime(element))
				throw new UnsupportedOperationException("we cant add given collection");
		}
		return super.addAll(index, collection);
	}

	/**
	 * adds the collection of elements if all elements are prime
	 */
	@Override
	public boolean addAll(Collection<? extends Integer> collection) {
		for (Integer element : collection) {
			if (!isPrime(element))
				throw new UnsupportedOperationException("we cant add given collection");
		}
		return super.addAll(collection);
	}

}
