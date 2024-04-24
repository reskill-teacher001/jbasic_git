package kadai4;

public class UserAction1 {

	public static void main(String[] args) {
		// 田中太郎（20）の情報を登録して出力 
		User u1 = new User();

		u1.name = "田中太郎";
		u1.age = 20;

		u1.showInfo();

		System.out.println("--------------------------");

		// 鈴木一郎（25）の情報を登録して出力 
		User u2 = new User();

		u2.name = "鈴木一郎";
		u2.age = 25;

		u2.showInfo();
	}

}
