package kadai1add;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("国語の点数を入力してください：");
		int kokugo = scan.nextInt();

		System.out.print("数学の点数を入力してください：");
		int sugaku = scan.nextInt();

		System.out.print("英語の点数を入力してください：");
		int eigo = scan.nextInt();
		
		String maxSubject = "国語";
		int maxScore = kokugo;
		
		if (sugaku > maxScore) {
			maxSubject = "数学";
			maxScore = sugaku;
		}
		
		if (eigo > maxScore) {
			maxSubject = "英語";
			maxScore = eigo;
		}
		
		System.out.println("最高点は" + maxSubject + "で" + maxScore + "点です");

	}

}
