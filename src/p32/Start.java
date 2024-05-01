package p32;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//Controller c = new Controller();
		
		//Controller[] list = new Controller[2];
		List<Controller> list = new ArrayList<>();
		
//		list[0] = new Baseball();
//		list[1] = new Mario();
		
		list.add(new Baseball());
		list.add(new Mario());
		
		for (Controller con : list) {
			con.pushA();
			con.pushB();
			System.out.println("-------");
		}
	}

}
