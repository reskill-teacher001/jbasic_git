package exam00;

public class Employee {
	// フィールド
	private String name; //名前
	private int age;     //年齢
	
	// コンストラクタ
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// ゲッター、セッター
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
		this.age = age;
	}
	
	// 情報出力メソッド
	public void introduce() {
		System.out.println(name + "さんは" + age + "歳です");
	}
}
