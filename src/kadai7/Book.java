package kadai7;

public class Book extends Item {
	//フィールド
	private String author; //著者
	
	//コンストラクタ
	public Book() {
		
	}
	
	public Book(String name, int price, String author) {
		super(name, price);
		
		this.author = author;
	}

	//セッタ＆ゲッタ	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	//showInfoメソッド
	public void showInfo() {
		super.showInfo();
		
		System.out.println("著　者：" + author);
	}
}
