package p30;

import java.util.ArrayList;
import java.util.List;

public class Sample02 {

	public static void main(String[] args) {
		//ArrayListクラスのインスタンスの生成
		//ArrayList<Integer> canon = new ArrayList<Integer>();
		//ArrayList<Integer> canon = new ArrayList<>();
		List<Integer> canon = new ArrayList<>();
		
		canon.add(10);
		canon.add(20);
		canon.add(30);
		
		canon.add(2, 400);
		
		canon.remove(1);
		
		for (int i = 0; i < canon.size(); i++) {
			System.out.println(canon.get(i));
		}
		
		System.out.println("---------------");
		
		for (Integer data : canon) {
			System.out.println(data);
		}
	}

}
