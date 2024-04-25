package p08;

public class Start {

	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2;
		
		h1.setName("山田太郎");
		h1.setAge(23);
		
		h2 = h1;
		h2,setAge(30);
		
		System.out.println("名前：" + h1.getName());
		System.out.println("年齢：" + h1.getAge());

		
		//h.introduce();
	}

}
