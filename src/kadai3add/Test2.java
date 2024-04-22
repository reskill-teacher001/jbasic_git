package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		int data1 = getData();
		
		System.out.println("乱数の数値：" + data1);
		
		int count = 0;
		
		boolean judge = compare(130, 102);
		
//		while (true) {
//			System.out.print("３桁の数字を入力してください：");
//			int data2 = scan.nextInt();
//			
//			if (String.valueOf(data2).length() != 3) { //３桁の入力チェック
//				continue;
//			}
//			
//			count++;
//			
//			boolean judge = compare(data1, data2);
//		}

	}
	
	static int getData() {
		//乱数を発生させるおまじない
		Random rand = new Random();
		int data = 0;
		
		boolean judge = true;
		
		while (judge) {
			data = rand.nextInt(900) + 100; //３桁の乱数を発生させる
			
			char[] suji = String.valueOf(data).toCharArray();
			
			
			
			for (int i = 0; i < suji.length - 1; i++) {
				for (int j = i + 1; j < suji.length; j++) {
					if (suji[i] == suji[j]) {
						judge = false;
					}
				}
			}
		}

		return data;
	}
	
	static boolean compare(int data1, int data2) {
		boolean judge = false;
		
		//２つの数値を３桁のchar型の配列に変換
		char[] x = String.valueOf(data1).toCharArray();
		char[] y = String.valueOf(data2).toCharArray();
		
		int hit = 0;
		int blow = 0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < y.length; j++) {
				if (i == j && x[i] == y[j]) {
					hit++;
					break;
				}
				
				if (i != j && x[i] == y[j]) {
					blow++;
					break;
				}
			}
		}
		
		System.out.println(hit + "ヒット・" + blow + "ブロー");
		
		return judge;
	}

}
