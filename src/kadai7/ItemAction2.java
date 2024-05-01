package kadai7;

import java.util.ArrayList;
import java.util.List;

public class ItemAction2 {

	public static void main(String[] args) {
		// Itemクラスのリストを作成 
		List<Item> list = new ArrayList<>();

		// 商品をリストに追加（３つ） 
		list.add(new Item("ロボット掃除機", 50000));
		list.add(new Book("鬼滅の包丁", 500, "Go峠"));
		list.add(new Book("1ピース ", 500, "小田"));

		//拡張for文を利用して1件ずつ商品情報を出力する
		for (Item i : list) {
			i.showInfo();
			System.out.println("--------------");
		}
	}

}
