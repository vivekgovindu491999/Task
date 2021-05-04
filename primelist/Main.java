package primelist;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		PrimeList primeList = new PrimeList();
		primeList.add(23);
		primeList.add(7);
		primeList.add(29);
		System.out.println(primeList);
		primeList.remove(2);
		System.out.println("remove element:"+primeList);
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(3);
		list.add(7);
		list.add(5);
		primeList.addAll(1,list);
		System.out.println("add all at index 1:"+primeList);

	}

}
