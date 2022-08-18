package pckg.lab6;
//03.	Develop a java program that takes 5 floating numbers as runtime arguments and print their total sum and average.
public class Lab6Task3 {
public static void main(String[] args) {
	float f1,f2,f3,f4,f5;
	f1=Float.parseFloat(args[0]);
	f2=Float.parseFloat(args[1]);
	f3=Float.parseFloat(args[2]);
	f4=Float.parseFloat(args[3]);
	f5=Float.parseFloat(args[4]);
	float sum,avg;
	sum=f1+f2+f3+f4+f5;
	avg=sum/5;
	System.out.println("The Sum of the 5 Float inputs is : "+sum);
	System.out.println("The Average of the 5 Float inputs is : "+avg);
}
}
