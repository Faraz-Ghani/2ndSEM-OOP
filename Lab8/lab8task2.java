package pckg.Lab8;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class lab8task2 {
public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Reading from first line");
	 try {
	 BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
	 System.out.println(reader.readLine());
	 reader.close();
	 }
		catch (IOException e) {
			e.printStackTrace();
		}	 

	 String Input=sc.next();
	 System.out.println("Writing to the line");
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	writer.append("\n"+Input);
	writer.close();
	System.out.println("Input has been written");
	}
	catch (IOException e) {
		e.printStackTrace();
	} 

	sc.close();
}
}
