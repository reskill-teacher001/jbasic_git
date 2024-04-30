package kadai6add;

public class Warrior extends Human {
	//フィールド
	private String type; //種別

	//コンストラクタ
	public Warrior() {
		
	}
	
	public Warrior(String name, String type) {
		super(name);
		this.type = type;
	}

	//セッタ＆ゲッタ
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	//infoメソッド
	public void info() {
		System.out.print("種別：" + type + "　");
		super.info();
	}
	
	//attackメソッド
	public void attack() {
		System.out.print("「" + type + "」は");
		super.attack();
	}
	
}
