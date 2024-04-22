package kadai3;

import java.util.Scanner;

public class UserRegistration2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("名前を入力してください：");
		String name = scan.next();
		
		if (hasNameError(name) == true) {
			// 名前にエラーが存在した場合mainメソッドを終了する 
			scan.close();
			return;
		}
		
		System.out.print("年齢を入力してください：");
		int age = scan.nextInt();
		
		if (hasAgeError(age)) {
			// 年齢にエラーが存在した場合mainメソッドを終了する 
			scan.close();
			return;
		}

		System.out.println("名前：" + name + "、年齢：" + age + "で登録しました。");
	}

	static boolean hasNameError(String name) {
		boolean judge = false;

		// 名前が20文字より大きい場合エラー 
		if (name.length() > 20) {
			System.out.println("名前は20文字以内で入力してください");
			judge = true;
		}

		// 名前が「admin」に一致する場合エラー 
		if (name.equals("admin")) {
			System.out.println("利用できない名前です");
			judge = true;
		}

		// 名前に禁止文字「㌔」が含まれている場合エラー 
		if (name.contains("㌔")) {
			System.out.println("名前に禁止文字が含まれています");
			judge = true;
		}

		return judge;
	}

	static boolean hasAgeError(int age) {
		boolean judge = false;

		// 年齢が0未満、または、130より大きい場合エラー 
		if (!(0 <= age && age <= 130)) { // if (age < 0 || 130 < age) {　でもOK
			System.out.println("年齢は0以上130以下で入力してください");
			judge = true;
		}

		return judge;
	}

}
