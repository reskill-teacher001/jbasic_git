package kadai4add;

public class Convert {
	static void reverse(int x) {
//		char[] moji = String.valueOf(x).toCharArray();
//		
//		for (int i = moji.length - 1; i >= 0; i--) {
//			System.out.print(moji[i]);
//		}
//		
//		System.out.println();
		
		//別解
		for (int i = x; i > 0; i /= 10) {
			System.out.print(i % 10);
		}
		
		System.out.println();
	}
	
	static void reverse(double x) {
//		char[] moji = String.valueOf(x).toCharArray();
//		
//		for (int i = moji.length - 1; i >= 0; i--) {
//			System.out.print(moji[i]);
//		}
//		
//		System.out.println();
		
		String s = String.valueOf(x);
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
	}
	
	static void reverse(String s) {
//		char[] moji = s.toCharArray();
//		
//		for (int i = moji.length - 1; i >= 0; i--) {
//			System.out.print(moji[i]);
//		}
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
	}
}
