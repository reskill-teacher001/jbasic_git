package kadai6add;

public class Human {
	//フィールド
	private String name; //名前

	//コンストラクタ
	public Human() {
		
	}
	
	public Human(String name) {
		this.name = name;
	}

	//セッタ＆ゲッタ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//infoメソッド
	public void info() {
		System.out.println("名前：" + name);
	}
	
	//attackメソッド
	public void attack() {
		System.out.println("攻撃した");
	}
	
}
