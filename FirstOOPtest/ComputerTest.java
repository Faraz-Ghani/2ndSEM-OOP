package pckg.FirstOOPtest;
import java.util.Scanner;
class KeyBoard{
boolean Mechanical;
String Color;

public boolean isMechanical() {
	return Mechanical;
}
public String getColor() {
	return Color;
}
public void setMechanical(boolean mechanical) {
	Mechanical = mechanical;
}
public void setColor(String color) {
	Color = color;
}

public KeyBoard(boolean mechanical, String color) {
	Mechanical = mechanical;
	Color = color;
}

              }//keyboard class close


class Mouse{
 
boolean Optical;
String Color;

public boolean isOptical() {
	return Optical;
}
public String getColor() {
	return Color;
}
public void setOptical(boolean optical) {
	Optical = optical;
}
public void setColor(String color) {
	Color = color;
}

public Mouse(boolean optical, String color) {
	
	Optical = optical;
	Color = color;
}

           }//mouse class close


class HardDisk{
boolean ssd;
String Storage;

public boolean isSsd() {
	return ssd;
}
public String getStorage() {
	return Storage;
}
public void setSsd(boolean ssd) {
	this.ssd = ssd;
}
public void setStorage(String storage) {
	Storage = storage;
}


public HardDisk(boolean ssd, String storage) {
	this.ssd = ssd;
	Storage = storage;
}
             }//harddisk close



class Ram{
String Storage;

public String getStorage() {
	return Storage;
}

public void setStorage(String storage) {
	Storage = storage;
}

public Ram(String storage) {
	Storage = storage;
}
         }//RAM CLOSE


class PC{
	
    KeyBoard keyBoard;
    Mouse mouse;
    HardDisk hardDisk;
    Ram ram;
    String company;
    String generation;
    public void boot(){
        System.out.println("Booting up...");
        System.out.println("Booted up succesfully");
    }
    public void performTask(){
        System.out.println("Performing A task");
        System.out.println("Task performed succesfully");
    }
    public void playVideo(){
        System.out.println("Playing video");
        System.out.println("Video Completed");
    }
    public void shutdown() {
    	System.out.println("Shutting down");
    	System.exit(0);
    }
    public void Specs() {
    	System.out.println("Company = "+this.company);
    	System.out.println("Generation = "+this.generation);
    	System.out.println("Ram = "+this.ram.getStorage());
    	System.out.println("Storage = "+this.hardDisk.getStorage());
    	System.out.println("Ssd = "+this.hardDisk.isSsd());
    	System.out.println("Optical mouse = "+this.mouse.isOptical());
    	System.out.println("Mouse color = "+this.mouse.getColor());
    	System.out.println("Mechanical keyboard = "+this.keyBoard.isMechanical());
    	System.out.println("Keyboard Color = "+this.keyBoard.getColor());
    	
    }

    //Constructor for Pc method


    public PC(KeyBoard keyBoard, Mouse mouse, HardDisk hardDisk, Ram ram, String  company, String generation) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
        this.hardDisk = hardDisk;
        this.ram = ram;
        this.company = company;
        this.generation = generation;
        
        
    }
}

public class ComputerTest {
    public static void main(String[] args) {
    	
    	
    	
    	Scanner sc = new Scanner(System.in);
    	String company,gen;//for computer
    	String input;//for mouse+keyboard
    	boolean Spec;//mouse+storage+keyboard
    	int inputs;
    	
    	System.out.println("Please Enter the company name of the Computer  ");
    	company=sc.next();


    	System.out.println("Please Enter the Generation of the computer  ");
    	gen=sc.next();
    	
    	System.out.println("Is the mouse Optical?(True or False) ");
    	Spec=sc.nextBoolean();
    	
    	System.out.println("Enter the Color of the Mouse ");
    	input=sc.next();
    	
    	Mouse mouse = new Mouse(Spec,input);
        
    	System.out.println("Is the keyboard Mechanical?(True or False) ");
    	Spec=sc.nextBoolean();
    	
    	System.out.println("Enter the color of the keyboard ");
    	input=sc.next();
    	
        KeyBoard keyBoard = new KeyBoard(Spec,input);
        
        System.out.println("Is the Hard Disk an SSD?(True or False) ");
    	Spec=sc.nextBoolean();
    	
    	System.out.println("Enter the amount of memory the HardDisk has (in Gbs) ");
    	input=sc.next();
input.concat(" Gbs");
    	HardDisk hardDisk = new HardDisk(Spec,input);
    	System.out.println("Enter the amount of memory the Ram has (in Gbs) ");
input.concat(" Gbs");
    	input= sc.next();
    	
        Ram ram = new Ram(input);
        
        //objects of Pc class
        PC Computer = new PC(keyBoard,mouse,hardDisk,ram,company,gen);
        
        for(int j=0;j<20;j++) {
       		System.out.println("");
       	}
        Computer.boot();
        
        for(int i=1;i>0;i++) {
        	System.out.println("");
        	System.out.println("");
        	System.out.println("");
           		 
        	
        	 
        	   System.out.println("What would you like to do? ");
               System.out.println("1)Play Video  2)Perform Task 3)ShutDown 4)Specification");
               inputs=sc.nextInt();
               if(inputs==1) {
            	   Computer.playVideo();
               }
               else if(inputs==2) {
            	   Computer.performTask();
               }
               else if(inputs==3) {
            	   Computer.shutdown();
               }

               else if(inputs==4) {
            	   Computer.Specs();
               }
               else {
            	   System.out.println("Invalid input");
               }
            
               
        }
        
    }

}
