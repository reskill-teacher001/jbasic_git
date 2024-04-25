package kadai5;

public class ItemAction1 {

	public static void main(String[] args) {
		// ■Step2の処理
		// 商品オブジェクトを生成
		Item item1 = new Item();

		// セッターを利用して情報（絵本/1000円）をセットする
		item1.setName("絵本");
		item1.setPrice(1000);

		// ゲッターを利用して商品の情報を出力する
		System.out.println("商品名：" + item1.getName());
		System.out.println("価　格：" + item1.getPrice() + "円");
		
		System.out.println("--------------------------------");

		// ■Step4の処理
		// コンストラクタを利用し初期化（シャンプー/222円）と 
		// 同時に商品オブジェクトを生成する 
		Item item2 = new Item("シャンプー", 222);

		// 商品情報出力用のメソッドを利用して出力する
		item2.showInfo();
	}

}
