package p01;

import java.util.Scanner;

public class Sample24 {
	
	public static void main(String[] args) {
		//キーボードが使用できるようにするおまじない
		Scanner scan = new Scanner(System.in);
		
		String moji;
		
		System.out.print("文字を入力してください：");
		moji = scan.next();
		
		while (!moji.equals("zzz")) {
			System.out.println(moji);
			
			System.out.print("文字を入力してください：");
			moji = scan.next();
		}		
	}

}
