package p30;

import java.util.Set;
import java.util.TreeSet;

public class Sample04 {

	public static void main(String[] args) {
		Set<String> canon = new TreeSet<>();
		
		canon.add("Java");
		canon.add("C++");
		canon.add("PHP");
		canon.add("Python");
		
		for (String data : canon) {
			System.out.println(data);
		}
	}

}
