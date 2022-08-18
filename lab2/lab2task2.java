package pckg.lab2;

//Task#2: Take radius of three circles as input and find the circumference, diameter and the area of those circles.

import java.util.Scanner;
public class lab2task2 {
	public static void main(String[] args)
	{
		double r1=0,r2=0,r3=0,dia,cir,area;
		//int c1=0,c2=0,c3=0,d1=0,d2=0,d3=0,a1=0,a2=0,a3=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input radius of first circle");
		r1=scan.nextInt();
		System.out.println("Input radius of second circle");
		r2=scan.nextInt();
		System.out.println("Input radius of third circle");
		r3=scan.nextInt();

		cir=2*3.142*r1;
		dia=2*r1;
		area=3.142*r1*r1;
		System.out.println("Circumfrence of first circle is "+cir);
		System.out.println("Diameter of first circle is "+dia);
		System.out.println("Area of first circle is "+area);
		
		cir=2*3.142*r2;
		dia=2*r2;
		area=3.142*r2*r2;
		System.out.println("Circumfrence of second circle is "+cir);
		System.out.println("Diameter of second circle is "+dia);
		System.out.println("Area of first second is "+area);
		
		cir=2*3.142*r3;
		dia=2*r3;
		area=3.142*r3*r3;
		System.out.println("Circumfrence of third circle is "+cir);
		System.out.println("Diameter of third circle is "+dia);
		System.out.println("Area of third circle is "+area);
		

	}

}
