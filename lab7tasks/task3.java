package pckg.lab7tasks;

import java.util.Scanner;

class MyException extends Exception
{
 public MyException(String str)
 {
  System.out.println(str);
 }
}

public class task3 {
public static void main(String[] args)throws MyException{
	Scanner sc = new Scanner(System.in);
	int i;
	System.out.println("Input a number");
	i=sc.nextInt();
	
	try{
		if(i<0) {
	}
		throw new MyException("The number is negative");
	}
	catch(MyException e) {
		System.out.println(e);
	}
}
}
