package kadai5;

public class ItemAction2 {

	public static void main(String[] args) {
		// 3つの要素をもつ商品クラスの配列を生成 
		  Item[] items =  new Item[3];
		  
		  items[0] = new Item("ロボット掃除機", 50000);
		  items[1] = new Item("空気清浄機", 20000);
		  items[2] = new Item("扇風機", 4000);
		  
		  //別解
//		  Item[] items =  {
//				  new Item("ロボット掃除機", 50000),
//				  new Item("空気清浄機", 20000),
//				  new Item("扇風機", 4000)
//		  };
		  
		  int[] list = {1, 2, 3};
		 
		  // 拡張for文とshowInfoメソッドを利用して 
		  // 1件ずつ商品情報を出力する
		  for (Item item : items) {
			  item.showInfo();
		  }
	}

}
