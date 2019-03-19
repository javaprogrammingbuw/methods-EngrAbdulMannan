import java.util.Scanner;

public class Circle {
	//todo: add some methods to compute a circle's diameter, circumference and area.
	//print some outputs to confirm you methods are working right.

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a radius of circle ");
		int n =scan.nextInt();
		
		double d=dia(n);
		System.out.println("dia is "+d);
		
		double circumference=circum(n);
		System.out.println("circumference is "+circumference);
		
		double area=area(n);
		System.out.println("Area is "+area);
		
	}
	
	public static double dia(double r) {
		return 2*r;
	}
	
	public static double circum(double r) {
		return Math.PI*2*r;
	}
	
	public static double area(double r) {
		return Math.PI*r*r;
	}
}