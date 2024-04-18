package kadai1add;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("国語の点数を入力してください：");
		int kokugo = scan.nextInt();

		System.out.print("数学の点数を入力してください：");
		int sugaku = scan.nextInt();

		System.out.print("英語の点数を入力してください：");
		int eigo = scan.nextInt();
		
		if (kokugo >= 80 && sugaku >= 75 && eigo >= 70) {
			System.out.println("合格です");	
		} else {
			System.out.println("不合格です");	
		}
		

	}

}
