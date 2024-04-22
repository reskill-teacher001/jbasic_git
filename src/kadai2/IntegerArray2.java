package kadai2;

public class IntegerArray2 {

	public static void main(String[] args) {
		int sum = 0;
		int[] numbers = {1, 7, 2, 7, 3};
		
		for (int data : numbers) {
			sum += data; //sum = sum + data;
		}
		
		System.out.println("合計：" + sum);
	}

}
