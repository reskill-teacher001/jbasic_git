package kadai1add;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("国語の点数を入力してください：");
		int kokugo = scan.nextInt();

		System.out.print("数学の点数を入力してください：");
		int sugaku = scan.nextInt();

		System.out.print("英語の点数を入力してください：");
		int eigo = scan.nextInt();
		
		double ave = (kokugo + sugaku + eigo) / 3.0;
		
		System.out.println("平均は" + ave + "点です");

	}

}
