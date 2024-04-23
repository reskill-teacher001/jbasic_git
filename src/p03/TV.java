package p03;

public class TV {
	//フィールド（メンバ変数）の定義
	int ch;     //チャンネル
	
	//メソッドの定義
	void changeChannel(int c) {
		ch = c;
	}
	
	void displayChannel() {
		System.out.println("チャンネル：" + ch);
	}
}
