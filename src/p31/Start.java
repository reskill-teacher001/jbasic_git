package p31;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		//Canon can = new Canon();
		
		//Canon[] list = new Canon[2];
		List<Canon> list = new ArrayList<>();
		
//		list[0] = new Oku();
//		list[1] = new Kudo();
		
		list.add(new Oku());
		list.add(new Kudo());
		
		for (Canon c : list) {
			c.work();
			c.salary();		
		}
		
		Kudo k = new Kudo();
		k.test();
		
		Canon c = new Kudo();
		c.test();
		
	}

}
