
import java.util.Formatter;
import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of a circle");
		int r = sc.nextInt();
		sc.close();
		double pi = 3.14;
		double S = 2 * pi * r;
		
		Formatter f = new Formatter();
		f.format("%.2f", S);
		System.out.println("The Area Of Circle is " + f);
		f.close();
	}
}

