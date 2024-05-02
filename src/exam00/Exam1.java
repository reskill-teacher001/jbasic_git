package exam00;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// キーボードから名前と年齢を取得して10年後の年齢を出力する 
		System.out.print("名前：");
		String name = scan.next();
		
		System.out.print("年齢：");
		int age = scan.nextInt();
		
		System.out.println(name + "さんの10年後は" + (age + 10) + "歳です！");
	}

}
