package exam00;

import java.util.Random;
import java.util.Scanner;

public class Exam8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();

		// プレイヤーとコンピュータの手を決める 
		System.out.println("1:グー、2:チョキ、3:パー から選択してください。");
		
		System.out.print("じゃん、けん、、、：");
		int you = scan.nextInt();
		
		// コンピュータは1～3のランダムな数値を取得する 
		int com = random.nextInt(3) + 1;

		// プレイヤーの手とコンピュータの手を比較して勝敗を出力する(5点)
		String youResult = you == 1 ? "グー" : (you == 2 ? "チョキ" : "パー");
		String comResult = com == 1 ? "グー" : (com == 2 ? "チョキ" : "パー");
				
		System.out.println("あなたは" + youResult + "！");
		System.out.println("コンピュータは" + comResult + "！");
		
		switch (you) {
		case 1: //あなたが「グー」の場合
			if (com == 1) { //コンピュータが「グー」
				System.out.println("引き分けでした");
			}
			
			if (com == 2) { //コンピュータが「チョキ」
				System.out.println("あなたの勝ち");
			}
			
			if (com == 3) { //コンピュータが「パー」
				System.out.println("あなたの負け");
			}
			
			break;
		case 2: //あなたが「チョキ」の場合
			if (com == 1) { //コンピュータが「グー」
				System.out.println("あなたの負け");
			}
			
			if (com == 2) { //コンピュータが「チョキ」
				System.out.println("引き分けでした");
			}
			
			if (com == 3) { //コンピュータが「パー」
				System.out.println("あなたの勝ち");
			}
			
			break;
		case 3: //あなたが「パー」の場合
			if (com == 1) { //コンピュータが「グー」
				System.out.println("あなたの勝ち");
			}
			
			if (com == 2) { //コンピュータが「チョキ」
				System.out.println("あなたの負け");
			}
			
			if (com == 3) { //コンピュータが「パー」
				System.out.println("引き分けでした");
			}
			
			break;
		}
	}

}
