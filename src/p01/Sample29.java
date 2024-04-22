package p01;

public class Sample29 {
	
	public static void main(String[] args) {
		int a = 10;
		kudo(a);
		
		int result = oku();
		System.out.println(result);
	}
	
	//メソッドの定義
	static void kudo(int x) {
		System.out.println(x);
	}

	static int oku() {
		return 10;
	}

}
