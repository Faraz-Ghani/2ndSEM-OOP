package pckg.lab7tasks;

import java.util.Scanner;
import java.lang.Exception;
class exp extends Exception{
	private void eligible(){
		System.out.println("User is eligible");
	}
	
	private void noteligible(){
		System.out.println("User is not eligible");
	}

	exp(int a){
		
		 if(a<18) {
			this.noteligible();
		}
		 else if(a>=18) {
			this.eligible();	
			}
	}
}

public class task4 {
 public static void main(String[] args) {
int age;

Scanner sc = new Scanner(System.in);
	System.out.println("Enter your age"); 
	age = sc.nextInt();
	 
	try {
		throw new exp(age);
		
	}
	catch(exp e){
		System.out.println(e);
	}//catch close
		
	
	
	
 }}

