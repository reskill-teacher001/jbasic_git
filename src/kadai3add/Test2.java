package kadai3add;

import java.util.Random;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int data1 = getData();
		
		System.out.println("乱数の数値：" + data1);
		
		int count = 0;
		
		while (true) {
			int data2 = inputData();
			
			count++;
			
			if (compare(data1, data2) == true) {
				break;
			}
		}
		
		System.out.println(count + "回で当たりました！");

	}
	
	static int getData() {
		//乱数を発生させるおまじない
		Random rand = new Random();
		
		int data = 0;
		
		while (true) {
			data = rand.nextInt(900) + 100; //３桁の乱数を発生させる
			
			char[] suji = String.valueOf(data).toCharArray();
			
			boolean judge = true;
			
			for (int i = 0; i < suji.length - 1; i++) {
				for (int j = i + 1; j < suji.length; j++) {
					if (suji[i] == suji[j]) {
						judge = false;
					}
				}
			}
			
			if (judge == true) {
				break;
			}
		}

		return data;
	}
	
	static int inputData() {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		int data = 0;
		
		while (true) {
			System.out.print("３桁の異なる数字を入力してください：");
			data = scan.nextInt();
			
			char[] suji = String.valueOf(data).toCharArray();
			
			if (suji.length != 3) {
				continue;
			}
			
			boolean judge = true;
			
			for (int i = 0; i < suji.length - 1; i++) {
				for (int j = i + 1; j < suji.length; j++) {
					if (suji[i] == suji[j]) {
						judge = false;
					}
				}
			}
			
			if (judge == true) {
				break;
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
		
		if (hit == 3 && blow == 0) {
			judge = true;
		}
		
		return judge;
	}

}
