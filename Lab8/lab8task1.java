package pckg.Lab8;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class lab8task1 {
	  public static void main( String[] args ) throws IOException, ParseException
	  {
		  JSONObject Student = new JSONObject();
	  	  Student.put("Name", "Faraz");
	  	Student.put("Age", "18");
	  	Student.put("Dept", "Software");
	      
	      
	      FileWriter file = new FileWriter("Student.json");
	      file.write(Student.toString());
	      file.close();
	      
	      Object obj = new JSONParser().parse(new FileReader("Student.json"));
	      
	      JSONObject read = (JSONObject) obj;
	      
	      System.out.println((String) read.get("Name"));
	    System.out.println((String) read.get("Dept"));
	  }
}
