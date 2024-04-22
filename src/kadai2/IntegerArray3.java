package kadai2;

public class IntegerArray3 {

	public static void main(String[] args) {
		int count = 0;
		int[] numbers = {1, 7, 2, 7, 3};
		
		for (int data : numbers) {
			if (data == 7) {
				count++; //count = count + 1; count += 1;
			}
		}
		
//		for (int i = 0 ; i < numbers.length; i++) {
//			if (numbers[i] == 7) {
//				count++; //count = count + 1; count += 1;
//			}
//		}
		
		System.out.println(count + "個ありました");
	}

}
