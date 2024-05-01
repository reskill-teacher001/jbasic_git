package kadai7add;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartSystem {
	// 商品情報保存リスト（フィールド） 
	private static List<Item> cart = new ArrayList<Item>();

	// スキャナークラス（フィールド） 
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		int num = -1;

		do {
			System.out.println("1.商品追加");
			System.out.println("2.書籍追加");
			System.out.println("3.情報更新");
			System.out.println("4.カートから削除");
			System.out.println("5.カートを検索");
			System.out.println("6.購入");
			System.out.println("9.終了");
			System.out.println();

			System.out.print("メニューを選択してください：");
			num = scan.nextInt();

			switch (num) {
			case 1:
				addItem();
				break;
			case 2:
				addBook();
				break;
			case 3:
				editInfo();
				break;
			case 4:
				deleteInfo();
				break;
			case 5:
				searchInfo();
				break;
			case 6:
				purchaseItem();
				break;
			}
		} while (num != 9);

	}

	//商品追加メソッド
	public static void addItem() {
		System.out.println("商品をカートに追加します");

		System.out.print("商品名を入力してください：");
		String name = scan.next();

		System.out.print("価格を入力してください：");
		int price = scan.nextInt();

		cart.add(new Item(name, price));
		displayCart();
	}

	//書籍追加メソッド
	public static void addBook() {
		System.out.println("書籍をカートに追加します");

		System.out.print("書籍名を入力してください：");
		String name = scan.next();

		System.out.print("著者を入力してください：");
		String author = scan.next();

		System.out.print("価格を入力してください：");
		int price = scan.nextInt();

		cart.add(new Book(name, price, author));
		displayCart();
	}

	//情報更新メソッド
	public static void editInfo() {
		System.out.println("情報を更新します");

		Item hit = null;

		System.out.print("No.を入力してください：");
		int no = scan.nextInt();

		try {
			hit = cart.get(no - 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("選択されたNo.はありません");
			displayCart();
			return;
		}

		if (hit instanceof Book) {
			Book b = (Book) hit;

			System.out.print("書籍名を入力してください（現在：" + b.getName() + "）：");
			String name = scan.next();

			System.out.print("著者を入力してください（現在：" + b.getAuthor() + "）：");
			String author = scan.next();

			System.out.print("価格を入力してください（現在：" + b.getPrice() + "）：");
			int price = scan.nextInt();

			b.setName(name);
			b.setPrice(price);
			b.setAuthor(author);

		} else if (hit instanceof Item) {
			System.out.print("商品名を入力してください（現在：" + hit.getName() + "）：");
			String name = scan.next();

			System.out.print("価格を入力してください（現在：" + hit.getPrice() + "）：");
			int price = scan.nextInt();

			hit.setName(name);
			hit.setPrice(price);
		}

		displayCart();
	}

	//情報削除メソッド
	public static void deleteInfo() {
		System.out.println("カートから削除します");

		Item hit = null;

		System.out.print("No.を入力してください：");
		int no = scan.nextInt();

		try {
			hit = cart.get(no - 1);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("選択されたNo.はありません");
			displayCart();
			return;
		}
		
		if (hit != null) {
			cart.remove(no - 1);
		}

		displayCart();
	}

	//情報検索メソッド
	public static void searchInfo() {
		System.out.println("カートを検索します");
		
		System.out.print("検索キーワードを入力してください：");
		String keyword = scan.next();
		
		displayCart(keyword);
	}
	
	//商品こうメソッド
	public static void purchaseItem() {
		int total = 0;
		
		for (Item i : cart) {
			total += i.getPrice();
		}
		
		System.out.println("＊＊＊合計金額は" + total + "円です＊＊＊");
		
		cart.clear();
		
		displayCart();
	}
	
	//カートの中を表示するメソッド
	public static void displayCart() {
		int no = 1;

		System.out.println("No.\t商品情報");
		System.out.println("----------------------------------");

		for (Item i : cart) {
			System.out.println(no++ + "\t" + i.getInfo());
		}

		System.out.println("----------------------------------");
		System.out.println();
	}

	public static void displayCart(String keyword) {
		System.out.println("商品情報");
		System.out.println("----------------------------------");

		for (Item i : cart) {
			String name = i.getName();
			String author = null;
			
			if (i instanceof Book) {
				Book b = (Book)i;
				
				author = b.getAuthor();
			}
			
			if (name.indexOf(keyword) != -1) {
				System.out.println(i.getInfo());
			} else if (author != null && author.indexOf(keyword) != -1) {
				System.out.println(i.getInfo());
			}
		}

		System.out.println("----------------------------------");
		System.out.println();
	}

}
