package kadai7;

import java.util.ArrayList;
import java.util.List;

public class StringCart1 {

	public static void main(String[] args) {
		// 文字列を保持できるリストの作成
		List<String> list = new ArrayList<>();

		// 「ロボット掃除機」の追加 
		list.add("ロボット掃除機");

		// 「ドラム式洗濯機」の追加 
		list.add("ドラム式洗濯機");

		// 「液晶テレビ」の追加 
		list.add("液晶テレビ");

		// 拡張for文を利用して全商品を出力する
		for (String s : list) {
			System.out.println(s);
		}
	}

}
