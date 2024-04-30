package kadai3;

public class Calculator {
	int x;
	
	public void m() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		int a = add(3, 7);
		System.out.println(a);
		
		int b = sub(3, 7);
		System.out.println(b);
		
		double c = avg(3, 7);
		System.out.println(c);
	}

	//足し算メソッド
	static int add(int x, int y) {
		return x + y;
	}
	
	//引き算メソッド
	static int sub(int x, int y) {
		return x - y;
	}
	
	//平均値メソッド（Step2）
	static double avg(int x, int y) {
		return (x + y) / 2.0;
		//return ((double)x + y) / 2;
	}
}
