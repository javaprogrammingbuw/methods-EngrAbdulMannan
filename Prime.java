import java.util.Scanner;


public class Prime {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number ");
		int n =scan.nextInt();
		System.out.println("The number is prime: "+ isPrime( n));
		int doubletteFirst = getPrimeDoublette(n);
		System.out.println("The first doublette after "+n+" is: ("+doubletteFirst+", "+(doubletteFirst+2)+")" );
		
	//todo: write a method isPrime which tells you if a given number is a prime or not
	//then, write another method findDoublette which takes an integer value as input and 
	//is looking for the first prime-doublette it findes. A prime-doublette consists of
	//two prime values with the difference of 2 (e.g. 3 and 5).
	//The function should return the smaller one of the doublette. If there exists no
	//prime doublette between the given parameter and the maximal int-value (Integer.MAX_VALUE)
	//the function should return 0.
		
	
}
	public static boolean isPrime(int n ) {
		for (int i =2; i<n; i++) {
			if( n%i == 0 ) {
				return false;
			}
		}
		
		return true;	
	}
	public static int getPrimeDoublette(int n ) {
		int start = n;
		if( start % 2 == 0 ) {
			start++;
		}
		
		for( int i = start; true; i = i+2 ) {
			if( isPrime(i) && isPrime(i+2) ) {
				return i;
			}
		}
	}
}