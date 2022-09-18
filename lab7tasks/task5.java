package pckg.lab7tasks;

import java.util.Scanner;

class InvalidPasswordFormatException extends Exception{

	InvalidPasswordFormatException(String str){
		System.out.println(str);
	}
}

public class task5 {

	public static void main(String[] args) {
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please input your password(More than 8 characters and no asteriks'*')");
		str= sc.next();
		try {
			
		
		if(str.length()<8 || str.indexOf('*')!=-1) {
			throw new InvalidPasswordFormatException("Invalid password format");
		}
		}
		catch(InvalidPasswordFormatException e) {
			System.out.println(e);
		}
		
	}

}
