package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		int count = 0;
		int[] numbers = {1, 7, 2, 7, 3};
		
		for (int data : numbers) {
			if (data == 7) {
				count++;
			}
		}
		
		System.out.println(count + "個ありました");
	}

}
