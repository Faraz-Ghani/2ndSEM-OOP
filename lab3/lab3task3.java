package pckg.lab3;

//Task#3: Get input of a number and the starting and ending point of its table and then print said table.

import java.util.Scanner;
public class lab3task3 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
   int start,end,tables;
System.out.print("Enter starting point : ");
start =sc.nextInt();
System.out.println();
System.out.print("Enter ending : ");
end =sc.nextInt();
System.out.println();
System.out.print("Enter number : ");
tables =sc.nextInt();
System.out.println();
for( ;start<=end;start++){
System.out.println(tables + " * " + start + " = " + start*tables);
}}}

