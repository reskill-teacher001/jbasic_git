package kadai2add;

import java.util.Scanner;

public class CheckString3 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		String chainStr = ""; //連結用変数

		System.out.print("繰り返す回数を入力してください：");
		int loop = scan.nextInt();
		
		for (int i = 1; i <= loop; i++) {
			System.out.print(i + "つ目の文字列を入力してください：");
			String str = scan.next();
			
			chainStr += str; //chainStr = chainStr + str;
			System.out.println(chainStr);
		}
		
	}

}
