package p34;

public class Sample02 {

	public static void main(String[] args) {
		try {
			throw new MyException("Error!!!");
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
	}

}
