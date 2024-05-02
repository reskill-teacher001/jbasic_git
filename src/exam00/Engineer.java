package exam00;

public class Engineer extends Employee {
	// フィールド
	private String skill; //技術

	// コンストラクタ
	public Engineer(String name, int age, String skill) {
		super(name, age);
		this.skill = skill;
	}

	// ゲッター、セッター
	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}
	
	// 情報出力メソッド
	public void introduce() {
		super.introduce();
		
		System.out.println(skill + "エンジニアです");
	}
	
}
