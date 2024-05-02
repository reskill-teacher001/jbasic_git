package kadai8;

public class Hero extends Actor {
	//フィールド
	private String name; //名前
	private int hp;      //生命力
	private int attack;  //攻撃力
	
	//コンストラクタ
	public Hero(int hp, int attack) {
		this.name = "🦸勇者";
		this.hp = hp;
		this.attack = attack;
	}

	//セッタ＆ゲッタ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	// 情報取得用toStringメソッド 
	public String toString() {
		return name + "（HP:" + hp + "）";
	}
	
	// 攻撃メソッド（★追加）
	public void attack(Hero target) {
		String targetName = target.getName();
		int targetHp = target.getHp();
		
		targetHp -= attack;
		targetHp = targetHp >= 0 ? targetHp : 0;
		
		target.setHp(targetHp);
		
		System.out.println(name + "の攻撃");
		System.out.println(targetName + "に" + attack + "のダメージを与えた！");
	}
}
