public class BlackJack {
	
	public static int play(int a,int b) {
		if(a > b && a <= 21) {
			return a;
		}else if(a < b && b <= 21) {
			return b;
		}
		else if(a == b && b <= 21) {
			return b;
		}else {
			return 0;
		}
	}
}
