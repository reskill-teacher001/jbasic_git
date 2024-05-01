package p30;

import java.util.HashSet;
import java.util.Set;

public class Sample03 {

	public static void main(String[] args) {
		Set<Integer> canon = new HashSet<>();
		
		canon.add(10);
		canon.add(20);
		canon.add(30);
		canon.add(10);
		
		for (Integer data : canon) {
			System.out.println(data);
		}
	}

}
