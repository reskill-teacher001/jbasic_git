package kadai2;

import java.util.Scanner;

public class Introduce2 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		String name;
		String[] hobby = new String[3];
		
		System.out.println("情報を登録します。");
		System.out.print("名前：");
		name = scan.next();
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.print("趣味" + (i + 1) + "：");
			hobby[i] = scan.next();
		}
		
		System.out.println("-----------------------------");
		
		System.out.println("こんにちは" + name + "です");
		System.out.println("私の趣味は、");
		
		for (String h : hobby) {
			System.out.println("・" + h);
		}
		
		System.out.println("です");
	}

}
