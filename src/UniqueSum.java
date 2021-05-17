public class UniqueSum {
	public static int numSum(int a, int b, int c) {
		int sum = 0;
		if(a != b && a != c) {sum += a;}
		if(a != b && c != b) {sum += b;}
		if(a != c && c != b) {sum += c;}
		return sum;
	}
}
