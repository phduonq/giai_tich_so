import java.util.Scanner;

public class bisection_method {
	static double log(double a, double b) { // tinh logarit a cua b 
		return Math.log(a) / Math.log(b);
	}
	static double f(double x) {
		double f = Math.pow(2, x) + x - 4;
		return f;
	}
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		double a, b, e, x;
		System.out.println("Nhap a: ");
		a = myScan.nextDouble();
		System.out.println("Nhap b: ");
		b = myScan.nextDouble();
		System.out.println("Nhap sai so e: ");
		e = myScan.nextDouble();
		myScan.close();
		int n = 0;
		while(!(b - a < e)) {
			x = (a + b) / 2;
			System.out.printf("%d %f %f%n", n, a, b);
			if(f(a)*f(x) > 0) {
				a = x;
			} else {
				b = x;
			}
			n++;
		}
	}
}
