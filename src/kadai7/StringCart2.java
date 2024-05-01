package kadai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCart2 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);

		// 文字列を保持できるリストの作成
		List<String> list = new ArrayList<>();

		// キーボードからリストに追加するを3回繰り返す
		for (int i = 1; i <= 3; i++) {
			System.out.print("商品を追加してください：");
			String s = scan.next();
			
			list.add(s);
		}

		// 拡張for文を利用して全商品を出力する
		for (String s : list) {
			System.out.println(s);
		}
		
		scan.close();
	}

}
