package kadai1;

import java.util.Scanner;

public class CheckInteger1 {

	public static void main(String[] args) {
		//キーボード入力するためのおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("数字を入力して下さい：");
		int data = scan.nextInt();
		
		if (data == 7) {
			System.out.println("大当たり！");
		} else {
			System.out.println("ハズレ");
		}

	}

}
