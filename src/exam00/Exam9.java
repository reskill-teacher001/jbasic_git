package exam00;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exam9 {
	//キーボード入力のおまじない
	private static Scanner scan = new Scanner(System.in);
	
	//Mapインターフェース型のフィールド
	private static Map<String, String> map;

	public static void main(String[] args) {

		//HashMapクラスのインスタンスの生成
		map = new HashMap<>();
		
		int selNo = 0;
		
		do {
			System.out.println("1：登録 2：削除 3：一覧表示 9：終了");
			System.out.print("操作番号を入力してください：");
			selNo = scan.nextInt();
			
			switch (selNo) {
			case 1:
				regist();
				break;
			case 2:
				delete();
				break;
			case 3:
				display();
				break;
			}
			
			System.out.println();
			
		} while (selNo != 9);
		
		System.out.println("アプリケーションを終了します");
	}
	
	//登録用メソッド
	private static void regist() {
		System.out.print("名前を入力してください：");
		String name = scan.next();
		
		System.out.print("電話番号を入力してください：");
		String telNo = scan.next();
		
		map.put(name, telNo);
	}

	//登録用メソッド
	private static void delete() {
		System.out.print("名前を入力してください：");
		String name = scan.next();
		
		map.remove(name);
	}

	//一覧表示用メソッド
	private static void display() {
		System.out.println("名前\t\t電話番号");
		System.out.println("---------------------------------");
		
		for (String name : map.keySet()) {
			System.out.println(name + "\t\t" + map.get(name));
		}
	}

}
