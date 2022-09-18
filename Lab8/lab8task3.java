package pckg.Lab8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class lab8task3 {
public static void main(String[] args) throws IOException {
		File file = new File("Write.txt");
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name");
String name=sc.next();
System.out.println("Enter your rollno");
String rollno=sc.next();
	try {
		RandomAccessFile WriteFile = new RandomAccessFile(file, "rw");
		WriteFile.write(name.getBytes());
		WriteFile.write("\n".getBytes());
		WriteFile.write(rollno.getBytes());
	} 
	catch (FileNotFoundException e) {
		e.printStackTrace();
	}
}

}
