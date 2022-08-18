package pckg.lab2;

//Task#3: Make cash notes counter.

import java.util.Scanner;
public class lab2task3 {
		public static void main(String[] args) {
			int Amount;
			Scanner scan = new Scanner(System.in);
			int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0;
					
		System.out.println("Please enter the amount");
	     Amount= scan.nextInt();
	  
	     while(Amount>0) {
	    	while(Amount>=5000){
	    	 if(Amount>=5000) {
	    		 Amount=Amount-5000;
	    		 a++;
	    	 }}
	    
	     while(Amount>=1000)	{
	   	 if(Amount>=1000) {
			 Amount=Amount-1000;
			 b++;
		 }}
	    
	     while(Amount>=500)	{
	       	 if(Amount>=500) {
	    		 Amount=Amount-500;	
	    		 c++;
	    	 }}
	      
	     while(Amount>=100)	{
	       	 if(Amount>=100) {
	    		 Amount=Amount-100;
	    		 d++;
	    	 }}

	     while(Amount>=50)	{
	       	 if(Amount>=50) {
	    		 Amount=Amount-50;
	    		 e++;
	    	 }}

	     while(Amount>=20)	{
	       	 if(Amount>=20) {
	    		 Amount=Amount-20;
	    		 f++;
	    	 }}

	     while(Amount>=10)	{
	       	 if(Amount>=10) {
	    		 Amount=Amount-10;
	    		 g++;
	    	 }}

	     while(Amount>=5)	{
	       	 if(Amount>=5) {
	    		 Amount=Amount-5;
	    		 h++;
	    	 }}


	     while(Amount>=2)	{
	       	 if(Amount>=2) {
	    		 Amount=Amount-2;
	    		 i++;
	    	 }}

	     while(Amount>=1)	{
	       	 if(Amount>=1) {
	    		 Amount=Amount-1;
	    		 j++;
	    	 }}
	         
	     System.out.println("5000 :  "+a);
	     System.out.println("1000 :  "+b);
	     System.out.println("500 :  "+c);
	     System.out.println("100 :  "+d);
	     System.out.println("50  :  "+e);
	     System.out.println("20  :  "+f);
	     System.out.println("10  :  "+g);
	     System.out.println("5   :  "+h);
	     System.out.println("2   : "+i);
	     System.out.println("1   :  "+j);
	      
		}//starting loop
		}//main 
		}//class
