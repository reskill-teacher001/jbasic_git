package kadai8;

public class Game {

	public static void main(String[] args) {
		//【Step3】
		System.out.println("★★★ゲーム開始★★★");

		// 🦸勇者（生命力：50、攻撃力：10）の生成と情報の表示 
		Actor a1 = new Actor("🦸勇者", 50, 10);
		System.out.println(a1);

		partition();

		// 🦸ゾンビ（生命力：15、攻撃力：5）の生成と情報の表示 
		Actor a2 = new Actor("🦸ゾンビ", 15, 5);
		System.out.print(a2);
		System.out.println("があらわれた！");

		partition();

		// 勇者から敵への攻撃 
		a1.attack(a2);
		// 敵の情報を表示 
		System.out.println(a2);

		partition();

		// 敵から勇者への攻撃 
		a2.attack(a1);
		// 勇者の情報を表示 
		System.out.println(a1);
		
		partition();

		// 勇者から敵への攻撃 
		a1.attack(a2);
		// 敵の情報を表示 
		System.out.println(a2);
		
		partition();
		System.out.println("★★★ゲーム終了★★★");

//		//【Step2】
//		System.out.println("★★★ゲーム開始★★★");
//
//		// 🦸勇者（生命力：50、攻撃力：10）の生成と情報の表示 
//		Actor a1 = new Actor("🦸勇者", 50, 10);
//		System.out.println(a1);
//
//		System.out.println("---------");
//
//		// 🦸ゾンビ（生命力：15、攻撃力：5）の生成と情報の表示 
//		Actor a2 = new Actor("🦸ゾンビ", 15, 5);
//		System.out.print(a2);
//		System.out.println("があらわれた！");
//
//		System.out.println("---------");
//
//		// 勇者から敵への攻撃 
//		a1.attack(a2);
//		// 敵の情報を表示 
//		System.out.println(a2);
//
//		System.out.println("---------");
//
//		// 敵から勇者への攻撃 
//		a2.attack(a1);
//		// 勇者の情報を表示 
//		System.out.println(a1);
//		
//		System.out.println("---------");
//
//		// 勇者から敵への攻撃 
//		a1.attack(a2);
//		// 敵の情報を表示 
//		System.out.println(a2);
//		
//		System.out.println("---------");
//		System.out.println("★★★ゲーム終了★★★");

		//		【Step1】
		//		// オブジェクトの生成（名前：🦸勇者、生命力：50、攻撃力：10）
		//		Actor a1 = new Actor("🦸勇者", 50, 10);
		//
		//		// 勇者の情報の表示 
		//		System.out.println(a1);
		//
		//		// オブジェクトの生成（名前：🦸ゾンビ、生命力：15、攻撃力：5） 
		//		Actor a2 = new Actor("🦸ゾンビ", 15, 5);
		//
		//		// ゾンビの情報の表示 
		//		System.out.println(a2);
	}
	
	public static void partition() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("待機処理でエラーが発生しました");
			//e.printStackTrace();
		}
		
		System.out.println("---------");
	}

}
