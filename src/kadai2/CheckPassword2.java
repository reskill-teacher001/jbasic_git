package kadai2;

import java.util.Scanner;

public class CheckPassword2 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		boolean judge = false;
		String pw;

		System.out.print("パスワードを入力してください：");
		pw = scan.next();
		
		while (true) {
			if (pw.equals("himitu")) {
				judge = true;
				break;
			}
			
			System.out.print("再入力してください：");
			pw = scan.next();
		}
		
		if (judge == true) {
			System.out.println("ログインできました");
		}
	}

}
