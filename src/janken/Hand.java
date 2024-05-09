package janken;

public enum Hand {
	GU(1, "グー") {
		@Override
		public void check(Hand com) {
			System.out.println("あなたは" + GU.type + "！");
			System.out.println("コンピュータは" + com.type + "！");
			
			String result = com.no == 1 ? "引き分けでした" : (com.no == 2 ? "あなたの勝ち" : "あなたの負け");
			System.out.println(result);
		}
	},
	
	CHOKI(2, "チョキ") {
		@Override
		public void check(Hand com) {
			System.out.println("あなたは" + CHOKI.type + "！");
			System.out.println("コンピュータは" + com.type + "！");
			
			String result = com.no == 2 ? "引き分けでした" : (com.no == 3 ? "あなたの勝ち" : "あなたの負け");
			System.out.println(result);
		}
	},
	
	PAR(3, "パー") {
		@Override
		public void check(Hand com) {
			System.out.println("あなたは" + PAR.type + "！");
			System.out.println("コンピュータは" + com.type + "！");
			
			String result = com.no == 3 ? "引き分けでした" : (com.no == 1 ? "あなたの勝ち" : "あなたの負け");
			System.out.println(result);
		}
	};
	
	int no;
	String type;
	
	private Hand(int no, String type) {
		this.no = no;
		this.type = type;
	}
	
	public abstract void check(Hand com);
	
}
