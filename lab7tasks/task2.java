package pckg.lab7tasks;
import java.util.Scanner;



public class task2 {

	public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
		int i[]= {0,1,2,3,4};
		int a = 0, b = 0 ;
        String str=null;
		int input;
	  
        //arithmetic
        System.out.println("Input the numbers you want to divide with eachother");
	  a=sc.nextInt();
	  b=sc.nextInt();
		if(b==0) {
			 throw new ArithmeticException("cannot divide by 0"); 
		}
		else {
			System.out.println((float)a/b);
		}
	
		
		//ArrayIndexOutOfBond
		System.out.println("Input the index of the number you want to check");
	    input=sc.nextInt(); 
		if(input>=i.length) {
			throw new ArrayIndexOutOfBoundsException ("The input is out of bounds");
		}
		else {
			System.out.println(i[input]);
			}
	  
		
		//NullPointerException
		if(str==null) {
			throw new NullPointerException("The string is empty");
		}
		else {
			System.out.println(str);
		}
	   }
	
}
