package kadai7add;

public class Item {
	//フィールド
	private String name; //商品名
	private int price;   //価格
	
	//コンストラクタ
	public Item() {

	}
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	//セッタ＆ゲッタ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//getInfoメソッド
	public String getInfo() {
		return name + "/" + price + "円";
	}
}
