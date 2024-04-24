package kadai2add;

import java.util.Scanner;

public class CheckString5 {

	public static void main(String[] args) {
		//キーボード入力のおまじない
		Scanner scan = new Scanner(System.in);
		
		System.out.print("繰り返す回数を入力してください：");
		int n = scan.nextInt();
		
		String[] words = new String[n];
		
		//配列への入力工程
		for (int x = 0; x < words.length; x++) {
			System.out.print((x + 1) + "つ目の文字列を入力してください：");
			words[x] = scan.next();
			
			//出力工程
			for (int i = 0; i < words.length; i++) {
				if (words[i] == null) {
					continue;
				}
					
				System.out.print(words[i]);
			}

		}
		
		
	}

}
