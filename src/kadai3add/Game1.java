package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		//乱数を発生させるおまじない
		Random rand = new Random();
		int com = rand.nextInt(100); //0～99の乱数を発生させる
		
		System.out.println("コンピュータの数値：" + com);
		
		int count = 0;
		
		while (true) {
			System.out.print("数字を入力してください：");
			int user = scan.nextInt();
			
			count++;
			
			if (user > com) {
				System.out.println("** 大きすぎです **");
			}
			
			if (user < com) {
				System.out.println("** 小さすぎです **");
			}
			
			if (user == com) {
				break;
			}
			
		}
		
		System.out.println(count + "回で当たりました！");
	}

}
