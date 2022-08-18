package pckg.lab1;

//Task#2: Separate factorial and integral part of a number.

import java.util.Scanner;
public class lab1task2 {
	public static void main(String[] args) {
	double a=0;
	int b=0;
		Scanner scan = new Scanner(System.in);
	System.out.println("Enter double");
		a=scan.nextDouble();
	b=(int)a;
	a=a-b;
	System.out.println("Integral part "+b);
	System.out.println("Fractional part "+a);
	
	}
	
}

