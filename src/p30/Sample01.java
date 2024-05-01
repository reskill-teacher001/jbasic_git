package p30;

public class Sample01 {

	public static void main(String[] args) {
		Integer[] canon = new Integer[3];
		
		canon[0] = 10;
		canon[1] = 20;
		canon[2] = 30;
		
		for (int i = 0; i < canon.length; i++) {
			System.out.println(canon[i]);
		}
		
		System.out.println("---------------");
		
		for (Integer data : canon) {
			System.out.println(data);
		}
		
	}

}
