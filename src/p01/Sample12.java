package p01;

public class Sample12 {
	
	public static void main(String[] args) {
		float data = 1;
		
		//switch文
		switch (data) {
		case 1:
			System.out.println("１です");
			break;
		case 2:
			System.out.println("２です");
			break;
		case 3:
			System.out.println("３です");
			break;
		default:
			System.out.println("該当なし");
		}
		
		//if文
		if (data == 1) {
			System.out.println("１です");
		} else if (data == 2) {
			System.out.println("２です");
		} else if (data == 3) {
			System.out.println("３です");
		} else {
			System.out.println("該当なし");
		}
		
	}

}
