package p01;

public class Sample14 {
	
	public static void main(String[] args) {
		String data = "小川";
		
		//switch文
		switch (data) {
		case "小川":
			System.out.println("小川です");
			break;
		case "田中":
			System.out.println("田中です");
			break;
		case "薄井":
			System.out.println("薄井です");
			break;
		default:
			System.out.println("該当なし");
		}
		
	}

}
