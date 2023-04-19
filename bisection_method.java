import java.util.Scanner;

public class bisection_method {
	static double log(double a, double b) { // Tinh logarit a cua b 
		return Math.log(a) / Math.log(b);
	}
	static double f(double x) { // Khoi tao ham f(x)
		double f = Math.pow(2, x) + x - 4;
		return f;
	}
	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		double a, b, e, x;
		// Nhap khoang (a, b)
		System.out.println("Nhap a: "); 
		a = myScan.nextDouble();
		System.out.println("Nhap b: ");
		b = myScan.nextDouble();
		// Nhap sai so mong muon
		System.out.println("Nhap sai so e: ");
		e = myScan.nextDouble();
		myScan.close();
		int n = 0;
		while(!(b - a < e)) {
			x = (a + b) / 2; // gan x la diem nam giua khoang (a,b)
			System.out.printf("%d \t %.10f \t %.10f%n", n, a, b);
			if(f(a)*f(x) > 0) { // cap nhat khoang moi
				a = x;
			} else {
				b = x;
			}
			n++;
		}
	}
}
