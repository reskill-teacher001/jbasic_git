package kadai6;

public class BookAction2 {

	public static void main(String[] args) {
		// Itemクラスの配列を生成しItemとBookのオブジェクトを複数格納する 
		Item[] list = {
				new Item("ロボット掃除機", 50000),
				new Book("鬼滅の包丁", 450, "GO峠こよはる"),
				new Book("１ピース", 500, "尾田A一郎")
		};
		
		// 繰り返し処理を利用して1件ずつ商品情報を出力する
		for (Item i : list) {
			i.showInfo();
			System.out.println("---");
		}
		
	}

}
