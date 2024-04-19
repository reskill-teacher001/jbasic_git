package kadai1;

import java.util.Scanner;

public class CheckInteger4 {

	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("数字を入力してください：");
		int data = scan.nextInt();
		
		//三項演算子でのチェック
		String judge1 = data >= 0 ? "正" : "負";
		String judge2 = data % 2 == 0 ? "偶数" : "奇数";
		
		System.out.println(data + "は" + judge1 + "の" + judge2 + "です");

	}

}
