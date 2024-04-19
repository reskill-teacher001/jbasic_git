package p01;

public class Sample25 {
	
	public static void main(String[] args) {
		int[] list = {10, 20, -1, 30, -2, 40};
		
		for (int i = 0; i < list.length; i++) {
			if (list[i] < 0) {
				continue;
			}
			
			System.out.println(list[i]);
		}
	}

}
