package p07;

public class Start {

	public static void main(String[] args) {
		Human h = new Human();
		
		h.setName("山田太郎");
		h.setAge(-23);
		
		System.out.println("名前：" + h.getName());
		System.out.println("年齢：" + h.getAge());

		
		//h.introduce();
	}

}
