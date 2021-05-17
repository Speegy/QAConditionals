
public class MathMethods extends Conditionals {
	
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub(int a,int b) {
		return a-b;
	}
	public static int mult(int a,int b) {
		return a*b;
	}
	public static double div(double a,double b) {
		if(a > b) {
			return a/b;
		}else {
			System.out.print("Can't divide a smaller number");
		}
		return 0;
	}
}
