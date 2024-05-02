package exam00;

public class Exam2 {

	public static void main(String[] args) {
		// 対象の配列を生成する 
		int[] array = {1, 5, 4, 3, 2};
		
		// 拡張for文とif文を利用して奇数の値だけを出力する 
		for (int data : array) {
			if (data % 2 == 0) {
				continue;
			}
			
			System.out.println(data);
			
//			//別解
//			if (data % 2 != 0) {
//				System.out.println(data);
//			}
		}
	}

}
