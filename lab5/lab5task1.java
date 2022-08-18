package pckg.lab5;

//01.	Create a class having 4 functions, add, sub, mul and div. Each function accepts 2 parameters and returns the sum, difference, multiplication
// and division of these numbers.Create a main class having main function that uses the above class.

import java.util.Scanner;
class Functions{
	
	public double sum(double a,double b) {
		return a+b;
	}

	public double mult(double a,double b) {
		return a*b;
	}
	
	public double sub(double a,double b) {
		return a-b;
	}
	
	public double div(double a,double b) {
		return a/b;
	}}

public class lab5task1 {
	
public static void main (String[] args) {
	Scanner s = new Scanner(System.in);
	Functions func = new Functions();
	double a, b;
	String op;
	System.out.println("Enter a number :");
    a = s.nextDouble();
    System.out.println("Enter another number : ");
    b = s.nextDouble();
    System.out.println("Enter the operation (+ , - , * , /) :");

    op=s.next();
    switch(op)    {
    case "+":
    	System.out.println("The Sum of "+a+" and "+b+" is "+func.sum(a, b));
    	break;

    case "-":
        System.out.println("The Subtraction of "+a+" and "+b+" is "+func.sub(a, b));
        break;

    case "*":
     	System.out.println("The Multiplication of "+a+" and "+b+" is "+func.mult(a, b));
      	break;
      

     case "/":
        System.out.println("The Division of "+a+" and "+b+" is "+func.div(a, b));
        break;
        	
     default:
    	 System.out.println("Invalid input");
    	 break;
    }}}	

