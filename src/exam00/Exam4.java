package exam00;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("年齢を入力してください：");
		int age = 0; // 初期値 

		// 文字列が入力された場合は「整数で入力してください」と出力する（5点）
		
		try {
			age = scan.nextInt();
		} catch (InputMismatchException e) { //catch (Exception e) {でもOK
			System.out.println("整数で入力してください");
			//System.exit(0);
			return;
		}
		

		// 0以上130以下の範囲外である場合は「0以上130以下で入力してください」 
		// と出力する（5点） 
		if (!(0 <= age && age <= 130)) {
			System.out.println("0以上130以下で入力してください");
			//System.exit(0);
			return;
		}

//		//別解
//		if (0 > age || age > 130) {
//			System.out.println("0以上130以下で入力してください");
//			//System.exit(0);
//			return;
//		}

		// 0以上130以下の整数だった場合は「○歳で登録しました」と出力する（5点）
		System.out.println(age + "歳で登録しました");

		scan.close();
	}
	
}
