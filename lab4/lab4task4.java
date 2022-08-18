package pckg.lab4;

//Task#4: Write a java program that takes five subjects marks of a student and calculate their percentage and grade.

import java.util.Scanner;
public class lab4task4 {
public static void main(String[] args) {
	float[] marks = {0,0,0,0,0};
	float percentage=0;
	String grade="";
	
	Scanner scan = new Scanner(System.in);
	int count;
for(int i=0;i<5;i++) {count=i+1;
	System.out.println("Input marks of "+count+"th subject ");
	marks[i]=scan.nextFloat();
	if(marks[i]>100) {
		System.out.println("Marks must be under 100");
		i--;
	}
}	
for(int i=0;i<5;i++) {
	percentage+=marks[i];
}
percentage=percentage/5;


for(int i=1;i<6;i++) {
if(percentage>0)
{
	if(percentage>50) {
		if(percentage>60) {
			if(percentage>75) {
				if(percentage>85) {
					if(percentage>95) {
						grade="A+";
						continue;
					}
					grade="A";
					continue;
				}
				grade="B+";
				continue;
			}
			grade="B";
			continue;
		}
		grade="C+";
		continue;
	}
	grade="C";
	continue;
}
grade="F";
continue;
	
}	
System.out.println("The percentage of student is "+percentage+"%");

System.out.println("The grade of student is "+grade);
}
}
