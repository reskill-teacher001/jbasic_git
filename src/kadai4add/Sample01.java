package kadai4add;

public class Sample01 {

	public static void main(String[] args) {
		String s = "ABC";
		
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		
		
		
		System.out.println(s.length());
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
		char[] moji = s.toCharArray();
		//char[] moji = {'A', 'B', 'C'};
		
		System.out.println(moji[0]);
		System.out.println(moji[1]);
		System.out.println(moji[2]);
	}

}
