package pckg.lab4;

//Task#2 : Write a java program that performs arithmetic operations on two numbers after taking 3 runtime arguments; 1st number, 2nd number and the operators (+, -, /, *) and prints the result.

import java.util.Scanner;
public class lab4task2 {
	
	public static void main(String[] args) {

	    char operator;
	    Double number1, number2, result;

	    // create an object of Scanner class
	    Scanner input = new Scanner(System.in);

	    // ask users to enter operator
	    System.out.println("Choose an operator: +, -, *, %, or /");
	    operator = input.next().charAt(0);

	    // ask users to enter numbers
	    System.out.println("Enter first number");
	    number1 = input.nextDouble();

	    System.out.println("Enter second number");
	    number2 = input.nextDouble();

	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        result = number1 + number2;
	        System.out.println(number1 + " + " + number2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        result = number1 - number2;
	        System.out.println(number1 + " - " + number2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        result = number1 * number2;
	        System.out.println(number1 + " * " + number2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        result = number1 / number2;
	        System.out.println(number1 + " / " + number2 + " = " + result);
	        break;

	      case '%':
	    	  result=number1%number2;
	    	  System.out.println(number1 + " % " + number2 + " = " + result);
	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    input.close();
	  }
	}
