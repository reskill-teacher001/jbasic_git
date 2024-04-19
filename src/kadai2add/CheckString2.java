package kadai2add;

import java.util.Scanner;

public class CheckString2 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);

		System.out.print("１つ目の文字列を入力してください：");
		String s1 = scan.next();
		
		System.out.print("２つ目の文字列を入力してください：");
		String s2 = scan.next();
		
		String judge = s1.equals(s2) ? "同じです" : "異なります";
		
		System.out.println("２つの文字列は" + judge);
	}

}
