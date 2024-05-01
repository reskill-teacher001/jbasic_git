package kadai7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PriceErrorCheck {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		int price = 0; // 価格初期値:0 
		
		try {
			System.out.print("価格：");
			// 整数チェック（エラーの場合は終了）
			price = scan.nextInt();
		} catch (InputMismatchException e) { // catch (Exception e) {でもOK
			System.out.println("整数で入力してください");
			//System.exit(1);
			return;
		}

		// 範囲チェック（エラーの場合は終了）
		if (price < 0) {
			System.out.println("マイナスの値です");
			//System.exit(1);
			return;
		}
		
		System.out.println(price + "円を登録しました");
		scan.close();
	}

}
