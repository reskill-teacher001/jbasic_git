package p08;

public class Human {
	//フィールド（メンバ変数）の定義
	private String name; //名前
	private int age;     //年齢
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if (!(0 <= age && age <= 130)) {
			return;
		}
		
		this.age = age;
	}
	
	//アクセッサ・メソッド（セッタ＆ゲッタ）の定義
	
	//メソッドの定義
//	void introduce() {
//		System.out.println("名前：" + name);
//		System.out.println("年齢：" + age);
//	}

}
