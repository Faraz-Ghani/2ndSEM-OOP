package pckg.lab6;

//  02.Write a java program to demonstrate the concept of java runtime arguments.
//  Input your name and roll number and print it on the console.
public class Lab6Task2 {

	public static void main(String[] args) {
		//(Java Lab7Task2 (arg0)(arg1)) arg0 is the first runtime argument and arg1 is the second runtime argument
		
    String Rollno,Name;
    Name=args[0];//we take the first string runtime argument (Java Lab7Task2 (arg0)) as Name.
    Rollno=args[1];//we take the Second string runtime argument (Java Lab7Task2 (arg1)) as Rollno.
    System.out.println("Your Name is "+Name);
    System.out.println("Your Rollno is "+Rollno);
    
	}

}
