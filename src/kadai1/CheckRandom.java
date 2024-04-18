package kadai1;

import java.util.Random;

public class CheckRandom {

	public static void main(String[] args) {
		//０～２の乱数を発生させる
		Random rand = new Random();
		int data = rand.nextInt(3);
		
		switch (data) {
		case 0 :
			System.out.println("グー");
			break;
		case 1 :
			System.out.println("チョキ");
			break;
		case 2 :
			System.out.println("パー");
			break;
		}
	}

}
