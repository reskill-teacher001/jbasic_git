package kadai4add;

public class Customer {
	//フィールド
	int id;      //ID
	String name; //名前
	
	//メソッド
	void setData(String n) {
		name = n;
	}
	
	void setData(int i, String n) {
		id = i;
		name = n;
	}
	
	void showData() {
		System.out.println(id + "：" + name);
	}
}
