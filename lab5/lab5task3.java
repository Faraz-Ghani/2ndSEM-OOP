package pckg.lab5;

//03.	Create a Student class that stores student data, provides methods for initializing and displaying student data Also provide a parameterized constructor for initializing student class data members.

class Student{
	  private String name;
      private int age;
      private int year;
      private int roll_number;

public void setName(String name) {
	this.name = name;
}
public void setAge(int age) {
	this.age = age;
}
public void setYear(int year) {
	this.year = year;
}
public void setRoll_number(int roll_number) {
	this.roll_number = roll_number;
}

    public void DisplayData() {
    System.out.println("Student name: " + this.name);
    System.out.println("Student age: " + this.age);
    System.out.println("Student year of study: " + this.year);
    System.out.println("Student Roll No: " + this.roll_number);

     }
 
      Student(String name, int age, int year, int rollno) {
              this.name = name;
              this.age = age;
              this.year = year;
              this.roll_number = rollno;
}}
      
      
public class lab5task3 {

	public static void main(String[] args) {
Student s1,s2,s3;
s1 = new Student("Faraz",18,2003,81);
s2 = new Student("Ayush",17,2004,163);
s3 = new Student("Daniyal",19,2002,3);

s1.DisplayData();
s2.DisplayData();
s3.DisplayData();
	}

}

