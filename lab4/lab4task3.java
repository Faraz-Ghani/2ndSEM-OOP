package pckg.lab4;

//Task#3 : Write a java program which check whether a number is prime or not.

import java.util.Scanner;
public class lab4task3 {

	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int m=n/2;
int flag=0;
int i;
if(n==0||n==1){  
	   System.out.println(n+" is not prime number");      
	  }
else{  
	   for(i=2;i<=m;i++){      
	    if(n%i==0){      
	     System.out.println(n+" is not prime number");      
	     flag=1;      
	     break;      
	    }  }      //loop closed
	   if(flag==0)  { System.out.println(n+" is prime number"); }  
	  }
}}	

