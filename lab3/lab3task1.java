package pckg.lab3;
//Task#1 : Print even and odd numbers. 
import java.util.Scanner;
public class lab3task1 {
	public static void main(String[] args) {
		int i=0;
		int n=0;
		int num=0;
		System.out.println("Input amount of even and odd numbers you need");
		Scanner SC =new Scanner(System.in);
		n=SC.nextInt();
		System.out.println("Even");
		num=0;
		while(n>i) {
			num=num+2;
			System.out.print(num + ",");
			i++;}
		System.out.println();
		System.out.println("Odd");
		num=-1;
		i=0;
		while(n>i) {
			num=num+2;
			System.out.print(num + ",");
	i++;	}
}}
