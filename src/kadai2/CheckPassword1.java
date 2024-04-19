package kadai2;

import java.util.Scanner;

public class CheckPassword1 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		boolean judge = false;

		for (int i = 1; i <= 3; i++) {
			System.out.print("パスワードを入力してください：");
			String pw = scan.next();
			
			if (pw.equals("himitu")) {
				judge = true;
				break;
			}
			
			System.out.println("不正解です");
		}
		
		if (judge == true) {
			System.out.println("ログインできました");
		}
	}

}
